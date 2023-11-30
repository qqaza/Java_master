package Chapter6;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class Board {
	int num; // 게시글번호
	String title; // 제목
	String name; // 작성자
	String memo; // 내용
	String time; // 작성일시

	public Board() {

	}

	public Board(int num, String title, String name, String memo) {
		Date today = new Date(); // 시스템시간을 기준으로 생성.

		// Date => String => Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.num = num;   //num, Num 오라클DB는 관계없음.
		this.title = title;
		this.name = name;
		this.memo = memo;
		this.time = sdf.format(today);
	}

	public void showInfo() {
		System.out.println("번호는 " + num);
		System.out.println("제목은 " + title);
		System.out.println("이름은 " + name);
//	 System.out.println("내용은 "+ memo );
		System.out.println("날짜는 " + time);
	}

	public String showDetailInfo() {
//	 번호: 1/ 제목: 자바게시판 입니다.
//	 작성자: user01
//	 내용: 오늘은 숙제로 자바게시판을 만들어봅시다.
//	 일시: 2023-11-28
		String result = "번호: " + num + "/ 제목: " + title;

		result += "\n작성자: " + name;
		result += "\n내용: " + memo;
		result += "\n일시: " + time;

		return result;
	}

	// 나도 변경했습니다.

	public void SetNum(int num) {
		this.num = num;
	}

	public void SetTitle(String title) {
		this.title = title;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void SetMemo(String memo) {
		this.memo = memo;
	}

	public void SetTime(String time) {
		this.time = time;
	}

	public int getNum() {
		return num;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public String getMemo() {
		return memo;
	}

	public String getTime() {
		return time;
	}

	Board(int num, String title, String name, String memo, String time) {
		// this();//기본 생성자.
		this(num, title, name, memo);
//	this.num = num;
//	this.title = title;
//	this.name = name;
//	this.memo = memo;
		this.time = time;
	}
}// end of class