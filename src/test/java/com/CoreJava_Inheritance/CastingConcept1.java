package com.CoreJava_Inheritance;

public class CastingConcept1 extends CastingConcept2{
public void casting1() {
System.out.println();
}

public static void main(String[] args) {
	// posiblity 01 -- we can access both CastingConcept1 and CastingConcept2 properties 
	CastingConcept1 cc = new CastingConcept1();
	cc.casting1();
	cc.casting2();
	
	// posiblity 02 -- we can access only CastingConcept2 properties
	
	CastingConcept2 cc1 = new CastingConcept2();
	cc1.casting2();
	
	// posiblity 03 -- we can access only CastingConcept2 properties
	
	CastingConcept2 cc2 = new CastingConcept1();//class casting
	cc2.casting2();

	// posiblity 04 -- Not Possible
//	CastingConcept1 cc3 = new CastingConcept2();
	
}

}
