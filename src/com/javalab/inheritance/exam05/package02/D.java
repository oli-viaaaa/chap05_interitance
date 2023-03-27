package com.javalab.inheritance.exam05.package02;

import com.javalab.inheritance.exam05.package01.A;

// 상속 관계가 있는 다른 패키지의 클래스
public class D extends A { // A를 상속해줌
	// 생성자 선언
	public D() {
		// A() 생성자 호출
		super();
	}
	
	// 메소드 선언
	public void method1() {
		// A 필드값 변경
		this.field = "value";	// O
		// A 메소드 호출	
		this.method();			// O
	}
	
	// 메소드 선언
	public void method2() { // 자식이 부모 생성 안됨
		// A a = new A();		// X
		// a.field = "value";	// X
		// a.method();			// X
	}
}
