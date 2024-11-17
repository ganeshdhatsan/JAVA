package com.CoreJava_AcessModiAndSpecifiers;

public class Static_Concept {
	String fruit; // we can declare a variable without value like this//

	public void country () {
	fruit = "India";
    System.out.println("country -->"+fruit);
	}

    public void method6 () {
	fruit = "orange";
	System.out.println("method6 -->  "+ fruit);
    }

public static void main(String[] args) {
	//class_name refrence_value = new class_name();//
	Static_Concept sc = new Static_Concept();
	sc.country();
	sc.method6();
}	

}
