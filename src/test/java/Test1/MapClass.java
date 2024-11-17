package Test1;

public class MapClass extends MapDummy{
public void m1() {
System.out.println("Map Class M1");	
}
public void m2() {
System.out.println("Map Class M2");	
}
@Override
	public void m4() {
System.out.println("MapClass M4");
}

public static void main (String [] args) {
MapClass	ref = new MapClass();
ref.m1();
ref.m4();
}
}
