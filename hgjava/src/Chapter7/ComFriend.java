package Chapter7;

//Friend상속 + 회사, 부서
public class ComFriend extends Friend {
	private String Company;
	private String dept;
	
	public ComFriend(String name, String phone, String Company, String dept) {
		super(name, phone); //super: 부모클래스를 가리킨다
		this.Company = Company;
		this.dept = dept;
	}
	@Override
	public String showInfo() {
		return "이름은 " + super.getName() + "연락처는 " + getPhone() + "회사는 " + Company + "부서는 "+ dept;
	}
	
	//getter, setter
	public String getCompany(){
		return Company;
	}
	public void SetCompany(String Company) {
		this.Company = Company;
	}
	public String getDetp(){
		return dept;
	}
		public void SetDept(String Dept) {
			this.dept = dept;
		}
}
