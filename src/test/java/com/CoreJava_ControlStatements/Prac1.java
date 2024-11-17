package com.CoreJava_ControlStatements;

public class Prac1 {

	public void method1 ( ) {
	for (int i=0; i<=100; i++) {
	System.out.println(i);
	}
	}
	
	public void method2 () {
	int  [] values = {1,2,3,4,5};
	for (int align : values) {
	System.out.println(align);
	}
	}
	
	public void method3 ( ) {
	int count =0;
	while (count<= 10) {
	if(count==10) {
	System.out.println("Mahathuva");
	}
	count ++;
	}
	}
	
	public void method4 ( ) {
	int count = 5;
	do {
	System.out.println("Mahathuva");
	count ++;
	}
	while (count < 10) ;
	}
	
	public void method5 ( ) {
	String [] it = {"Gan", "Mahath", "Sri", "Va", "Ga"};
	for (String dept:it) {
	while (dept.equals ("Gan")|| dept.equals ("Mahath")) {
	if (dept.equals ("Gan")) {
	System.out.println("Gan  --> Testing Manager");
	break;
	}
	else if(dept.equals ("Mahath")) {
	System.out.println("Mahath --> Sr.Software Tester" );
	break;
	}
	}
//	if (dept.equals("Gan") || dept.equals("Mahath")) {
//	break;
//	}
	}
	}
	
	public static void main (String [] args) {
	Prac1 ema = new Prac1 ();
	ema.method4 ();
	}
	}
	
	

