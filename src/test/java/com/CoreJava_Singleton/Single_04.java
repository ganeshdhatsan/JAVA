package com.CoreJava_Singleton;

public class Single_04 {
//Single_01 s1 = new Single_01();
	
	public void method_04() {
//System.out.println("S1 Memory in single_03 --> "+s1);
		Single_01.getInstance().method_01();
	}
	
	public static void main(String[] args) {
		Single_04 s4 = new Single_04();
		s4.method_04();
	}

}
