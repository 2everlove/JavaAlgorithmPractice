package chap06;

import java.util.Scanner;

public class BubbleSort2 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; // t is temp
		a[idx1] = a[idx2]; //a[5] = a[6] 
		a[idx2] = t; // a[6] = t
	}// a[6] > a[5] means idx2 > idx1
	
	static void bubbleSort(int[] a, int n) { //arrays, number of array -22,54,12,34,7,9,3 -7
		for(int i = 0; i < n - 1; i++) // 0-7, ++
			for(int j = n - 1; j > i; j--) //6-0. --
				if(a[j - 1] > a[j]) // if a[5] is gt a[6], go to method (swap)
					swap(a, j - 1, j); // arrays, 5, 6
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Bubble Sort (Ver_1)");
		System.out.print("No : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+ i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx); // arrays, number of array
		
		System.out.println("sort acs");
		for(int i = 0; i < nx; i++)
			System.out.println("x["+ i + "] = "+ x[i]);
		
		stdIn.close();
	}

}
