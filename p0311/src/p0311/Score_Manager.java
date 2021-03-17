package p0311;

import java.util.ArrayList;
import java.util.Scanner;

public class Score_Manager {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<StuScoreBean> list = new ArrayList<StuScoreBean>();
		String name="";
		int kor,eng,math=0;
		
		//메인메뉴 반복
		loop1:while(true) {
			top_print(); //상단 출력
			int choice = sc.nextInt(); //메뉴 선택
		
			switch (choice) {
			case 1:
				while(true) {
					//학생이름, 국,영,수,
					System.out.println("(현재 성적입력 인원 : "+list.size()+")");
					System.out.println("학생 이름을 입력하세요.(0.이전화면으로 이동)>>");
					name = sc.next();
					if(name.equals("0")) {
						System.out.println("이전화면으로 이동합니다.!!");
						break;
					}
					System.out.println("국어 성적을 입력하세요.>>");
					kor = sc.nextInt();
					System.out.println("영어 성적을 입력하세요.>>");
					eng = sc.nextInt();
					System.out.println("수학 성적을 입력하세요.>>");
					math = sc.nextInt();
					list.add(new StuScoreBean(name, kor, eng, math));
				}
				break;
			case 2: //성적 출력
				for(int i=0; i<list.size(); i++) {
					StuScoreBean s = list.get(i);
					System.out.print(s.getStu_num()+"\t");
					System.out.print(s.getName()+"\t");
					System.out.print(s.getKor()+"\t");
					System.out.print(s.getEng()+"\t");
					System.out.print(s.getMath()+"\t");
					System.out.print(s.getTotal()+"\t");
					System.out.printf("%.2f \t",s.getAvg());
					System.out.print(s.getRank()+"\t");
					System.out.println();
				}
				break;
			case 3: //학생수정
				System.out.println("수정하고자 하는 학생의 학번을 입력하세요.>>");
				int stu_num_search = sc.nextInt();
				for(int i=0;i<list.size();i++) {
					StuScoreBean s = list.get(i);
					if(stu_num_search==s.getStu_num()) {
						System.out.printf("%d번 학생의 %s 학생이 검색되었습니다.",stu_num_search,s.getName());
						System.out.println("[ 과목선택 ]");
						System.out.println("1.국어점수");
						System.out.println("2.영어점수");
						System.out.println("3.수학점수");
						System.out.println("번호를 선택하세요.(0.이전화면으로 이동)>>");
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							scoreModify(s);
						case 2:
							System.out.println("현재 영어점수 : "+s.getEng());
							System.out.println("영어점수를 입력하세요>>");
							int input_score = sc.nextInt();
							s.setEng(input_score);
							s.setTotal(s.getKor()+s.getEng()+s.getMath());
							s.setAvg(s.getTotal()/3);
							System.out.println("저장되었습니다.");
							break;
						case 3:
							System.out.println("현재 수학점수 : "+s.getMath());
							System.out.println("수학점수를 입력하세요>>");
							input_score = sc.nextInt();
							s.setMath(input_score);
							s.setTotal(s.getKor()+s.getEng()+s.getMath());
							s.setAvg(s.getTotal()/3);
							System.out.println("저장되었습니다.");
							break;
						case 0:
							System.out.println("이전화면으로 이동합니다.");
							break;

						default:
							break;
						}//switch
						break;
					}//if
					
				}//for
				break;
			case 4: //등수처리
				int input1,input2=0;
				StuScoreBean s1,s2=null;
				for(int i=0; i<list.size(); i++) {
					int count=1;
					s1 = list.get(i);
					for(int j=0;j<list.size();j++) {
						s2=list.get(i);
						if(s1.getTotal()<s2.getTotal()) 
							count++;					
					}
					s1.setRank(count);
				}
				System.out.println("등수처리 되었습니다.!");
				break;
			case 5:
				
				break;
			case 6://학생검색
				System.out.println("[ 학생성적 검색 ]");
				System.out.println("1.학번으로 검색");
				System.out.println("2.이름으로 검색");
				System.out.println("원하는 번호를 입력하세요.");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("학번을 입력하세요.(ex. s1,s2)");
					stu_num_search = sc.nextInt();
					for(int i=0;i<list.size();i++) {
						StuScoreBean s = list.get(i);
						if(stu_num_search==s.getStu_num()) {
							System.out.print(s.getStu_num()+"\t");
							System.out.print(s.getName()+"\t");
							System.out.print(s.getKor()+"\t");
							System.out.print(s.getEng()+"\t");
							System.out.print(s.getMath()+"\t");
							System.out.print(s.getTotal()+"\t");
							System.out.printf("%.2f \t",s.getAvg());
							System.out.print(s.getRank()+"\t");
							System.out.println();
						}
					}
					break;
				case 2:
					System.out.println("이름을 입력하세요.(ex. 홍길동)");
					String stu_name_search = sc.next();
					search(list,stu_name_search);
					break;

				default:
					break;
				}
				break;
			case 7:
				
				break;
			default:
				break;
			}//swithc
		}//while:loop1
		
		
		
		
		
		}//main
	
	//상단 출력
	public static void top_print() {
		System.out.println("[　학생성적 관리 프로그램 ]");
		System.out.println("1.학생입력");
		System.out.println("2.학생출력");
		System.out.println("3.학생수정");
		System.out.println("4.등수처리");
		System.out.println("5.학생삭제");
		System.out.println("6.학생검색");
		System.out.println("7.프로그램 종료");
		
		System.out.println("원하는 번호를 입력하세요.>>");
	}//
	
	//검색
	public static void search(ArrayList<StuScoreBean> list, String stu_name_search) {
		for(int i=0;i<list.size();i++) {
			StuScoreBean s = list.get(i);
			if(s.getName().contains(stu_name_search)) { //위치에 따라 결과값이 바뀌므로 코딩주의
				System.out.print(s.getStu_num()+"\t");
				System.out.print(s.getName()+"\t");
				System.out.print(s.getKor()+"\t");
				System.out.print(s.getEng()+"\t");
				System.out.print(s.getMath()+"\t");
				System.out.print(s.getTotal()+"\t");
				System.out.printf("%.2f \t",s.getAvg());
				System.out.print(s.getRank()+"\t");
				System.out.println();
			}
		}
	}//
	
	//수정
	public static void scoreModify(StuScoreBean s) {
		System.out.println("현재 국어점수 : "+s.getKor());
		System.out.println("국어점수를 입력하세요>>");
		int input_score = sc.nextInt();
		s.setKor(input_score);
		s.setTotal(s.getKor()+s.getEng()+s.getMath());
		s.setAvg(s.getTotal()/3);
		System.out.println("저장되었습니다.");
	}
	
}//class
