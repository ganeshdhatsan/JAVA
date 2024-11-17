package Test;

public class Test_5_Class_B extends Test_6_Class_C {
	
	public void method2 () {
    String name2 = "Banana";
	System.out.println(name2);
	}
	public static void main (String [] args) {
	Test_5_Class_B ref = new Test_5_Class_B ();
	ref.method2 ();
	ref.method3();
//	ref.method4();
	}
	}
