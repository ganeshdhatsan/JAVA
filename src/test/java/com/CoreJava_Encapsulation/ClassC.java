package com.CoreJava_Encapsulation;

public class ClassC extends ClassTest{
	private ClassA classa;
	
	private void m2() {
getClassa().m1();
	}
	
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.m2();
	}
}
