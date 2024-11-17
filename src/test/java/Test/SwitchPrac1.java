package Test;

public class SwitchPrac1 {
public void method1(String list) {
switch (list) {
case "Elephant":
System.out.println("Wild Animal");
break;
case "Cow":
System.out.println("Domestic Animal");
break;
case "Peacock":
System.out.println("Bird");
break;
default:
System.out.println("Human");	
}
}

public static void main (String [] args) {
	SwitchPrac1 ref = new SwitchPrac1();
	ref.method1("Peacock");
}
}
