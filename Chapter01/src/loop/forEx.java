package loop;

import java.util.Scanner;

public class forEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		stdIn.close();
	}

}
