package loop;
import java.util.Scanner;

public class forEx3 {
	
	
	static int sumof(int a,int b){
		int sum = 0;
		for(int i = a; i<=b;i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		
		System.out.println(sumof(a,b));
		stdIn.close();
	}

}
