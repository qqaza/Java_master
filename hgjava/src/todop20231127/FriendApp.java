package todop20231127;

import java.util.*;

import hapter5.Student;

public class FriendApp {

	public static void main(String[] args) {
		//친구의 정보를 1.친구수 2.입력 3.목록 4.수정 5.종료
		Scanner scn = new Scanner(System.in);
		  Friend[] friends = null;
		int friendNum =0;
		String[] names = null;
		
		boolean run = true;
		while(run) {
			System.out.println("1.친구수 2.입력 3.목록 4.수정 5.종료");
			System.out.print("입력>>");
			int menu = scn.nextInt();
			scn.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println("친구수 입력>>");
				friendNum = Integer.parseInt(scn.nextLine()); 
				friends = new Friend[friendNum];
				break;
			
			case 2:
				System.out.println("친구이름 입력>>");
				friendNum = Integer.parseInt(scn.nextLine());
				friends = new Friend[friendNum];
				break;
				
				
			case 3:
				System.out.println("친구 목록>>");
				for(int i=0; i < friends.length; i++) {
					System.out.println("이름은 "+ names[i] + friends[i]);
				}
				break;
				
			case 4:
				System.out.println("찾을친구 이름입력>>");
				String name = scn.nextLine();
				boolean exists = false;
				
				for(int i=0; i<friends.length; i++) {
					//조건 추가 =>변경 점수 입력.
					if(name.equals(friends[i].name)){
					System.out.println("변경할 이름를 입력하세요>>");
					friends[i].name = scn.nextLine();
					exists = true;
					}
		//찾는 이름 없음
					}
				if(!exists) {
					System.out.println("찾는 사람이 없습니다.");
					}
			case 5:
				System.out.println("종료>>");
				run = false;
				break;
				
				
			}//end switch
				
			}//end of while
		System.out.println("end of prog.");
		
	}//end main

}//end class
