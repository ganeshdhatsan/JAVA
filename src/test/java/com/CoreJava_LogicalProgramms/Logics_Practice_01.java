package com.CoreJava_LogicalProgramms;

public class Logics_Practice_01 {

	static void reverseThespecificWordFromTheGivenString(String question) {
		String name = "my name is mahathuva sri";
		String result = "";
		String[] split = name.split(" ");
		for (String single : split) {

			if (single.equalsIgnoreCase(question)) {
				for (int i = single.length() - 1; i >= 0; i--) {
					char c = single.charAt(i);
					result = result + c;

				}
				result = result + " ";
			} else {

				result = result + single + " ";
			}
		}
		System.out.println(result);
	}

	static void swappingTheTheGivenString() {
		String name = "mahathuva sri";
		String result = "";

		String[] split = name.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			result = result + split[i] + " ";
		}
		System.out.println(result);

	}

	static void printOddAndEvenNumbersFromGivenArray() {

		int[] name = { 1, 8, 3, 22, 38, 10, 43, 97, 12, 31 };

		for (int ans : name) {

			if (ans % 2 == 0) {
				System.out.println("even number " + ans);
			}
			if (ans % 2 != 0) {
				System.out.println("Odd number " + ans);
			}

			if (ans % 5 == 0) {
				System.out.println("divisible by 5 " + ans);
			}
			if (ans % 10 == 7) {

				System.out.println("remainder is 7 " + ans);

			}
			if (ans > 9 && ans < 100) {

				System.out.println("2 digits are " + ans);
			}

			System.out.println("square root " + Math.sqrt(ans));

			System.out.println(" cubic " + Math.pow(ans, 3));

		}
	}

	private static void sumProgrammsArray() {
		int[] numbers = { 1, 8, 3, 22, 38, 10, 43, 97, 12, 31 };
		int sumeven = 0;
		int sumOdd = 0;
		int sumtwoDigit = 0;
		int positive = 0;
		for (int single : numbers) {
			if (single % 2 == 0) {
				sumeven = sumeven + single;

			}

			if (single % 2 != 0) {
				sumOdd = sumOdd + single;

			}

			if (single > 9 && single < 99) {
				sumtwoDigit = sumtwoDigit + single;

			}
			if (single > 0) {
				positive = positive + single;

			}
		}
		System.out.println("sumeven " + sumeven);
		System.out.println("sumOdd " + sumOdd);
		System.out.println("sumtwoDigit " + sumtwoDigit);
		System.out.println("positive " + positive);
	}
	
	private static void productsProgramme() {
		int[] numbers = { 1, 8, 5,3, 22, 38, 10,15, 43, 97, 12, 31 };
		int evenans = 1;
		int oddans=1;
		int Twodigits=1;
		int positive=1;
		int evenCounts =0;
		int oddCounts =0;
		int twoCounts =0;
		int posCounts =0;
		
		for (int single : numbers) {
			if(single%10==5||single==5) {
				System.out.println("ending with five "+single);
			}
//			if(single%2==0) {
//				evenans = evenans*single;
//				evenCounts++;
//			}
//			if(single%2!=0) {
//				oddans = oddans*single;
//				oddCounts++;
//			}
//			if(single>9&&single<100) {
//				Twodigits = Twodigits*single;
//				twoCounts++;
//			}
//			if(single>0) {
//				positive = positive*single;
//				posCounts++;
//			}
		}
		System.out.println("product of even numbers "+evenans);
		System.out.println("product of Odd numbers "+oddans);
		System.out.println("product of 2 digit  numbers "+Twodigits);
		System.out.println("product of  positive  numbers "+positive);
		System.out.println("----------------------------------------");
		System.out.println("count of even numbers "+evenCounts);
		System.out.println("count of Odd numbers "+oddCounts);
		System.out.println("count of 2 digit  numbers "+twoCounts);
		System.out.println("count of  positive  numbers "+posCounts);
	}
	
	private static void printMinAndMaxNumberFromGivenArray() {
		int[] numbers = { 1, 8, 5,3, 22, 38, 10,15, 43, 97, 12, 31 };
		
		int min=numbers[0];
		int max=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			if(numbers[i]<min) {
				min =numbers[i];
			}
		}
System.out.println("min "+min);
System.out.println("min "+max);
	}
	
	private static void printASCIIValueOfGivenArray1() {
	    Object[] given = {'Y', 1, 'Z', 8, 'b', 5, 3, 'A', 22};
	    for (int i = 0; i < given.length; i++) {
	        int intValue = 0;
	        try {
	            intValue = (int) given[i]; // Attempt to directly cast to int
	        } catch (ClassCastException e) {
	            intValue = (char) given[i]; // If it's a char, cast to char first and then to int
	        }
	        System.out.println((i + 1) + " ASCII of " + given[i] + " is " + intValue);
	    }
	}

	public static void main(String[] args) {
		Logics_Practice_01 l = new Logics_Practice_01();
//		reverseThespecificWordFromTheGivenString("name");
//		swappingTheTheGivenString();
//		printOddAndEvenNumbersFromGivenArray();
//		sumProgrammsArray();
//		productsProgramme();
//		printMinAndMaxNumberFromGivenArray();
		printASCIIValueOfGivenArray1();
	}

}
