package com.CoreJava_Variables;

public class StaticVariable {
		
	
	//Types of variables
	
	//1.Instance variable
	//2.static variable
	//3.local variable
	
	//2.static variable
//	1.can be declare in class level using static keyword
//	2.scope of the static variable for the entire class
//	3.limitation not based on the object. based on the class
//	4.whenever a necessity to call a method or variable without using object so then we can go with static
//	5.static method/variable will be store in stack memory
//	6.no need to create an object to call a static method and static variable 
//	7. by directly or using class name or using object reference we can call  static variable and method
	
	
	static int a;//stack memory
	
	private void method1() {
		a=10;
		int b=20;
		int c=a+b;
		System.out.println("c --> "+c);
	}
	private static void method2() {
		a=50;
		int b=20;
		int c=a+b;
		System.out.println("c --> "+c);
	}
	public static void main(String[] args) {
		StaticVariable s = new StaticVariable();//heap memory
//		System.out.println(s.a);
//		System.out.println(a);
//		System.out.println(StaticVariable.a);
		System.out.println(s.a);//0
	    s.method1();
	    System.out.println(s.a);//10
	    
//	    StaticVariable.method2();
	    s.method2();
		System.out.println(s.a);//50
		
		StaticVariable s1 = new StaticVariable();
		System.out.println(s1.a);
		
	}

}
