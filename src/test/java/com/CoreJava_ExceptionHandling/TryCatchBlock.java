package com.CoreJava_ExceptionHandling;


public class TryCatchBlock {
public void method1() {
	try {
		String [ ] names = new String [3];
		names[0]="Grapes";
		names[1]="Apple";
		names[2]="Papaya";
		names[3]="Dora";
		for(String name : names) {
		if(name.equals("Dora")) {
		System.out.println("Try Block -->  "+name);
		}
		}
	    }
	catch (ArrayIndexOutOfBoundsException ex){
//		String name1 = "Kora";
//		System.out.println("Catch Block -->  "+name1);
		String name2 = "Apple";
		System.out.println("Catch Block -->  "+name2);
	   }
   catch (Exception e) {
	   e.printStackTrace();
	   }
       }
public static void main (String []args) {
	TryCatchBlock ref = new TryCatchBlock();
	ref.method1();
    }
    }
