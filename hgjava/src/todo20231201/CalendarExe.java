package todo20231201;

import java.util.Calendar;

public class CalendarExe {
public static void main(String[] args) {
	int year = 2023;
	int month = 10;
	
	
	
	Calendar today = Calendar.getInstance();
	
	//10월달력 작성.
	today.set(Calendar.YEAR, year );
	today.set(Calendar.MONTH, (month-1));
	today.set(Calendar.DATE, 1);
	
	String[] days = {"Sun", "Mon", "The", "Wed", "Thr", "Fri", "Sat"};
	
			for(String day : days) {
				System.out.printf("%4s", day);
			}
	System.out.println();
	//빈공백 생성
	int spaces = today.get(Calendar.DAY_OF_WEEK)-1;
	for(int i=0; i<spaces;i++) {
		System.out.printf("%4s", " ");
		
	}
	int Date = today.getActualMaximum(Calendar.DATE);
	for(int i=1; i<= Date; i++) {
		System.out.printf("%4d", i);
		if((i+spaces) % 7 == 0) {
			System.out.println();
			
		}
	}
	System.out.println("\n== the end ==");
	System.out.println("요일: "+ today.get(Calendar.DAY_OF_WEEK));
	System.out.println("막날: "+ today.getActualMaximum(Calendar.DATE));
}//main
}//class
