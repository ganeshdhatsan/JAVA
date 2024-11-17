package com.CoreJava_Variables;

public class InstanceVariable {
	
String name ="mahathuva";

int a ;

//Types of variables
//
//1.Instance variable
//2.static variable
//3.local variable
//
// 1.Instance variable
// 2.class level declaration
// 3.scope of the variable for the entire class
// 4.limitation of instance variable based on the object
// 5.only using object reference we can call instance variable or method

private void method1() {
	String name2 ="sri";
	String concat = name.concat(name2);
	System.out.println(concat);
}

private void method2() {
	String name2 ="sangeetha";
	String concat = name.concat(name2);
	System.out.println(concat);
}

private void method3() {
	a =30;
	//int a =40;
	int b =20;
	int c = a+b;
	System.out.println(c);

}

private void method4() {
	a =50;
	//int a =40;
	int b =20;
	int c = a+b;
	System.out.println(c);

}


private void method5() {
	a =100;
	//int a =40;
	int b =20;
	int c = a+b;
	System.out.println("C "+c);

}

private void method6() {
	int b =20;
	int c = a+b;
	System.out.println(c);

}

public static void main(String[] args) {
	
	InstanceVariable v = new InstanceVariable();
	
//	System.out.println(v.a);
//	v.method4();
//	System.out.println(v.a);
	v.method5();
	System.out.println(v.a);
	
	InstanceVariable v1 = new InstanceVariable();
	System.out.println(v1.a);
	
	
	
	
}
}
