import java.util.Scanner;

public class Ex0302_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] title= {"����","����","����" };
		String[] name = new String[3];
		int[][] num = new int[3][4]; //����,����,����,�հ�
		double[] avg = new double[3];
		int sum=0;
		
		
		for(int i=0;i<num.length;i++) {
			System.out.println("�̸��� �Է��ϼ���. >>");
			name[i] = sc.nextLine(); // ȫ �浿(enter)
			
			for(int j=0;j<num.length;j++) {
				System.out.println(title[j]+" ������ �Է��ϼ���.>>");
				num[i][j] = sc.nextInt(); //100 enterŰ
				sum = sum + num[i][j];
			}
			num[i][3] = sum; //�迭 4��°�� �հ� ����
			avg[i] = sum/3.0;
			
			sc.nextLine();
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.print(name[i]+" ");
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.printf("%.2f",avg[i]);
			System.out.println();
		}
	
	}
}//class
