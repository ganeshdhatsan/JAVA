package com.CoreJava_Encapsulation;

public class Encaps_01 {
	
private String name = "java";

public String getName(){
	return name;
}
	
private String value ;

public void setValue(String obj){
	this.value =obj;
	
}

public String getValue () {
	return value;
}
private void method(int a) {
	int b = a+10;
System.out.println("b "+b);
}

public static void main(String[] args) {
	Encaps_01 e = new Encaps_01();
	e.method(5);
}

}
