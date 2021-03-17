package p0311;

public class Hobby {

	public static void main(String[] args) {
		String[] hobby = {"독서","수영","골프","게임"};
		//String[] h1 = requset.getParameterValues("hobbys");
		String[] hobby2 = {"게임","독서"};
		String[] hobby3 = {"수영","게임","독서"};
		
		String hobbys1 ="";
		
		for(int i=0; i<hobby2.length;i++) {
			if(i==0) {
				hobbys1 += hobby2[i];
			} else {
				hobbys1 += ","+hobby2[i];
			}
		}
		System.out.println(hobbys1);
		
		for(int i=0; i<hobby.length;i++) {
			
		}
		System.out.print("<input=\'checked\' name=\'hobby\'");
		System.out.print(hobbys1.contains("골프")?" checked":"");
		System.out.println(">");
	}
	

}
