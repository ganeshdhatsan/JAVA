package com.CoreJava_Constructor;

public class ConstructorCons2 extends ConstructorCons1 {
	
	ConstructorCons2 (int a, int b){
		super(1, "Apple");
		super.method1(2, 1);
		System.out.println("Type 1 --> "+(a*b));
		
		
	}
	ConstructorCons2 (String a, String b) {
		System.out.println("Type 2 --> "+(b+a));
	}
	public void m1 () {
		int a = 5;
		int b = 1;
		int c = a*b;
		
		System.out.println ("Method1 --> "+c);
		}
public static void main (String [] args) {
	ConstructorCons2 ref = new ConstructorCons2(2,1);
	ConstructorCons2 ref1 = new ConstructorCons2 ("Mahathuva", "Sri");
	ref.m1();
	
}
}
