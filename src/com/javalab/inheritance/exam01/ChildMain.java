package com.javalab.inheritance.exam01;

public class ChildMain {

	public static void main(String[] args) {
		
		Child b = new Child(); // 자식 객체의 기본 생성자 호출, 빈객체 생성
		b.name = "홍길동"; //부모
		b.age = 18; //부모
		b.address = "개성"; // 자식
		b.phone = "010-1234-5678"; //자식
		
		Child b1 = new Child("서울"); // 자식 객체의 생성자 호출
		
		Child b2 = new Child("서울", "010-3847-3989");

	}

}
