package Remind6;
//저장공간: 배열.
//추가/수정/삭제/목록/단건조회.

public class StudentExe {
	//배열:
	private Student[] students;
	
	//생성자.
	StudentExe(){
		students = new Student[100];
		students[0] = new Student("23-001", "홍길동", 77, 88);
		students[1] = new Student("23-002", "김철수", 75, 82);
	}
	
	//추가.
	boolean addStudent(Student std) {
		for(int i =0; i<students.length;i++) {
			if(students[i]==null) {
				students[i] = std;
//				break;
				return true; //메소드에서 return문은 메소드의 끝.
			}
		}
		return false;
	}
	//목록.
	Student[] getStudentList() {
		return students;
	}
	
	
	//단건 조회.
	Student getStudent(String no) {
		for(int i=0; i<students.length; i++) {
			if(students[i]!=null && students[i].getstudentNo().equals(no)) {
				return students[i];
				
			}
			
		}
		return null;
	}
	
	//수정.
	boolean modifytudent(String no, int eng, int math) {
		for(int i=0; i< students.length; i++) {
			if(students[i] != null && students[i].getstudentNo().equals(no)) {
				students[i].SetEng(eng);
				students[i].SetMath(math);
				return true;
			}
		}
		return false;
	}
	
	//삭제.
	boolean removeStudent(String name) {
		for(int i=0; i< students.length; i++) {
			if(students[i] != null && students[i].getStudentName().equals(name)) {
				students[i] = null;
				return true;
			}
		}
		return false;
	}
	
}//end of class
