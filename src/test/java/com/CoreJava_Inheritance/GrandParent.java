package com.CoreJava_Inheritance;
// Types of Inheritance
// 1. single Inheritance = 1 to 1
// 2. Multilevel Inheritance = tree level - one by one inheritance
// 3. Hierarchy Inheritance = 1 property inherit with multiple child property
// 4. Multiple Inheritance = more than 1 property inherit with 1 property at a time (not support for class. only support for interface)
// 5. Hybrid Inheritance = Single+Multiple Inheritance (not support for class)

// inheritance: 
// access one class property into another class
// can be achieve using extends and implements keyword
// class to class - extends
// class extends class
// interface to interface - extends
// interface extends interface
// interface to interface1, interface2
// interface extends interface1, interface2
// class to interface - implements
// class implements interface
// interface to class - not possible (x)
// class extends class implements interface1, interface2, interface3


public class GrandParent{
	
	public void gp1() {
System.out.println("gp1");
}
	public void gp2() {
System.out.println("gp2");
}

	public void gp3() {
System.out.println("gp3");
}

public static void main(String[] args) {
	GrandParent p = new GrandParent();
	
	p.gp1();
	p.gp2();
	p.gp3();
	
}

}

