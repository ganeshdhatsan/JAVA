package Test;

enum Colours{
	red,white
}
public class EnumClass {

	private void method1() {
Colours name =Colours.red;
Enum flower =Enum.rose;
System.out.println(flower);
System.out.println(name);
int name1 =Enum.a;
	}
	
	public static void main(String[] args) {
		EnumClass e = new EnumClass();
		e.method1();
	}
}
