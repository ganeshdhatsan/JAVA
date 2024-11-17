package Test1;

public class ClassB extends ClassA{
public void method3() {
System.out.println("Class B Method 1");
}
public void method4() {
System.out.println("Class B Method 2");
}
public static void main (String [] args) {
ClassB ref = new ClassB ();
ref.method3();
ref.method4();
ref.method1();
ref.method2();
}
}
