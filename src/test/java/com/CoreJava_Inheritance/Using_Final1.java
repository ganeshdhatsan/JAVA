package com.CoreJava_Inheritance;

public final class Using_Final1 extends Using_Final2 {
	
	public void finalmethod1  () {
		finalmethod2();
		String b = "one";
		String c = fruit+b;
	System.out.println (c);
	}
	
//	private void finalmethod2() {
	
//	}
	
	@Override
	public void finale() {
	}
	
public static void main(String[] args) {
	Using_Final1 rs = new Using_Final1 ();
	rs.finalmethod1 ();
}
}

