package Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ListExe3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//회원등록 (회원번호, 이름 ,포인트)
		//1.등록 2.이름조회 3.포인트변경 4.삭제 5.종
		List<Member> members = new ArrayList<>();
		members.add(new Member("M-001", "김길동", 1000));
		members.add(new Member("M-002", "이길동", 2000));
		members.add(new Member("M-003", "박길동", 3000));
		Member mems = null;

		String search = "";
		boolean run = true;
		while(run) {
			System.out.println("1.등록 2.이름조회 3.포인트변경 4.삭제 5.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1:
				System.out.println("회원번호>>>");
				String num = scn.nextLine();
				System.out.println("이름>>>");
				String name = scn.nextLine();
				System.out.println("포인트>>>");
				int point = Integer.parseInt(scn.nextLine());
				mems = new Member(num, name, point);
				members.add(mems);
				break;
			case 2:
				System.out.println("이름조회");
				search = scn.nextLine();
		
			for(int i=0;i<members.size();i++) {
				if(members.get(i).getMemberName().equals(search)) {
				System.out.println(members.get(i).getMemberName());
				System.out.println(members.get(i).getMemberNo());
				System.out.println(members.get(i).getPoint());
				
				}
				
			}
				break;
				
			case 3:
				System.out.println("이름조회");
				search = scn.nextLine();
		
			for(int i=0;i<members.size();i++) {
				if(members.get(i).getMemberName().equals(search)) {
					System.out.println("포인트변경>>>");
				members.get(i).setPoint(Integer.parseInt(scn.nextLine()));
				}	
				
			}
			break;
			case 4:
				System.out.println("삭제할 이름>>>");
				 search =scn.nextLine();
			
				
				for(int i=0; i<members.size();i++) {
					if(members.get(i).getMemberName().equals(search)){
						members.remove(members.get(i));
						
					}
				}
				break;
			default :
				System.out.println("종료");
				run = false;
				break;
			}
		
		}
	}//main

	private static Object getMemberName() {
		// TODO Auto-generated method stub
		return null;
	}

}//class
