package com.javalab.inheritance.exam04;

/*
 * 부모 클래스
 */

public class Parent {
	
	public int x = 100;
	
	// 부모에게만 있는 메소드
	void display1() {
		System.out.println("Parent dosplay1()");
	}
	
	// 부모 자식 모두에게 있는 메소드
	void display2() {
		System.out.println("parent display2(.)");
	}

}
