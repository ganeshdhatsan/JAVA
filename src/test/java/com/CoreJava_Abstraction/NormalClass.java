package com.CoreJava_Abstraction;

public class NormalClass extends AbstractClass_01 {

	public void method1() {
		System.out.println("NormalClassmethod1");
	}

	public void method2() {
		System.out.println("NormalClassmethod2");
		super.method2();
		method4();
		method5();

	}
//	public void method4() {
//
//	}

//	public void method5() {

//	}
	@Override
	void method3() {
		super.method1();
	}

	public static void main(String[] args) {
		NormalClass n = new NormalClass();

	}

}
