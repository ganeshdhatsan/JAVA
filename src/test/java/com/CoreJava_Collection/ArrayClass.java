package com.CoreJava_Collection;

public class ArrayClass {
	public void m1() {
		String[] name = new String[3];
		String[][] name1 = new String[1][3];
		String[][][] name2 = new String[1][2][3];
		name[0] = "sri";
		name[1] = "mahath";
//name[2]="sele";
//name[3]="sql";
//		for (String each : name) {
//	
//			System.out.println(each);
//				}
for (int i=0; i<name.length; i++) {
	System.out.println("Forward -->  "+name[i]);
}
for (int i=name.length-1; i>=0; i--) {
	System.out.println("Backward-->  "+name[i]);
}
	}

	public static void main(String[] args) {
		ArrayClass a = new ArrayClass();
		a.m1();
	}
}
