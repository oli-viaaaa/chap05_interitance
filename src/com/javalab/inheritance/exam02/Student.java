package com.javalab.inheritance.exam02;

/*
 * 자식 클래스
 * extends : 상속받을 부모 클래스 명시하기 위한 키워드
 * 	- 부모 클래스의 필드가 자동으로 상속되어 자식의 필드로 만들어짐(눈에 안보임)
 */

public class Student extends Human {

	// 필드
	int stdNo; // 학번
	String major; // 전공
	
	// 생성자
	/*public Student(String name, int age, int stdNo, String major) {
		// 부모객체의 생성자 호출();
		super(name, age);
		// 자식 객체 자신의 필드 초기화;
		this.stdNo = stdNo;
		this.major = major;
	}*/ // 내가 타이핑 한것
	
	
	
	public Student(String name, int age, int stdNo, String major) {
		super(name, age);
		this.stdNo = stdNo;
		this.major = major;
	}
	
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	// 오른쪽 마우스 Source로 생성 가능


	public void studentInfo() {
		this.humanInfo(); // 부모 정보 출력 메소드 호출
		System.out.println("[Student Info]");
		System.out.println("학번 : "+this.stdNo);
		System.out.println("전공 : "+this.major);
	}
	
}
