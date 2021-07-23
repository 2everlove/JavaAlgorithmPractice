package chap05;

import java.util.Scanner;

//Recursive Implement Factorial
//1. 0! = 1
//2. if n > 0, n! = n * (n - 1) !
public class Factorial {
	
	static int factorial(int n) {
		if(n>0)
			return n*factorial(n-1);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Please enter an integer.: ");
		int x = stdIn.nextInt();
		
		System.out.println("factorial of "+x+" is "+factorial(x)+".");
	}

}


/*
Please enter an integer.: 4
factorial of 4 is 24.
*/