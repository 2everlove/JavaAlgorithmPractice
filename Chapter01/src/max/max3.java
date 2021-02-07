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
		// 3개의 정수값을 입력하고 최대값을 구함
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.println("c의 값 : ");
		int c = stdIn.nextInt();
		stdIn.close();
		int max = a;
		if(b>max) {
			max = b;
		} else if (c > max) {
			max = c;
		}
		System.out.println("최대값은 "+ max+"입니다.");
		
		System.out.println("---------");
		System.out.println("max3(3,1,2) = "+max3a(3,1,2)); //3
		
		
	}

}
