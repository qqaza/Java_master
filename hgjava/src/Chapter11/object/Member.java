package Chapter11.object;

public class Member {
	private String name;
	private int age;
	
	Member(String name, int age ){
		this.name=name;
		this.age=age;
	}
	//equals
	@Override
	public boolean equals(Object obj) {
		//논리적으로 동등한 객체(이름, 나이)
		if(obj instanceof Member) {
			Member target = (Member)obj;
			if(this.name.equals(target.name) && //
			this.age == target.age){
				return true;
			}
			return false;
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}//class
