package Test1;

public class ClassA {
public void method1() {
int a = 10;
int b = 6;
int c = a+b;
System.out.println("Class A Method 1 -->  "+c);
}
public void method2() {
String x = "School";
String y = "Bus";
String z = x+y;
System.out.println("Class A Method 2 -->  "+z);
}
public static void main (String [] args) {
ClassA ref = new ClassA ();
ref.method1();
ref.method2();
}
}
