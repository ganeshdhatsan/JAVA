package Test;

public class Test_2_Variables {
	int d;
	int a = 10;
	static int m = 13;

// local variable
	public void method1() {
		int b = 15;
		int c = a + b;
		System.out.println(c);
	}

	public void method2() {
		int g = 9;
		int i = a + g;
		System.out.println(i);
	}

	public void method3() {
		int f = 2;
		int a = 1;
		int e = f + a;
		System.out.println(e);
	}

	public void method4() {
		d = 2;
		int z = 60;
		int y = z + d;
		System.out.println(y);
	}

//	public void method5() {
//		int h = 5;
//		int t = h + m;
//		System.out.println(t);
//	}

	public static void main(String[] args) {
		Test_2_Variables ref = new Test_2_Variables();
		System.out.println("Using Object --  "+ref.m);
		System.out.println ("Using Classname --  "+Test_2_Variables.m);
        System.out.println ("Direct calling --  "+m);
        
		
//		ref.method5();
		
	
	}
}
