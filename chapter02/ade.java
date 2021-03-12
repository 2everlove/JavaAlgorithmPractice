import java.util.Scanner;

public class ade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String[] title= {"국어","영어","수학" };
		String[] name = new String[3];
		int[][] num = new int[3][4]; //����,����,����,�հ�
		double[] avg = new double[10];
		int sum=0;
		int choice=0;
		int stu_Count=0
		
		loop1:while(true) {
			System.out.println("[　학생성적 관리 프로그램 ]");
			System.out.println("1.학생입력");
			System.out.println("2.학생출력");
			System.out.println("3.학생수정");
			System.out.println("4.등수처리");
			System.out.println("5.학생삭제");
			System.out.println("6.프로그램 종료");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				//입력
				for(int i=0;i<num.length;i++) {
					System.out.println("학생의 이름을 입력하세요.>>");
					name[i] = sc.nextLine(); // ȫ �浿(enter)
					
					for(int j=0;j<num.length;j++) {
						System.out.println(title[j]+" 점수를 입력하세요.>>");
						num[i][j] = sc.nextInt(); //100 enterŰ
						sum = sum + num[i][j];
					}
					num[i][3] = sum; //�迭 4��°�� �հ� ����
					avg[i] = sum/3.0;
				}
				break;
			case 2:
				for(int i=0;i<num.length;i++) {
					System.out.print(name[i]+" ");
					for(int j=0;j<num[i].length;j++) {
						System.out.print(num[i][j]+" ");
					}
					System.out.printf("%.2f",avg[i]);
					System.out.println();
				}
				break;
			case 3: //수정
				
				break;
			case 4: //등수처리
				for(int i=0; i<rank.length;i++) {
					int cont=1;
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
		
		
		
		
		
		
	}
}
