package com.CoreJava_Enum;

import Test.EnumFlag;
import Test.EnumFlag.flag;

public class EnumFlagSwitch {
public void method1(EnumFlag.flag colors)	{
switch (colors) {
case GREEN:
System.out.println("Agri");
break;
case ORANGE:
System.out.println("Sacrifice");
break;
case WHITE:
System.out.println("Peace");
break;
case BLUE:
System.out.println("Knowledge");
default:
System.out.println("Thers is no color in Flag");	
}
}
public static void main (String [] args) {
	EnumFlagSwitch ref = new EnumFlagSwitch();
	ref.method1(EnumFlag.flag.RED);
	
}
}
