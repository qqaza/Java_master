package Remind6;

public class Student {
	String studentName;
	String studentNo;
	int eng;
	int math;
	void showInfo() {
		System.out.println("이름은 "+ studentName + "영어는 " + eng + "수학은 " + math);
	}
	
	void SetStudentName(String studentName) {
		this.studentName = studentName;
	}
	void SetEng(int eng) {
		this.eng = eng; 
	}
	void SetMath(int math) {
		this.math = math;
	}
	String getStudentName() {
		return studentName;
	}
	String getstudentNo() {
		return studentNo;
	}
	int getEng() {
		return eng;
	}
	int getMath() {
		return math;
	}
	
	Student(String studentNo, String studentName, int eng, int math){
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.eng = eng;
		this.math = math;
	}
	}

