package Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TypingSpeedGame {

	public static void main(String[] args) {
		String word = "java java.util.Set Inc. All rights reserved.";
		String[] words = word.split(" ");
		List<String> list = new ArrayList<>();
		for(String str : words) {
			list.add(str);
		}
		
		boolean run = true;
		long start = System.currentTimeMillis();
		while(run) {
			//목록출력하고....
			
			for(int i=0; i< list.size();i++) {
				System.out.println(list.get(i));
			}
			
			//입력값과 목록값과 비교해서 있으면 제거.
			Scanner scn = new Scanner(System.in);
			String dd = scn.nextLine();
			for(int i=0; i<list.size();i++) {
				if(dd.equals(list.get(i))) {
					list.remove(dd);
				}
			}
			long end = System.currentTimeMillis();
			System.out.println((end - start)/1000+ "초걸림.");
		
		
		}//end of while.
			
		System.out.println("end of game.");
//		for(String str : list) {
//			System.out.println(str);
//		}
//		
		//목록출력.
		//Scanner 사용해서 입력값을 저장.
		//사용자 입력값과 컬렉션의 값과 비교해서 같은 단어 있으면 삭제.
		//시작시점 ~ 종료시점 까지 걸린시간을 초단위로 계산.
		//완료하는데 35초가 걸림.
		
		
		
		
		
		
		
	}//main
	
}//class
