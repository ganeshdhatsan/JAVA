package com.CoreJava_Constructor;

public class Constructor_Revision {

	public Constructor_Revision() {
		this(0);
		method1();
		System.out.println("constructor");
	
	}

	public Constructor_Revision(int a) {

		System.out.println("Parameterised constructor");
	}

	public Constructor_Revision(String b, int a) {

		System.out.println("Parameterised constructor");
	}

	public Constructor_Revision(int a, String b) {

		System.out.println("Parameterised constructor");
	}

	private void method() {
		this.method1();

			method1();
		System.out.println("method");
		this.method1();

	}
	private void method1() {
		System.out.println("method");
	}


	private static void staticmethod() {
		
		System.out.println("staticmethod");
	}

	{

		System.out.println("block");
	}
	static {

		System.out.println("Static block");
	}

	public static void main(String[] args) {
		Constructor_Revision c = new Constructor_Revision();
		c.method();
		staticmethod();

	}

}
