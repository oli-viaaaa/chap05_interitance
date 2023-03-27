package com.javalab.inheritance.exam01;
// 자식클래스
public class Child extends Parent {

	public String address;
	public String phone;

	// 기본 생성자
	public Child() {
		super(); // 첫줄에서 부모 객체 기본 생성자 호출
	}

	public Child(String address) {
		super("김길동", 29); // 호출하게 되면 부모가 가진 생성자를 호출하게 됨(부모의 이름, 나이 호출) // 부모 필드 초기화
		// super(); 자돟으로 생성됨
		this.address = address; // 자기 필드 초기화
		System.out.println("자식 객체의 생성자 1");
	}

	public Child(String address, String phone) {
		this.address = address;
		this.phone = phone;
		System.out.println("자식 객체의 생성자 2");
	}

}
