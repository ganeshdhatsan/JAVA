package com.CoreJava_Constructor;

public class HelloWorld {
	
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online


	HelloWorld (){
	System.out.println("Default Constructor");    
	}
	HelloWorld (int a, String b){
	this("Grape",2);    
	// a= 10;
	// b="apple";
	String c= a+b;
	System.out.println("Parameterized Constructor Type 1 -->  "+c);
	}
	HelloWorld(String b, int a){
	// int a= 50;
	// String b="Banana";
	String c= a+b;
	System.out.println("Parameterized Constructor Type 2 -->  "+c);   
	}
	HelloWorld(int a){
	// a= 10;
	// int b = 100;
	 int c= a;
	System.out.println("Parameterized Constructor Type 3 -->  "+c); 
	this.method1();
	}
	public void method1(){
	System.out.println("Method1");    
	}
	public static void main (String [] args){
	  HelloWorld ref = new HelloWorld( );
	  HelloWorld ref1 = new HelloWorld(5,"apple");
	  HelloWorld ref2 = new HelloWorld("Banana", 8);
	  HelloWorld ref3 = new HelloWorld(100);
	 }    
	

}
