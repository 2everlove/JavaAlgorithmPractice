package chap05;

import java.util.Scanner;

//get greatest common divisior with Euclidean method of mutual division
public class EuclidGCD {
	
	static int gcd(int x, int y) {
		if(y ==0)
			return x;
		else 
			return gcd(y, x%y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Caluate greatest common divisior");
		
		System.out.print("Enter integer. : ");
		int x = stdIn.nextInt();
		System.out.print("Enter integer. : ");
		int y = stdIn.nextInt();
		
		System.out.println("greatest common divisior is "+gcd(x,y));
		
	}

}


/*
Caluate greatest common divisior
Enter integer. : 22
Enter integer. : 8
greatest common divisior is 2
*/