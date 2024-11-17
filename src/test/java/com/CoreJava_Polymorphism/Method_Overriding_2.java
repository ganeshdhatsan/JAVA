package com.CoreJava_Polymorphism;

public class Method_Overriding_2 {
	public void homeloan() {
	int interest = 9;
	System.out.println(interest);
	}
	public void bikeloan () {
		System.out.println("bikeloan");
	}
	public void alpha () {
		System.out.println("Alpha2");
	}
public static void main (String [] args) {
	Method_Overriding_2 ref = new Method_Overriding_2 ();
	ref.homeloan();
    }
    }

