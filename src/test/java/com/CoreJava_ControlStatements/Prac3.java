package com.CoreJava_ControlStatements;

public class Prac3 {
	
	public void method1 () {
	String [] names = {"AB", "BC", "CD", "DE", "EF"} ;
	for ( String single : names) {
	if (single.equals("CD"))  {
	System.out.println("For Each-->  " + single);
	}
	}
		
	for (String single : names) {
//	if (single.equals("AB") || single.equals("CD"))
	if (single.equals("AB"))
	{
	System.out.println("Get AB Value -->  "+single);
	}
	if (single.equals("CD")) {
	System.out.println("Get CD Value -->  "+single);
	}
	}
	System.out.println("Names Length --> "+names.length); // doubt - how its print 5 for name.length
	for (int i=0; i<names.length; i++) {
	if (names [i].equals("CD")) {
	System.out.println("For -->  " +names [i]);
	}
	}
	}
    
	public void method2 () {
	String [] names = {"AB", "BC", "CD", "DE", "EF"} ;
	for (int i = 0; i<names.length; i++) {
	if (names[i].equals("AB")) {
	System.out.println("Ans AB -->  "+names[i]);	
	break;
	}
	else if (names[i].equals ("CD")){
	System.out.println("Ans CD -->  "+names[i]);
	}
	else {
	System.out.println("Only Else -->  "+"CD");
	}
	}
	}
	
	public static void main (String [] args) {
	Prac3 result = new Prac3 ();
	result.method1 ();
	}
    }
