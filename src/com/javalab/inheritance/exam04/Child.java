package com.javalab.inheritance.exam04;

/*
 * 오버라이딩 예제
 * 자식 클래스
 */

public class Child extends Parent {
	
	int x = 200;
	
	// 메소드 오버라이딩(부모의 메소드를 다시 정의함)
	@Override // 부모가 가진것을 오버라이딩 했다 오버라이딩한 메소드 위에 붙여야함. 
	// 없어도 오류는 안남// 어노테이션 // 부모와 다르게 작성했을경우 오류를 잡아줌
	void display2() {
		System.out.println("Child display2()");
	}
	
	// 자식이 새롭게 추가한 메소드
	void display3() {
		System.out.println("Child display3()");
	}
}
