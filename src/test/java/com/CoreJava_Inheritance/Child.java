package com.CoreJava_Inheritance;

public class Child extends Parent{//already parent class inherited by GrandParent
	// multi level inheritance
	
	public void c1() {
System.out.println("c1");
	}
	public void c2() {
		System.out.println("c2");
			}
	public void c3() {
		System.out.println("c3");
			}
public static void main(String[] args) {
	Child c = new Child();
	c.c1();
	c.c2();
	c.c3();
	c.p1();
	c.p2();
	c.p3();
	c.gp1();
	c.gp2();
	c.gp3();
}
}
