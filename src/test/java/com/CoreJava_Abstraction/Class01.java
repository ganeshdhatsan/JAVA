package com.CoreJava_Abstraction;

import com.CoreJava_Polymorphism.Method_Overloading_2;

public class Class01 extends Class02{
public void m2 () {
	
}

@Override
	void m1() {
		super.m3();
	}
public void m3() {
	System.out.println("CLASS01-M3");
}
public void met2() {
	
	System.out.println("class1 met2");
}
public static void main(String[] args) {
	Class01 c = new Class01();
	c.met2();
}

}
