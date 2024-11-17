package com.CoreJava_Singleton;

public class Single_01 extends Utility_Class{
//	rule 1
	private static Single_01 ss1;
// rule 2	
	private Single_01() {
		
	}
	
//	rule 3
	public static Single_01 getInstance() {
		if (ss1 ==null) {
			 	ss1= new Single_01();
		}
		return ss1;
	}
	
public String m1() {
String name = "java";
return name;
}
	
	public void m3() {
String  age ="API";
	}
	
	public void m2() {
String m1 = m1();

m3();
	}
	

	public void method_01() {
System.out.println("Single_01/method_01");
System.out.println("memory of ss1 --> "+ss1);
	}
	
	public static void main(String[] args) {
		Single_01 s1 = new Single_01();
		s1.method_01();
		System.out.println("s1 memory in Single_01 --> "+s1);
	}
	
}
