package Chapter11.object;

import java.util.HashSet;

public class HashSetExe {
	public static void main(String[] args) {
		//배열-> 컬렉션(List, Set, Map)
		//Set 중복값은 걸러내고 중복되지 않은것만 고름
		HashSet<String> set = new HashSet<String>();
		set.add("Hong");
		set.add("Hwang");
		set.add("park");
		set.add("Hong");
		
		//중복된 값은 제거됨.
		for(Object name : set) {
			System.out.println(name);
		}
		
		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동", 20));
		members.add(new Member("김길동", 21));
		members.add(new Member("박길동", 22));
		members.add(new Member("홍길동", 20));
		
		for(Member mem : members) {
			System.out.println(mem.toString());
		}
		
	}//main
}//class
