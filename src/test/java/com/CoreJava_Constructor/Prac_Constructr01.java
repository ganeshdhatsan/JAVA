package com.CoreJava_Constructor;

public class Prac_Constructr01 extends Prac_Constructr02 {
	Prac_Constructr01 (){
		super();
		System.out.println("Prac1");
		
	}
public void met1() {
	System.out.println("Method1");
	}
public static void main (String [] args) {
	Prac_Constructr01 ref = new Prac_Constructr01();
	
}
}
