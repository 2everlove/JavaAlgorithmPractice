package chap05;

import java.util.Scanner;

public class Hanoi {
	
	static void move(int no, int x, int y) {
		if(no > 1)
			move(no - 1, x, 6 - x - y);
		
		System.out.println("원반["+no+"]을 "+x+"기둥에서 "+y+"기둥으로 옮김");
		
		if(no > 1)
			move(no - 1, 6 - x - y, y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Towers of Hanoi");
		System.out.print("Number of circle :");
		int n = stdIn.nextInt();
		
		move(n, 1, 3);
	}

}
