package Test;

public class SwitchUsingEnum {
enum days{
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;	
}
public void method1( days day) {
switch(day) {
case SATURDAY:
System.out.println("Last Day");
break;
case SUNDAY:
System.out.println("First Day");
break;
default:
System.out.println("Weekdays");	
}
}
public static void main (String [] args) {
	SwitchUsingEnum ref = new SwitchUsingEnum();
	ref.method1(days.SUNDAY);
}
}
