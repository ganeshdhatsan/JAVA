package com.CoreJava_Singleton;

public class Single_02 extends Utility_Class{

	
	public void method_02() {
		Single_01.getInstance().method_01();
//System.out.println("S1 Memory in single_02 --> "+s1);
	}
	
	
	private void social() {
		String m1 = Single_01.getInstance().m1();
		Single_01.getInstance().m3();
		
String ans = "selenium ";
String result = Single_01.getInstance().m1()+ans;

System.out.println( "result  "+result);
	}
	public static void main(String[] args) {
		Single_02 s2 = new Single_02();
		s2.social();
	}

}
