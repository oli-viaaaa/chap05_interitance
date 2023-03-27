package com.javalab.inheritance.exam03.pkg01;

// 실행클래스
public class SmartPhoneMain {

	public static void main(String[] args) {
		// 1. SmartPhone 객체 생성
		SmartPhone myphone = new SmartPhone();
		myphone.model = "갤럭시노트10";
		myphone.color = "화이트";
		myphone.frequency = "6G";
		
		// myPhone 정보 조회
		myphone.showSmartPhoneInfo();

		// 2. 또다른 SmartPhone 객체 생성
		SmartPhone yourPhone = new SmartPhone("iphone","빨간색","4G");
		
		//yourPhone 정보조회
		yourPhone.showSmartPhoneInfo();

	}

}
