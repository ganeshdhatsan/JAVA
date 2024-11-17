package Test1;

public class ClassCasting {


public static void main (String [] args) {
ClassA a = new ClassA();
//a.method1();
//a.method2();

ClassB b = new ClassB();
//b.method1();
//b.method2();
//b.method3();
//b.method4();

ClassA a1 = b;
ClassB b1 = (ClassB) a1;
b1.method1();
b1.method2();
b1.method3();
b1.method4();
}
}
