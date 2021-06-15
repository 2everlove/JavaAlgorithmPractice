package ex;

class SuperClass{
	String str = "super";
}	

class SubClass extends SuperClass{
	String str = "sub";
}
public class KisscoExExtends {
	
	public static void main(String[] args) {
		SuperClass superClass = new SubClass();
		System.out.println("출력 : "+superClass.str); //출력 : super
		
		SubClass subClass1 = new SubClass();
		System.out.println("출력 : "+subClass1.str);//출력 : sub
		
		
		SubClass subClass2 = (SubClass) new SuperClass();
		System.out.println("출력 : "+subClass2.str);//컴파일 error 이유 : 실제 인스턴스가 무엇?, 참조변수가 가르키는 실제 객체?
		
		
	}//main
	

}
