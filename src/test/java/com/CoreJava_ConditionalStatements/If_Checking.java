package com.CoreJava_ConditionalStatements;

public class If_Checking {
	
	public void method1 () {
		
		
		
	float value1 = 0.05f;
	float value2 = 0.10f;
	float value3 = 0.15f;
	
	if (value1==value2) {
	System.out.println("1 = True");
	}
	else if (value2!=value3) {
	System.out.println("2# = True");
	}
	else {
	System.out.println("False");
	}
	}

	public static void main (String [] args) {
	If_Checking outpot = new If_Checking ();
	outpot.method1();
	}
	}
