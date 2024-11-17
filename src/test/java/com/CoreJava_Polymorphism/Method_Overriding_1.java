package com.CoreJava_Polymorphism;

public class Method_Overriding_1 extends Method_Overriding_2{
	public void homeloan () {
	System.out.println("homeloan");
	}
    public void carloan () {
    System.out.println("carloan");
this.alpha();
super.alpha();
super.homeloan();
super.bikeloan();
    }

    public void alpha () {
    System.out.println("Alpha");
    }
public static void main (String [] args) {
	Method_Overriding_1 ref = new Method_Overriding_1 ();
	ref.carloan();
	Method_Overriding_2 ref1 = new Method_Overriding_2 ();
	ref1.homeloan();	
	}
    }
