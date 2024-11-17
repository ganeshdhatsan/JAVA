package com.CoreJava_Encapsulation;

public class EncapsulationClass_02 extends EncapsulationClass_01{
	
public void method() {
int b= 20;


int c = getA()+b;
System.out.println(c);
}
	
	public static void main(String[] args) {
		EncapsulationClass_02 e = new EncapsulationClass_02();
		e.method();
	}
}
