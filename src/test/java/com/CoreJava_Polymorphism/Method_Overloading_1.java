package com.CoreJava_Polymorphism;

public class Method_Overloading_1 {
// we can create a method without changing the method name by changing the args in the form of datatype
// Type 1: by passing the data type
// Type 2: by changing the data type order
// Type 3: by changing the data type count

	public void homeloan() {
	System.out.println("Home Loan");
	}
//	private static int homeloan() {
//		int a = 10;
//		return a;
//	}
	public void homeloan(int a, String b) { // by passing the data type as argument
	System.out.println (a);
	System.out.println(b);
    }
    public void homeloan(String b, int a) { // by changing the order in argument
    b = "owl";
    a = 50;
    }
    public void homeloan(int a) { // by changing the data type count by increase/decrease
    a = 6;
    }
	public static void main (String [] args) {
// we are deciding in compile time, which method going to execute. 
		Method_Overloading_1 ref = new Method_Overloading_1 ();
		ref.homeloan(15,"green");
	}
    }
