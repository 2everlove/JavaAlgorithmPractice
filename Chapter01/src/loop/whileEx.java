package loop;

import java.util.Scanner;

public class whileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		int n = stdIn.nextInt();
		
		int sum=0;
		int i=1;
		
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
		stdIn.close();
	}

}
