package Test;

public enum EnumPrac1 {
	JAVA,
	PHP,
	PYTHON,
	API;
	int a;
	static int b;
	final int c =10;
 static final int d =17;
   
   public void m1() {
	   System.out.println("Normal Method");
	    }
public static void m2() {
	System.out.println("Static Method");
}
public final void m3() {
	System.out.println("Final Method");
}
 EnumPrac1() {
}
public static void main (String [] args) {
//	EnumPrac1 ref = new EnumPrac1();
//	ref.m3();
}
}
