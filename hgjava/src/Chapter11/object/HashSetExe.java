package Chapter11.object;

import java.util.HashSet;

public class HashSetExe {
	public static void main(String[] args) {
		//배열-> 컬렉션(List, Set, Map)
		//Set 중복값은 걸러내고 중복되지 않은것만 고름
		HashSet  set = new HashSet();
		set.add("Hong");
		set.add("Hwang");
		set.add("park");
		set.add("Hong");
		
		for(Object name : set) {
			System.out.println(name);
		}
	}//main
}//class
