package chap04;

import java.util.Scanner;

//example of int type's stack
public class IntStackTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64); //stack which can push max 64
		
		while(true) {
			System.out.println("현재 데이터 수"+s.size()+" / "+s.capacity());
			System.out.print("(1)push	(2)pop	(3)peak	(4)dump	(5)exit");
			
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
				case 1:	//push
					System.out.print("data: ");
					x=stdIn.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("stack is full");
					}
					break;
				case 2:	//peak
					try {
						x=s.pop();
						System.out.println("data of pop "+x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("stack is empty");
					}
					break;
				case 3:	//peak
					try {
						x=s.peak();
						System.out.println("data of peak "+x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("stack is empty");
					}
					break;
				case 4:	//dump
					s.dump();
					break;
			}
		}
	}

}
