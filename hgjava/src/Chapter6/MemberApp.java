package Chapter6;

public class MemberApp {
public static void main(String[] args) {
	Member[] members = new Member[10];
	
	members[0] = new Member(1, "Hong", "010-1111-1111", "M");
	members[1] = new Member(2, "Park", "010-2222-2222" ,"F");
	members[2] = new Member(3, "Choi", "010-3333-3333" ,"F");
	
	for(int i=0; i<members.length; i++) {
		if(members[i] != null && members[i].getGender().equals("F"))
		members[i].showInfo();
	}
	
	}//end of main

static void test1() {
	Member mem1 = new Member(); //인스턴스 생성.
	System.out.println(mem1);
	
	//mem1.memberNo = 10;
	mem1.setMemberNo(10);
	//mem1.memberName = "Hong";
	mem1.setMemberName("Hong");
	//mem1.phone = "010-1234-5678";
	mem1.setPhone("010-1111-1111");
	//mem1.gender = "M";
	mem1.setGender("M");
	
	mem1.showInfo();
	
	Member mem2 = new Member(11, "hwang");
	//mem2.phone = "010-3333-4444";
	mem2.setPhone("010-9999-9999");
	mem2.showInfo();
	
	Member mem3 = new Member(12, "Park", "010-1234-8523", "W");
	mem3.showInfo(); //반환유형: void.
	String msg = mem3.showAllInfo();//반환유형: String.
	System.out.println(msg);
}//end test
}//end of class
