package Test;

public class March_A {
	private static March_A m1;
	private March_A() { }
	public static March_A getInstance() {
		if (m1==null) {
			 m1 = new March_A();
		}
	return m1;
	}
	public void pattern1() {
		System.out.println("March A -->"+"March");
	}
public static void main (String []args) {
	March_A.getInstance().pattern1();
}
}
