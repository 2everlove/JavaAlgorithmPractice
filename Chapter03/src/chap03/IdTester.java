package chap03;
//idを付与するclass

class Id{
	private static int counter = 0; //合計(total)
	private int id; //id
	
	//コンストラクタ(constructor)
	public Id() {id=++counter;}; // 0 -> 1 ->2 after execute 2 because static save data area!
	
	//id返還するインスタンス(instance)メソッド(method)
	public int getId() {return id;}
	
	//counterを返還するクラス(class)メソッド(method)
	public static int getCounter() {return counter;}
}

public class IdTester {

	public static void main(String[] args) {
		Id a = new Id(); // id1
		Id b = new Id(); // id2
		System.out.println("aのid: "+a.getId());
		System.out.println("bのid: "+b.getId());
		
		System.out.println("付与するidの合計: "+Id.getCounter());
	}

}
