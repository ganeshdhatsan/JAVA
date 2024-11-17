package com.CoreJava_DataTypes;

public class WrapperClassConcept {
	private static WrapperClassConcept wc;
	private WrapperClassConcept() {
		
	}
	public static WrapperClassConcept getInstance() {
		if (wc==null) {
			wc = new WrapperClassConcept();
		}
	return wc;
	}
public void wrapperTest () {
	String name ="43567";
	String alpha = "abcd";
	float kill = 12.08f;
	int nomos = 5454;
	
	String valueOf = String.valueOf(nomos);
	System.out.println("int value   "  + valueOf);
	
	String yes = Float.toString(kill);
	//System.out.println(yes);

	int int1 = Integer.parseInt(name);
//System.out.println(int1);


double double1 = Double.parseDouble(name);

//System.out.println("value of double   " + double1);

float float1 = Float.parseFloat(name);
//System.out.println(float1);
String high = Double.toString(double1);
//System.out.println("value of high   " + high);

}

public static void main(String[] args) {
	WrapperClassConcept sept = new WrapperClassConcept();
	
	sept.wrapperTest();

}
}
