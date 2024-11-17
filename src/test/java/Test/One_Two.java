package Test;

public class One_Two {
public void m2 () {
	int x = 6;
	int y = 3;
	int z = x+y;
	System.out.println("One_Two --  "+z);
	}
public static void main (String [] args) {
	One_Two ref = new One_Two ();
	ref.m2();
}
}
