package Test;

import java.util.Arrays;

// array declare panna therila
// variable declare panna therila
public class Test_1 {
private static final int Mahathuvasri = 0;

private void test1 () {
	
// 1. Oru date a string ah declare pannu. 02/19/2024 12:05 PM. Date a mattum eduthu kudu
	String date = "02/19/2024 12:05 PM";
	String particular = date.substring(0,10);
	System.out.println ("Pick a date only -->  "+particular);
	
// 2. Mahathuva sri. SriMahathuva nu ans varanum.
	String name = "Mahathuva Sri";
	String [] separate = name.split(" ");
//	String [] separate = {"Mahathuva", "Sri"}; // Type 1 declaration
//	String [] separate = new String [2]; // Type 2 declaration
//	separate [0] = "Mahathuva";
//	separate [1] = "Sri";
	
	String merge = separate[1].concat(separate[0]);
	System.out.println ("Wise versa name -->  "+merge);
	
	
			
// 3. Mahathuvasri. print reverse
//	String [] name1  = {"Mahathuvasri"};
//	for (int i=0; i<name1.length; i--) {
//	System.out.println("Print the name reverse -->  "+name1[i]);
//	}

// 4. P.Mahathuvasri. Print P Mahathuvasri
	 String name2 = "P.Mahathuvasri";
	 String space = name2.replace(".", " ");
	 System.out.println ("Space instead of dot -->  "+space);

// 5. 2 string declare pannanum. 1 is literal string, another one is non literal string. Both strings are Mahathuvasri (Spelling maara koodadhu). compare both are equal or not
//	Type 1:
//	Type 2:
	 
	 
// 6. Mahathuvasri. change Mahathuva to upper case and Sri lower case. space venum btw mahathuva and sri.
	 
// 7. My name is Mahathuvasri. 13th index la * kudukanum. 20th index la # kudukanum.
	 
// 8. i am a senior software test engineer. ans need without space. every character individual ah print aaganum.
	  String name3 = "I am a software test engineer";
	  String spaces = name3.replace(" ", "");
	  System.out.println("Without Space -->  "+spaces);
	  char [] each = spaces.toCharArray ();
//	  System.out.println("Print each char -->  "+each[]);
	  
// 9. i am a senior software test engineer. check whether chennai is there or not.
	 String sentence = "I am a senior software test engineer";
	 boolean check = sentence.contains("chennai");
	 System.out.println("Check Chennai -->  "+check);
	 
// 10. Declare 5 Strings. Bulki, silky, kulki, light, weight. 
// y la mudiyira string mattum eduthu kudu. S la start aagura string eduthu kudu.
	String [] names = {"Bulky", "Silki", "Kulky", "Light", "Weight"};
	for (String single:names) {
//	if (single.startsWith ("S") ||single.endsWith("y")){
	if (single.startsWith ("S")) {
	System.out.println ("Starts with s -->  "+single);
	}
	if (single.endsWith("y")) {
	System.out.println("Ends with y -->  "+single);
	}

	}
//	sort (ascending) the given string
	String values = "chennai";
//	acehinn
	char []city = values.toCharArray ();
	Arrays.sort(city);
	System.out.println (city);
  
	char [] values1 = {'a', 'b', 'c'};
	System.out.println(values1);
	
	int [] declare = {0,2,3};
	System.out.println(declare);
	
	String[] declares = {"Madras", "chennai"};
	System.out.println(declares);
	
	// oru array la 5 values iruku. adhula 3rd value mattum venum. ans 3 type la venum. 

//	for loop laye venum.
//	if la onnu
//
//	int [ ] number = {1, 4, 8, 5, 2};
//	for (int i=0; i<number.length; i++) {
//	if (number[i]==8) {
//	System.out.println (number[i]);
//	}
//	}
//	System.out.println (number[2]);
//
//
//	for (int i=2; i<=2; i++) {
//
//	System.out.println (number[i]);
//	}


//	String name = "03/03/2024 18:08 IST";
//	String [] timezone = name.split (" ");
//	String [0] timezone = 03/03/2024;
//	String [1] timezone = 18:08;
//	String [2] timezone = IST;
//	System.out.println (timezone[2]);


//	String [ ] fruits = {"orange", "apple", "grapes"};
//	for (int i=0; i<fruits.length; i++){
//	if (fruits[i].equals ("apple")){
//	System.out.println (fruits[i]);
//	}
//	}
//
//
//
//	String [ ] name = {"03/03/2024",  "18:08", "IST"};
//	if (name[3].equals ("IST")) {
//	System.out.println (name[3]);
//	}



}

public static void main (String [] args) {
	Test_1 rs = new Test_1();
	rs.test1 ();
	}
}
