package com.CoreJava_Singleton;

public class Single_03 extends Utility_Class{
	
	
	public void method_03() {
		Single_01.getInstance().method_01();
	}
	
	public static void main(String[] args) {
		Single_03 s3 = new Single_03();
		s3.method_03();
	}

}
