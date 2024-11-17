package com.CoreJava_String;

public class All_Syntax_and_Purpose {

//Class: notation : Pascal
// AM AS class name { }

//Method: Notation : Camel
// AM AS RT name () {}
	
//Main Method:
// AM static void main (String [] args ) { }	

//Variable:
// DT variablename = value; // syntax
// Ex: int result = 95;
	
//Object:
// classname variable = new classname ();
	
//Wrapper Class:
// int = Integer
// int to String = Integer.toString ();	

// char = Character 
// char to String = Character.toString ();
		
// float = Float 
// float to String = Float.toString ();
		
// long = Long 
// long to String = Long.toString ();

// String = String 
// String to int = Integer.parseInt("1254045");
// String to double = Double.parseDouble("0.54546");	
// String to long = Long.parseLong("1254045");
// String to float = Float.parseFloat("0.54546")
// String to boolean = Boolean.parseBoolean("True");
		
// double = Double 
// double to String = Double.toString();
		
// boolean = Boolean = 
// boolean to String = Boolean.toString(false);	

//String:	
// Literal String:
// DT variablename = value; // syntax 
// String house = "Bonsai";
// to declare the string variable. 
// it will share the memory space for the duplicate values.	
	
// Non-Literal String:
// classname variable = new classname ("text/numeric"); // syntax
// to declare the string variable with new keyword.
// All values created in a new memory space, because it is 
// mentioned "New".	

//String Method:	// RT variable = reference variable.string method name ();
// 1. toUpperCase () ;
// String name = "Mahathuvasri"; // (we need this line for syntax)
// String text = name.toUpperCase (); // syntax
// change the given string to uppercase.	

// 2. toLowerCase () ;
// String city = "CHEnnai";
// String collect = city.toLowerCase (); // syntax
// change the given string to lowercase.
	
// 3. equals ();
// String group1 = "Mana";
// String group2 = "Nana";
// boolean combine = group1.equals (group2); // syntax
// to compare the 2 different string with case sensitive.
	
// 4. equalsIgnoreCase ();
// String group1 = "Mana";
// String group2 = "MAna";
// boolean combine = group1.equalsIgnoreCase (group2); // syntax
// to compare the 2 different string without case sensitive.

// 5. contains ();
// String country = "India is my country";
// boolean check = country.contains ("India"); // syntax for String
// boolean check1 = country.contains ('t'); // syntax for char
// to check whether the given String or Char is available or not.
	
// 6. trim ();
// String value = " 8504578962";
// String value1 = "123456786 ";
// String value2 = " 124564646 ";
// String space = value.trim (); // syntax
// It is used to remove the space from the 1st and last. 
// It is not removed the space in between the String.	

// 7. length ();
// String value = "46578154654";
// String fruit = "Apple";
// int howmuch = value.length (); // syntax
// int kitna = fruit.length (); // syntax
// to find the count from the given string. 
// (The string should be a group of character or numeric)
	
// 8. startsWith ();
// String university = "Sathyabama";
// boolean check = university.startsWith ('S'); // syntax
// boolean check1 = university.startsWith ("Sath"); // syntax
// To check whether the given string startswith the character or String which is the specific.
	
// 9. endsWith ();
// String university = "Sathyabama";
// boolean check = university.endsWith ('S'); // syntax // result "FALSE"
// boolean check1 = university.endsWith ("ama"); // syntax // result "TRUE"
// To check whether the given string endswith the character or String which is the specific. 

// 10. replace ();
// String hostel = "Babu's PG";
// String work = hostel.replace ('b', 't'); // syntax
// String work1 = hostel.replace ("'", ""); // syntax
// String work2 = hostel.replace ("PG", "Hostel"); // syntax
// String work3 = hostel.replace (" ", ""); // syntax	
// To replace a character/String/Space/Special Character/numeric - 
// (it could be anything)- from the given string to the single place.
	
// 11. replaceAll ();
// String hostel = "Babu's PG";
// String work = hostel.replaceAll ('b', 't'); // syntax
// String work1 = hostel.replaceAll ("'", ""); // syntax
// String work2 = hostel.replaceAll ("PG", "Hostel"); // syntax
// String work3 = hostel.replaceAll (" ", ""); // syntax	
// To replace a character/String/Space/Special Character 
// from the given string to all the places.

// 12. concat ();
// String city = "Chennai";
// String city1 = "Madras";
// String merge = city.concat (city1);  // syntax
// String merge1 = city+city1; // syntax
// to merge the 2 different String.
	
// 13. indexOf ();
// String veg = "Coconut";
// int check = veg.indexOf ('n'); // syntax
// to find the 1st occurrence of the index for the 
// given character from the string.
	
// 14. lastIndexOf ();
// String veg = "Coconut";
// int check = veg.lastIndexOf ('o'); // syntax
// to find the last occurrence of the index for the 
// given character from the string.

// 15. split ();
// String word = "India is the best country"; 
// String [] separate = word.split (" ");  // syntax
// String [] separate1 = word.split ('the'); // syntax
// To split the given string based on a character/space/special character. 
// (yendha idathula split panna nenaikiromo, andha character or 
// space a mention pannanum. 
// So that, nama kudutha input a remove pannitu, 
// namaku split panni kudukum.)
	
// 16. charAt ();
// String name = "Mahathuvasri";
// char find = name.charAt (5);  // syntax 
// to find the character by passing the index from the string.

// 17. toCharArray ();
// String name = "Mahathuva";
// char [] show = name.toCharArray (); // syntax
// To get a each character from the given string. 
// Ex: 
// M
// A
// H
// A
// T
// H
// U
// V
// A
	
// 18. subString ();
// String name = "Mahimasri";
// String result = name.subString (0,6); // syntax // 
// fetch the value from 0th index to 5th index. 
// It wont take 6th index char.
// String result1 = name.subString (6); // syntax // 	
// if we given 1 index, it will calculate from the exact 
// index which we given. So it will give the result from the 
// index and after that values.	
	
	
// 19. compareTo ();
// String city = "Chennai";
// String city1 = "Madras";
// int result = city.compareTo (city1); // syntax //
// to compare and substract the 2 different string 
// based on the ASSCCI value.	
	
}
