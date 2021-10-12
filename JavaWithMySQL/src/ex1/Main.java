package ex1;

public class Main {

	public static void main(String[] args) {
		DBConnection connection = new DBConnection();
		System.out.println("관리자 여부 : " + connection.isAdmin("admin", "admin"));
		System.out.println("관리자 계정 : " + connection.showAdmin());
		
		
	}

}
