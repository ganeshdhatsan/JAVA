package Test;

enum m2{
	
}
public class EnumPrac2 {
	
	enum m1{
		MONDAY,
		TUESDAY,
		WEDNESDAY;
		
}
public void method1() {
	EnumFish a = EnumFish.CATFISH;
	String b = "Prawn";
	String c = a+b;
	System.out.println("Method 1 -->  "+c);
}
public static void main (String [] args) {
	EnumPrac2 ref = new EnumPrac2();
	ref.method1();
}
}
