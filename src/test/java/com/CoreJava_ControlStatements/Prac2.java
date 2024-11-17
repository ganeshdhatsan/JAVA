package com.CoreJava_ControlStatements;

public class Prac2 {
	
	// for - i know the exact size
	// for each - without knowing the size we are fetching only the existing data
	// while - unlimited iteration with condition
	// do while - first implementation, then only check the condition (unlimited iteration with condition )
	
	//print 1-50
	public void method1 () {
	for (int i=1; i<=50; i++) {
	System.out.println(i);
	}
	}
	
	//declare an array and fetch the 4 names//
	public void method2 () { 
//	String [] names = {"Java", "Python", "Selenium", "array"};
//	for (String single : names) {
//	System.out.println(single);
//	}
//	for (int i=0; i<names.length; i++) {
//	if (names[i].equals ("Selenium")) {
//	System.out.println(names[i] );	
//	}
//	}	
		
    // declare collection of strings and get all values using loop - Task 1//
	String [] collection = {"AB", "BC", "CD", "DE"} ;
	for (String sample : collection) {
	System.out.println("All Strings  --> "+ sample);
	}
	
    // declare int [] ; values are 5,3,1,5,2. take which is equal to 5  - Task 2//
	int [] values = {5,3,1,5,2};
	for (int i=0; i<values.length; i++) {
	if (values [i] == 5) {
	System.out.println("Equal to  --> " + values[i]);
	}
	}
		
    // declare One to Five. i want only Three  - Task 3//
    int [] value = {1,2,3,4,5} ;
    for (int i=0; i<value.length; i++) {
    if (i==3) {
	System.out.println("Only --> " + i);
	}
	}
		
    // print upto 100 by descending order - Task 4//
//  int count = 100;
//	while (count <= 100) {
//	System.out.println(count);
//	count --;
//	}
	
    int number = 100;
    while (number >= 1) {
    System.out.println(number);
    number--;
    }
	}
	
	public static void main (String [] args) {
	Prac2 numeric = new Prac2 ();
	numeric.method2 ();
	}
    }
