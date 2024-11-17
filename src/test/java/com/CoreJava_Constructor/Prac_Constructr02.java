package com.CoreJava_Constructor;

public class Prac_Constructr02  {
	Prac_Constructr02 (){
//		this(2, 5, "a");
//		super();
//		this.met2();
		System.out.println("Prac2");
		
	}
	Prac_Constructr02 (int a, String b){
		this();
	}
	Prac_Constructr02 (int a, int b, String c){
//		this();
	}
public void met2 () {
	System.out.println("Method2");
}
public static void main (String [] args) {
	Prac_Constructr02 ref1 = new Prac_Constructr02 ();
}
}
