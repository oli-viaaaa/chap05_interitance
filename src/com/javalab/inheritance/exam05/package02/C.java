package com.javalab.inheritance.exam05.package02;

// 상속 관계가 없는 다른 패키지의 클래스
public class C {
	// 메소드 선언
	public void method() {
		// A a = new A();		// X protected는 동일한 클래스 내에서만 사용 가능 따라서 A 사용 불가
		// a.field = "value";	// X
		// a.method();			// X
	}

}
