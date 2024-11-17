package Test;

public class Normal_Classs01 extends Abstract_01{
	public void method1 () {
		int x = 5;
		int y = 9;
		int z = x+y;
		System.out.println();
	}
public static void main (String [] args) {
	Normal_Classs01 ref = new Normal_Classs01 ();
	ref.method1();
	ref.met2();
	ref.met4();
	ref.met1();
	}
@Override
public void met1() {
super.met2();
super.met4();
}


    }
