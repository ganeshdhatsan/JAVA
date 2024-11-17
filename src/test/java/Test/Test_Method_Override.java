package Test;

public class Test_Method_Override {
	public void met1 () {
		String a = "abc";
		String b = "xyz";
		String value = a+b;
		System.out.println(value);
	}
public static void main (String [] args) {
	Test_Method_Override ref = new Test_Method_Override();
	ref.met1();
}
}
