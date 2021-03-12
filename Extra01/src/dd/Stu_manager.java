package dd;

import java.util.Scanner;

public class Stu_manager {
	
	public static Scanner sc = new Scanner(System.in);
	
	//1. 학생성적입력
	public int score_input(int stu_Count, int[][] score, String[] name, String[] title, double[] avg) {
		int sum=0;
		for(int i=stu_Count;i<score.length;i++) {
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
		}//for
		return stu_Count;
	}//score_input
	
	
	
	
}//class
