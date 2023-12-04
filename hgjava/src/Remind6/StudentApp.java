package Remind6;

import java.util.*;

public class StudentApp {

	public static void main(String[] args) {
		Student[] students = new Student[100];
		
		
		Scanner scn = new Scanner(System.in);
		StudentExe exe = new StudentExe();
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 || 2.목록 || 3.단건조회 || 4.수정 || 5.삭제 || 6.종료");
			System.out.print("입력");
			int menu = Integer.parseInt(scn.nextLine()); //"1"
			
			switch(menu) {
			case 1:
				System.out.println("학생번호입력>>");
				String no = scn.nextLine();
				System.out.println("학생이름입력>>");
				String name = scn.nextLine();
				System.out.println("영어점수입력>>");
				int eng = Integer.parseInt(scn.nextLine());
				System.out.println("수학점수입력>>");
				int math = Integer.parseInt(scn.nextLine());
				
				Student std = new Student(no, name, eng, math);
				//student 배열에 한건 저장.
//			for (int i=0; i< students.length; i++) {
//			if (students[i]==null) {
//					students[i] = std;
//				
//						break;
//				}
//				}
				if(exe.addStudent(std)) {
					System.out.println("저장되었습니다.");
				}else {
					System.out.println("저장 불가.");
				}
				
				break;
				
			case 2://목록보기
//				for(int i=0; i< students.length; i++) {
//					if(students[i]!=null) {
//						students[i].showInfo();
//					}
//				}
				for(Student st :exe.getStudentList()){
					if(st != null) {
					st.showInfo();//Student[] 타입.
				}
				
				}
				break;
				
			case 3://단건조회
				System.out.println("조회할 학생번호를 입력하세요>>");
				no = scn.nextLine();
//				for(int i=0; i<students.length; i++) {
//					if(students[i] !=null && students[i].getstudentNo().equals(no)) {
//						students[i].showInfo();
//					}
//				}
				Student stnt = exe.getStudent(no);
				if(stnt != null) {
					stnt.showInfo();
				}else {
					System.out.println("존재하지 않은 정보");
				}
				break;
				
			case 4://수정.
				System.out.print("조회할 학생번호 입력>>");
				no = scn.nextLine();
				
//				for(int i=0; i<students.length; i++) {
//				if(students[i] !=null && students[i].getstudentNo().equals(no)) {
					System.out.println("영어점수>>");
					eng = Integer.parseInt(scn.nextLine());
					System.out.println("수학점수>>");
					math = Integer.parseInt(scn.nextLine());
					if(exe.modifytudent(no, eng, math)) {
						System.out.println("수정 완료.");
					}else {
						System.out.println("수정 실패.");
					}
//				}
				
				
//				}
				break;
				
				
			case 5://삭제.
				System.out.print("삭제>>");
				name = scn.nextLine();
//				for(int i=0; i<students.length; i++) {
//					if(students[i] !=null && students[i].getStudentName().equals(name)) {
//						students[i] = null; 
//						 
//					}
//					}
				if(exe.removeStudent(name)) {
					System.out.println("삭제 완료.");
				}else {
					System.out.println("삭제 실패.");
				}
				break;
				
			case 6:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				
				
			}
		}// while
		System.out.println("end of prog.");
		
		
	}//main

}//class
