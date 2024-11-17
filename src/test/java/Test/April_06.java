package Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class April_06 {
	private void reversetheGivenString() {

		String given = "mahathuva sri";// irs avuhtaham
		String result = "";
		for (int i = given.length() - 1; i >= 0; i--) {
			char c = given.charAt(i);
			result = result + c;
		}

		System.out.println(result);
	}

	private void reverseTheGivenStringByEachWord() { 
		String given = "mahathuva sri"; //avuhtaham irs 
		String result = "";
		String[] split = given.split(" ");
		for (String single : split) {
			for (int i = single.length() - 1; i >= 0; i--) {
				char c = single.charAt(i);
				result = result + c;
			}
			result = result + " ";
		}
		System.out.println(result);
	}

	private void swappingTheGivenString() {
		String given = "mahathuva sri"; // sri mahathuva 
		String result = "";
		String[] split = given.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			result = result + split[i] + " ";
		}
		System.out.println(result);
	}

	private void removeTheDuplicateStringFromArray() {
		String[] given = { "mahathuva", "sri", "mahathuva", "chennai", "sri" };
		String[] result = new String[given.length];
		Arrays.sort(given);
		int count = 0;
		for (int i = 0; i < given.length - 1; i++) {
			if (given[i] != given[i + 1]) {
				result[count] = given[i];
				count++;
			}
		}
		result[count] = given[given.length - 1];
		for (int j = 0; j <= count; j++) {
			System.out.println(result[j]);
		}
	}

	private void removeTheDuplicateNumbersFromArray() {

		int[] given = { 2, 4, 1, 2, 3, 5, 2, 7, 4, 3, 5 };
		int[] result = new int[given.length];
		Arrays.sort(given);
		int count = 0;
		for (int i = 0; i < given.length-1; i++) {
			if (given[i] != given[i + 1]) {
				result[count] = given[i];
				count++;
			}
		}
		result[count] = given[given.length - 1];
		for (int i = 0; i <= count; i++) {
			System.out.println(result[i]);
		}
	}

	private void findTheOccurenceOfRepeatedCharactors() {
 String given = "mahathuvasri";
 Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
 for (int i = 0; i < given.length(); i++) {
	 char c = given.charAt(i);
	 if(m.containsKey(c)) {
		 Integer integer = m.get(c);
		 m.put(c, integer+1);
	 }
	 else {
		 m.put(c, 1);
	 }
}
 System.out.println(m);
	}

	public static void main(String[] args) {
		April_06 a = new April_06();
		a.reversetheGivenString();
		a.reverseTheGivenStringByEachWord();
		a.swappingTheGivenString();
		a.removeTheDuplicateStringFromArray();
		a.removeTheDuplicateNumbersFromArray();
		a.findTheOccurenceOfRepeatedCharactors();
	}
}
