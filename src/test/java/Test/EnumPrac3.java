package Test;

import Test.EnumPrac2.m1;

public class EnumPrac3 {
	public void met1() {
		m1 a = EnumPrac2.m1.MONDAY;
	String b = a+"Friday";
	System.out.println("Met1 -->  "+b);
	}
	public static void main (String [] args) {
	
	EnumPrac3 ref = new EnumPrac3();
	ref.met1();
	}
}
