package Test;

public class Test_9_Class_F extends Test_8_Class_E implements InterfaceC {
	public void method6() {
		String name6 = "Pineapple";
		System.out.println(name6);
	}
 public static void main (String [] args) {
	 Test_9_Class_F ref = new Test_9_Class_F ();
	 ref.method6();
	 ref.method5();
     ref.methodC();
 }
@Override
public void methodC() {
	int a = 10;
	System.out.println(a);
 }
 }
