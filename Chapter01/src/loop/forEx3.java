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
		
		System.out.println("a���� b������ ���� ���մϴ�.");
		System.out.print("a�� ��: ");
		int a = stdIn.nextInt();
		System.out.print("b�� ��: ");
		int b = stdIn.nextInt();
		
		System.out.println(sumof(a,b));
		stdIn.close();
	}

}
