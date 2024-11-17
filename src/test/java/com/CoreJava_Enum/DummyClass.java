package com.CoreJava_Enum;

import com.CoreJava_Enum.EnumClass.Month;
import com.google.common.collect.DiscreteDomain;

public class DummyClass {
	
	private void ma() {
Days[] maha = new Days[3];


	}
	
	
private void m1(Colour colour) {
	
	switch (colour) {
	case BLUE:
		System.out.println(colour);
		break;
	case GREEN:
		System.out.println(colour);
		break;
	case RED:
		System.out.println(colour);
		break;
	case WHITE:
		System.out.println(colour);
		break;
	default:
		break;
	
}
}

private void m3(Month month) {
	switch (month) {
	case Febraury:
		int a=10;
		int b =20;
		int c = a=b;
		System.out.println(c);
		
		break;
	case January:
		break;
	case March:
		break;
	default:
		break;
	
	
	}
}
private void m4() {
Colour cl=Colour.GREEN;
System.out.println(cl);
System.out.println(Colour.GREEN);
}
public static void main(String[] args) {
	DummyClass d = new DummyClass();
//	d.m1(Colour.BLUE);
//	d.m3(Month.Febraury);
	d.m4();
	}
}
