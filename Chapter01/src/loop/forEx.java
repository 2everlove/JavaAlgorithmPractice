package loop;

import java.util.Scanner;

public class forEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
		stdIn.close();
	}

}
