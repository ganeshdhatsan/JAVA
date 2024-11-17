package Test;

public class Test_3_Array {

	public void method1() {
		String[] fruits = new String[4];
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Carrot";
		fruits[3] = "dragon";

		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		for (String a : fruits) {
			System.out.println(a);
		}
	}

	public void method2() {
		String name = "My name is Mahathuva";
		String[] part = name.split(" ");
		for (int i = 0; i < part.length; i++) {
			System.out.println(part[i]);
		}
	}

	public void method3() {
		String name = "My name is Mahathuva";
        String result = " ";
		for (int i=name.length()-1; i>=0; i--) {
        char a = name.charAt(i);	
        result = result+a;
        }
		System.out.println(result);
	}

	public static void main(String[] args) {
		Test_3_Array ref = new Test_3_Array();
		ref.method3();

	}

}
