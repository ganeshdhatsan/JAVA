package com.CoreJava_Inheritance;

//Single Inheritance

//public class Parent {
//	
//	 public void p1() {
//	System.out.println("p1");
//	}
//	 public void p2() {
//	System.out.println("p2");
//	}
//
//	 public void p3() {
//	System.out.println("p3");
//	}
//	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.p1();
//		p.p2();
//		p.p3();
//		GrandParent gp = new GrandParent();
//		gp.gp1();
//		gp.gp2();
//		gp.gp3();
//		
//	}
//
//	}

// single inheritance

public class Parent extends GrandParent{
	
	public void p1() {
System.out.println("p1");
}
	public void p2() {
System.out.println("p2");
}

	public void p3() {
System.out.println("p3");
}

public static void main(String[] args) {
	Parent p = new Parent();
	p.p1();
	p.p2();
	p.p3();
	p.gp1();
	p.gp2();
	p.gp3();
	
}

}


