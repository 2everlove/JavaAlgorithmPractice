package loop;

import java.util.Scanner;

public class dowhile2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("b�� a�� ���� ���մϴ�.");
		int a,b,sub;
		System.out.println("a�� �� : ");
		a = stdIn.nextInt();
		do {
			System.out.println("b�� �� : ");
			b = stdIn.nextInt();
		} while(!(b > a));
		sub = b-a;
		System.out.println("b-a�� "+sub+"�Դϴ�");
		stdIn.close();
	}

}
