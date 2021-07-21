package chap04;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64); //max 64 of queue
		
		while(true) {
			System.out.println("number of data: "+s.size() + " / "
													+s.capacity());
			System.out.print("(1)EnQueue  (2)DeQueue  (3)Peek  (4)Dump  (0)Exit : ");
			
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			int x;
			
			switch(menu) {
				case 1:	//EnQueue
					System.out.print("Data: ");
					x = stdIn.nextInt();
					try {
						s.enque(x);
					} catch (Exception e) {
						System.out.println("Queue is full");
					}
					break;
				case 2:	//DeQueue
					try {
						x = s.deque();
						System.out.println("data of deque is " + x);
					} catch (Exception e) {
						System.out.println("Queue is empty");
					}
					break;
				case 3:	//Peek
					try {
						x = s.peek();
						System.out.println("data of peek is " + x);
					} catch (Exception e) {
						System.out.println("Queue is empty");
					}
					break;
				case 4:	//Dump
					s.dump();
					break;
			}
			System.out.println();
		}
		stdIn.close();
	}

}
