package chap03;
//자연스러운 정렬을 하려면 다음과 같은 방법으로 클래스를 정의합니다.(自然に並べ替えるには、次のような方法でクラスを定義してください。)
//*예제로 보여주기 위해 만든거라 동작 x (例題ですので動作はしません!)

public class A implements Comparable<A> {
	//field, method
	
	public int compareTo(A c) {
		//this > c ? "+value":"";
		//this < c ? "-value":"";
		//this == c ? "0":"";
		return 0;
	}
	
	public boolean equals(Object c) {
		//this == c ? "true":"";
		//this != c ? "false":"";
		return false;
	}
}
