package com.CoreJava_Variables;

public class Variable_Practice1 {

	int mangoPrice;

	public static int pineapplePrice =200 ;
	

	public void local_Variaable1 () {
		 int mangoPrice = 200;
		 int pineapplePrice = 60;
		 System.out.println("local_Variaable1 mangoPrice   "+mangoPrice);
		 System.out.println("local_Variaable1 pineapplePrice   "+pineapplePrice);
    }
	public static void local_Variable2 () {
		 int mangoPrice = 500;
		 int pineapplePrice = 80;
		 System.out.println("local_Variable2 mangoPrice   "+mangoPrice);
		 System.out.println("local_Variable2 pineapplePrice   "+pineapplePrice);

	}
public static void main (String [] args) {
	Variable_Practice1 outcome = new Variable_Practice1();
	Variable_Practice1 outcome1 = new Variable_Practice1();
//	outcome.local_Variaable1();
//	outcome.local_Variable2 ();
//	System.out.println(outcome.pineapplePrice);
//	System.out.println(outcome1.pineapplePrice);
//	System.out.println(outcome.mangoPrice);
//  System.out.println(pineapplePrice);
//	System.out.println(Variable_Practice1.pineapplePrice);
//  System.out.println(outcome.pineapplePrice);
//  System.out.println(mangoPrice);
//	System.out.println(Variable_Practice1.mangoPrice);
//	System.out.println(outcome.mangoPrice);
	local_Variable2();
	Variable_Practice1.local_Variable2();	
	outcome.local_Variable2();

    }
    }

