package com.javalab.inheritance.exam03.pkg01;

public class SmartPhone extends Phone {

	// 필드
	public String frequency;
	
	public SmartPhone() {
		super();
	}

	public SmartPhone(String model, String color) {
		super(model, color);
	}

	public SmartPhone(String model, String color, String frequency) {
		super(model, color);
		this.frequency = frequency;
	}
	
	// 
	public void showSmartPhoneInfo() {
		this.showPhoneInfo(); //부모의 정보를 조회하는 메소드
		System.out.println(this.frequency);
	}
}
