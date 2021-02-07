package max;

public class minEx {
	static int min4(int a,int b,int c,int d) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		if(min > d) {
			min = d;
		}
		return min;
	}
	
	static int max4(int a,int b,int c,int d) {
		int max = a;
		if(max < b) {
			max = b;
		} 
		if(max < c) {
			max = c;
		} 
		if(max < d) {
			max = d;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		System.out.println(min4(3,5,7,1)); //1
		System.out.println(min4(3,5,7,9)); //3
		System.out.println(min4(3,5,7,4)); //3
		System.out.println(min4(3,5,7,2)); //2
		
		System.out.println(max4(3,5,7,1)); //7
		System.out.println(max4(3,5,7,9)); //9
		System.out.println(max4(3,5,7,4)); //7
		System.out.println(max4(3,5,7,2)); //7
	}

}
