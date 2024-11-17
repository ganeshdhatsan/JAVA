package com.CoreJava_Variables;

public class LocalVariable  {

	//Types of variables
	
	//1.Instance variable
	//2.static variable
	//3.local variable
	
	//3.local variable
//	1.can be declare only in the method
//	2.scope of the local variable is applicable only for the specific method
//	3.we can call using obj ref or if it is a static we can call using class name
//  4. class variable and method variable, 1st preference method variable	
	private void method1() {
    int a = 10;
    int b= 20;
    int c = a+b;
    System.out.println("c --> "+c);
	}
	
	private void method2() {
	int a=10;
	int b=40;
	int c = a+b;
	System.out.println("c --> "+c);
	}
	public static void main(String[] args) {
	LocalVariable l = new LocalVariable();
	l.method1();
	}
	}
