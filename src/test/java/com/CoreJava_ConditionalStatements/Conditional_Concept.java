package com.CoreJava_ConditionalStatements;

public class Conditional_Concept {
	private static Conditional_Concept v1;
	private Conditional_Concept() {
		
	}
	public static  Conditional_Concept getInstance () {
if(v1==null) {
	 v1 = new Conditional_Concept();}
	return v1; 

	
}
		public void fileName () {
		String name1 = "Sri";
		String name2 = "Sri";
		String name3 = "sri";
		String name4 = "abc";  //979899
		String name5 = "ABC";  //656667
		String name6 = "Abc";  //659899
		String name7 = "Abc";  //659899
		
//		boolean equals = name6.equals(name7);
//		System.out.println(equals);
//		boolean equalsIgnoreCase = name4.equalsIgnoreCase(name5);
//		System.out.println(equalsIgnoreCase);
		
//		if(name4.equals(name5)) {
//		System.out.println("True");
//		}
//		else {
//		System.out.println("False");
//		}
//		
		int value1 = 10;
		int value2 = 20;
		int value3 = 30;
//
//		if(value2<value1) {
//		System.out.println("True");
//		}
//		else {
//		System.out.println("False");
//		}
		
//      10<20; 20<30;  
//	    if(value1<value2) {
//		System.out.println("True");
//	    }
//		else if(value2<value3) {
//		System.out.println("True");
//	    }
//	    else {
//		System.out.println("False");
//	    }
	
	    String access1 = "Ganesh";
	    String access2 = "Sri";
	    String access3 = "Mahath";
		if(access1.equals(access2)) {
		System.out.println("1  --> True");
		}
	    else if (access2.equals(access2)) {
		System.out.println("2  --> True");
		}
	    else if (access3.equals(access1)) {
		System.out.println("3  --> True");
	    }
	    else {
		System.out.println("False");
		}
	    }
	
    	public static void main(String [] args ) {
		Conditional_Concept output = new Conditional_Concept();
		output.fileName();
		}
        }
