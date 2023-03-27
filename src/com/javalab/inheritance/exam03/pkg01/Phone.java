package com.javalab.inheritance.exam03.pkg01;
// 부모클래스
public class Phone extends Object {
	// 필드선언
	public String model;
	public String color;
	
	// 생성자 
	public Phone() {
		super();
	}
	
	// 생성자 선언
	public Phone(String model,String color) {
		this.model = model;
		this.color = color;
	}

	// phoneInfo 메소드 구현
	public void showPhoneInfo() {
		System.out.println("Phone [model] : "+model+"\t"+"phone[color] : "+color);
	}
	

}
