package max;

import java.util.Scanner;

public class max3 {
	
	static int max3a(int x, int y, int z) {
		int max = x;
		if(y>max) {
			max=y;
		} else if(z>max){
			max=z;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// 3���� �������� �Է��ϰ� �ִ밪�� ����
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ밪�� ���մϴ�.");
		System.out.println("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.println("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.println("c�� �� : ");
		int c = stdIn.nextInt();
		stdIn.close();
		int max = a;
		if(b>max) {
			max = b;
		} else if (c > max) {
			max = c;
		}
		System.out.println("�ִ밪�� "+ max+"�Դϴ�.");
		
		System.out.println("---------");
		System.out.println("max3(3,1,2) = "+max3a(3,1,2)); //3
		
		
	}

}
