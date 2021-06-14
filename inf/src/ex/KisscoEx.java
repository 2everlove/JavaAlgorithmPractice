package ex;

import java.util.Calendar;
import java.util.Scanner;

//IT필기 4번 - 만나이 구하기
public class KisscoEx {
	//main
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner stdString = new Scanner(System.in);//System.in @return InputStream
		System.out.println("생년월일(yyyyMMdd)을 입력해주세요."); //yyyyMMdd
		String input,inputYear,inputMonth,inputDate;//subString 시 나눠질 year //subString 시 나눠질 month //subString 시 나눠질 date
		while(true) {
			try {
				input = stdString.next();
				while(true){
					if(input.matches("^[0-9]*$")&&input.length()==8) {//숫자인지? 8자리 옳게?
						inputYear = input.substring(0,4); // yyyy
						inputMonth = input.substring(4,6); // MM
						inputDate = input.substring(6,8); //dd
						break;
					} else {
						System.out.println("생년월일(yyyyMMdd)을 다시 입력해주세요.");
						input = stdString.next();
						continue;
					}
				}
				int year =cal.get(Calendar.YEAR); //실제 년
				int month =cal.get(Calendar.MONTH)+1;//실제 월
				int date =cal.get(Calendar.DATE);//실제 일
				year = year-Integer.parseInt(inputYear); // year - birth year = @year;
				if(month>Integer.parseInt(inputMonth)) { //birth month 보다 현재 month가 크면 @year + 1; 
					year+=1;
				} else if(month==Integer.parseInt(inputMonth)) { // birth month와 현재 month가 같으면
					if(date<=Integer.parseInt(inputDate)) { //birth date보다 현재 date이 작거나 같으면 @year + 1; 
						year+=1;
					}
				}
				System.out.println("만 "+year+"살입니다.");
				stdString.close();
				return;
			} catch(Exception e) {
				e.getStackTrace();
				System.out.println("생년월일(yyyyMMdd)을 다시 입력해주세요.");
				input = stdString.next();
				continue;
			}
		}
	}//main
}//class
