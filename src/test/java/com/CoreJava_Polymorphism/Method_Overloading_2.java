package com.CoreJava_Polymorphism;

public class Method_Overloading_2 {
	public void carloan() {
		
	}
	public void carloan (int a, int b) {
	int c = a+b;
	System.out.println(c);
	}
	public void carloan (float v) {
    System.out.println(v);
	}
public static void main (String [] args) {
	Method_Overloading_2 ref = new Method_Overloading_2();
	ref.carloan(5.9F);
	ref.carloan(5, 12);
    }
    }

