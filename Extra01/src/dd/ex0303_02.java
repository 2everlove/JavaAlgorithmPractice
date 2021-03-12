package dd;

import java.util.Scanner;

public class ex0303_02 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String[] title= {"국어","영어","수학" };
		String[] name = new String[10];
		int[][] score = new int[10][4]; //����,����,����,�հ�
		int[] rank = new int[10];
		/*
			score.length=10; 행
			score[i].length=4; 열
		*/
		
		double[] avg = new double[10];
		int sum=0;		  //점수합계
		int choice=0;    //선택번호
		int stu_Count=0; //입력 학생 수
		
		loop1:while(true) {
			System.out.println("[　학생성적 관리 프로그램 ]");
			System.out.println("1.학생입력");
			System.out.println("2.학생출력");
			System.out.println("3.학생수정");
			System.out.println("4.등수처리");
			System.out.println("5.학생삭제");
			System.out.println("6.프로그램 종료");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = sc.nextInt(); //1 enter키
			sc.nextLine();
			switch (choice) {
			case 1: //입력
				
				//학생 성적 입력 메서드 호출
				Stu_manager s = new Stu_manager();
				stu_Count = s.score_input(stu_Count, score, name, title, avg);
				
				/*for(int i=stu_Count;i<score.length;i++) {
					System.out.println("학생의 이름을 입력하세요.(0.이전화면으로 이동)>>");
					String name_temp = sc.nextLine(); // 홍 길동
					if(name_temp.equals("0")) {
						break;
					}
					name[i] = name_temp;
					for(int j=0;j<score[i].length-1;j++) {
						System.out.println(title[j]+" 점수를 입력하세요.>>");
						score[i][j] = sc.nextInt(); 
						sum = sum + score[i][j];
						sc.nextLine();
					}
					score[i][3] = sum; 
					avg[i] = sum/3.0;
					stu_Count++;
				}
				*/
				break;
			case 2: //출력
				for(int i=0;i<stu_Count;i++) {
					System.out.print(name[i]+" ");
					for(int j=0;j<score[i].length;j++) {
						System.out.print(score[i][j]+" ");
					}
					System.out.printf("%.2f",avg[i]);
					System.out.print("\t"+rank[i]);
					System.out.println();
				}
				break;
			case 3: //수정
				System.out.println("수정하고 하는 학생이름을 입력하세요.");
				String name_temp = sc.next();
				sc.nextLine();
				int search_temp =-1;
				for(int i=0;i<stu_Count;i++) {
					if(name[i].equals(name_temp)) {
						search_temp = i;
						break;
					}
				}
				
				if(search_temp==-1) {
					System.out.println("찾는 학생이 없습니다. 다시 입력하세요.");
				} else {
					System.out.println(name[search_temp]+" 학생 정보를 찾았습니다.!");
					System.out.println("[ 과목선택 ]");
					System.out.println("1.국어");
					System.out.println("2.영어");
					System.out.println("3.수학");
					System.out.println("원하는 과목을 선택하세요.>>");
					choice = sc.nextInt();
					
					switch (choice) {
					case 1:
						//국어 점수 수정
						score_modify(choice-1 ,search_temp, score, avg, title);
						
						break;
					case 2:
						
						score_modify(choice-1 ,search_temp, score, avg, title);
						
						break;
					case 3:
						
						score_modify(choice-1 ,search_temp, score, avg, title);
						
						break;

					default:
						break;
					}
					
					
				}
				
				break;
			case 4: //등수처리
				for(int i=0; i<rank.length;i++) {
					int count=1;
					for(int j=0;j<rank.length;j++) {
						if(score[i][3]<score[j][3]) {
							count++;
						}
					}
					rank[i]=count; //등수입력
				}
				break;
			case 5: //삭제
				
				break;
			case 6: //종료
				System.out.println("프로그램 종료합니다.!");
				break loop1;
				
			default:
				break;
			}
			
		}//while
		
		
		
		
		
		
	}//main
	
	//subject,search_temp,score,avg
	public static void score_modify(int subject ,int search_temp, int[][] score, double[] avg, String[] title) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("현재"+title[subject]+"점수 : "+score[search_temp][subject]);
		System.out.println("수정할 점수를 입력하세요.>>");
		score[search_temp][subject]=sc.nextInt();
		for(int i=0;i<3;i++) {
			sum = sum + score[search_temp][i]; //국어,영어,수학 더하기
		}
		score[search_temp][3] = sum;
		avg[search_temp] = sum/3.0;
		sc.nextLine();
	}
	
	
}

	
