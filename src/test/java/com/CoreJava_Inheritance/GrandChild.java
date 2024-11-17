package com.CoreJava_Inheritance;

public class GrandChild extends GrandParent{// by GrandParent point of view , Hierarchy
	public void gc1() {// by Grandchild point of view , single inheritance
System.out.println("gc1");
}
	public void gc2() {
System.out.println("gc2");
}
	public void gc3() {
System.out.println("gc3");
}
public static void main(String[] args) {
	GrandChild gc = new GrandChild();
	gc.gc1();
	gc.gc2();
	gc.gc3();
	gc.gp1();
	gc.gp2();
	gc.gp3();
}
}
