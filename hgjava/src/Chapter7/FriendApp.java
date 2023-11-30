package Chapter7;

import java.util.Scanner;

public class FriendApp {
	static Scanner scn = new Scanner(System.in);
	static FriendExe exe = new FriendExe();
// static Friend[] storage = new Friend[10];

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
		System.out.println("1.등록 2.목록 3.조회 4.종료");
		int menu = Integer.parseInt(scn.nextLine());
		
		switch(menu) {
		case 1://등록
			addFriend();
			break;
		case 2:
			friendList();
			break;
		case 3:
			getFriend();
			break;
		default :
			System.out.println("종료");
			run = false;
			break;
		}
		}
		
		}
	private static void addFriend() {
		System.out.println("1.친구 2.학교 3.회사");
		int submenu = Integer.parseInt(scn.nextLine());
		
		Friend friend = null;
		
		//case 1: //이름 연락처
		System.out.println("이름>>>");
		String name = scn.nextLine();
		System.out.println("연락처>>>");
		String phone = scn.nextLine();
		if(submenu==1) {
		friend = new Friend(name, phone); //Friend 인스턴트
		}else if(submenu==2) {
		//case 2: //이름 연락처 학교 전공
			System.out.println("학교이름>>>");
			String univ = scn.nextLine();
			System.out.println("전공>>>");
			String major = scn.nextLine();
			friend = new UnivFriend(name, phone, univ, major);
		}else if(submenu==3) {
		//case 3: //이름 연락처 회사 부서
			System.out.println("회사이름>>>");
			String Company = scn.nextLine();
			System.out.println("어떤부서>>>");
			String dept = scn.nextLine();
			friend = new ComFriend(name, phone, Company, dept);
		}
			
		//배열에 추가
		
//		for(int i=0;i<storage.length; i++) {
//			if(storage[i]==null) {
//				storage[i]=friend;
//				break;
//			}//if
//		}//for
		
	//}// 등록.
	if(exe.addFriend(friend)) {
		System.out.println("등록 완료");
	}else {
		System.out.println("등록 실패");
	}
		
	}
	
	private static void friendList() {
//		for(Friend fnd : storage) {
//			if(fnd != null) {
//				System.out.println(fnd.showInfo());
//			}
//		}
		exe.friendList();
	}// 목록.
	
	private static void getFriend() {
		//이름조회, 연락처조회
		System.out.println("1.이름 2.연락처");
		int submenu = Integer.parseInt(scn.nextLine());
		String searchCond = "";
		if(submenu==1) {
			searchCond = scn.nextLine();
			for(Friend fnd : storage) {
				if(fnd !=null && fnd.getName().equals(searchCond)) {
					System.out.println(fnd.showInfo());
				}
			}
		}else if(submenu==2) {
			searchCond = scn.nextLine();
			for(Friend fnd : storage) {
				if(fnd !=null && fnd.getPhone().equals(searchCond)) {
					System.out.println(fnd.showInfo());
				}
			}
		}else {
			System.out.println("1또는 2 선택하세요.");
		}
	}// 조회.
	
	void backup() {
		Friend parent = new Friend();
		parent.SetName("홍길동");
		parent.SetPhone("010-1111");
	    System.out.println(parent);
				
		UnivFriend child = new UnivFriend();
		child.SetName("김철수");
		child.SetPhone("010-2222");
		child.SetUniv("구미대학교");
		child.setMajor("컴퓨터공학과");
		System.out.println(child.showInfo());
				
		Friend[] friends = new Friend[10];
		friends[0] = parent;
		friends[1] = child;
	}// end of main.	}
}// end of class
