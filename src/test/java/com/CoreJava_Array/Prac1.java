package com.CoreJava_Array;

public class Prac1 {
	
	public void method1 () {
	String [] fruits = new String [4];
	fruits[0] = "Apple";
	fruits[1] = "Orange";
	fruits[2] = "Mango";
	fruits[3] = "Pineapple";
	
	for (int i=0; i<fruits.length; i++) {
	if (fruits[i].equals("Pineapple")) {
	System.out.println(fruits[i]);
	}
	}
	}
	
	public void method2 () {
	int [] v = new int [4];
	v[0] = 5;
	v[1] = 10;
	v[2] = 15;
	v[3] = 20;
		
	for (int i=0; i<v.length; i++) {
	if (v[i] == 15) {
	System.out.println(v[i]);		
	}
	}
		
	int [] value = {1,2,3,4,5};
	for (int i=0; i<value.length; i++) {
	if (value[i]==4) {
	System.out.print(value[i]);
	}
	}
	}
	
	public static void main (String [ ] args) {
	Prac1 os = new Prac1 ();
	os.method2();
	}
	}
