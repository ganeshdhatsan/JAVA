package com.CoreJava_SwitchCase;

public class SwitchCaseConcept {
	
	
	private void method(String ques) {

		String name = "maha";
		if(name.equalsIgnoreCase(ques)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	public void method2(int value) {
		int count = 10;
		if (count== value) {
			System.out.println("True");
		}
		else {
			System.out.println("False because value is "+value);
		}
	}
	
	private void switchCase(int value) {
		switch(value) {
		
		case 10: 
			System.out.println("True");
		break;
		default :
			System.out.println("False because value is "+value);
		}

	}
	
	private void switchCase1(int value) {
		switch(value) {
		case 35:
			System.out.println("fail");
			break;
		case 60:
			System.out.println("first class");
			break;
		case 75:
			System.out.println("distinction");
			break;
		case 95:
			System.out.println("Gold Medalist");
			break;
			
			default :
				System.out.println("not attempted");
		}

	}
public static void main(String[] args) {
	SwitchCaseConcept s = new SwitchCaseConcept();

//s.method2(5);
//s.switchCase(20);
s.switchCase1(75);
}
}
