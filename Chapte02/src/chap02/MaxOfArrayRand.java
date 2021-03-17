package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		
		int num = sc.nextInt();
		
		/* num은 배열의 갯수로 쓰임 */
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<num;i++) {
			/* Random은 0.1~0.9까지의 수 */ 
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"]: " +height[i]);
		}//for
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}//main

}//class
