package Chapter11.object;

import java.util.Calendar;

public class CalenderExe {

	public static void main(String[] args) {
		//1: YEAR, 2: MONTH / DAY_OF_WEEK: 일(1) 월(2)....토(7)
		Calendar cal = Calendar.getInstance();
		cal.set(1, 2022);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DATE, 2);
		cal.set(2024,3, 2);
		System.out.println("요일: "+ cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("막날: "+ cal.getActualMaximum(Calendar.DATE));

	}//end of main

}//end of class
