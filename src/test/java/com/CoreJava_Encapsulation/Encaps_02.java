package com.CoreJava_Encapsulation;

public class Encaps_02 {
	Encaps_01 e = new Encaps_01();
	
	private void usage() {
		String man = e.getName();
		String ans =man+ "selenium";
		System.out.println("ans "+ans);

	}
	
	private void waste() {
	e.setValue("java");
	String value = e.getValue();
		String name = "API";
String result = value+name;
System.out.println("result "+result);
	}
	
	public static void main(String[] args) {
		
		Encaps_02 e = new Encaps_02();
		
		
		e.waste();
	}

}
