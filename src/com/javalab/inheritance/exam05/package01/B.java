package com.javalab.inheritance.exam05.package01;

public class B {
	
	// 메소드 선언
	public void method() {
		A a = new A();		// O 객체 생성을 해야함
		a.field = "value";	// O
		a.method();			// O
	}

}
