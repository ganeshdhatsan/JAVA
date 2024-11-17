package Test;

import com.CoreJava_Array.Array_Concepts;

public class One {
	public void m1() {
		int a = 10;
		int b = 5;
		int c = a + b;
		System.out.println("One --"+c);
	}

//	static String [] names = {"Apple", "Banana", "Carrot"};
	
	public static void main(String[] args) {
//		One ref1 = new One();
//		ref1.m1();
//		One_Two ref2 = new One_Two () ;
//		ref2.m2();
		Array_Concepts a = new Array_Concepts ();
//		a.alpha();
		a.main(args);
	}
}
