package com.CoreJava_Constructor;

public class ConstructorCons1 {

	 ConstructorCons1() { // default constructor
		System.out.println("ConstructorCons1");
	}
	 ConstructorCons1(int a, int b) { // parameterized constructor
		 
		 this(2, "Taxi", 3);
		System.out.println("Para int & int --> "+(a+b));
		this.method1(5, 8);
		}
	 ConstructorCons1(int b, String c) { // parameterized constructor
			System.out.println("Para int & String --> "+(b+c));
		}
	 ConstructorCons1(int b,String x,int a) { //parameterized constructor
		 System.out.println("Para int, String & int --> "+(b-a+x));
			
		}
	private void method1() {
		System.out.println("ConstructorCons1Method");
	}
	public void method1(int a, int b) {
		System.out.println("ConstructorCons1Method --> "+(a-b));
	}
	private void method1(String a, String b) {
		System.out.println("ConstructorCons1Method --> "+(a+b));
	}
	
	private void method1(int b,String x,int a) {
	
		System.out.println("ConstructorCons1Method --> "+(a*b+x));
		
	}
	
	public static void main(String[] args) {
//		ConstructorCons1 c = new ConstructorCons1();
		ConstructorCons1 c1 = new ConstructorCons1(5, 1);
//		ConstructorCons1 c2 = new ConstructorCons1(6, "apple");
//		ConstructorCons1 c3 = new ConstructorCons1 (12, "banana", 9);
//		c1.method1(5,2);
//		c1.method1(2, "Abc", 4);
//		c3.method1("Mahathuva", "Sri");
	}
}
