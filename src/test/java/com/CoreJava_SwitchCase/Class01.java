package com.CoreJava_SwitchCase;

public class Class01 {
	public void method1 (String name) {
		switch (name) {
		case "python":
			System.out.println("Case1Python --  "+name);
		break;
		case "java":
			System.out.println("Case2Java --  "+name);
		break;
		default:
		System.out.println("Casenull  "+name);
	}
	}
	public static void main (String args []) {
		Class01 ref = new Class01();
		ref.method1("ruby");
		
		
	}

}
