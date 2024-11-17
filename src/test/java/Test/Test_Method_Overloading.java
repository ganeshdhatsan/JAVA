package Test;

public class Test_Method_Overloading extends Test_Method_Override {
public void m1() {
	}
public void m1 (int a) {
	
}
public void m1 (int a, String b) {
	
}
@Override
	public void met1() {
String a = "dfg";
String b = "jkl";
String value = a+b;
System.out.println(value);
}
public static void main (String [] args) {
	Test_Method_Overloading ref = new Test_Method_Overloading();
//	ref.m1();
//	ref.m1(5);
//	ref.m1(2, "Apple");
	ref.met1();
}
}
