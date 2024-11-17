package com.CoreJava_String;

public class String_Concepts {
//literal string
// String name = "aura";
// String name1 = "aura";
// String name2 = "aura";
//non-literal string
// String name3 = new String ("aura");
// String name4 = new String ("aura");
// String name5 = new String ("aura");
// 
// String city = "pallikaranai";
 
 // to uppercase
 //to lowercase
 //to char
 // replace
 //replaceall
 
 public void name() {
	
//	 System.out.println(System.identityHashCode(name));
//	 System.out.println(System.identityHashCode(name1));
//	 System.out.println(System.identityHashCode(name2));
//	 System.out.println(" ");
//	 System.out.println(System.identityHashCode(name3));
//	 System.out.println(System.identityHashCode(name4));
//	 System.out.println(System.identityHashCode(name5));
//	
	
}
 
 public void stringMethods() {
		
//	// 1) to uppercase
//	 String upperCase = city.toUpperCase();
//	 System.out.println("To UpperCase "+upperCase);
//	 
//	 // 2) to lowercase
//	 String lowerCase = upperCase.toLowerCase();
//	 System.out.println("To LowerCase "+lowerCase);
//	
//	 // 3) replace
//	 String replace = lowerCase.replace('p', 'P');
//	 System.out.println("After replace "+replace);
//	 String replace2 = replace.replace('k', 'K');
//	 System.out.println("Replace "+replace2);
//	 
//	 // 4) replaceall
//	 
//	 String replaceAll = replace2.replaceAll(replace2, "Medavakkam");
//	 System.out.println("ReplaceAll "+replaceAll);
//	 
//	// 5) contains
//	 boolean contains = city.contains("karanai");
//	// System.out.println("Contains --> "+contains);
	
	 // 6) equals
	 
//	 String bus = "amni";
//	 String bus1 = "gov";
//	 boolean equals = bus.equals(bus1);
//	 System.out.println("Equals --> "+equals);
//	
//	 String bus2 = "amni";
//	 String bus3 = "amni";
//	 boolean equals2 = bus2.equals(bus3);
//	 System.out.println("Equals2  -->"+equals2);
//	 
//	 String bus4 = "amni";
//	 String bus5 = "Amni";
//	 boolean equals3 = bus4.equals(bus5);
//	 System.out.println("Equals3 -->"+equals3);
//	 
//	 // 7) equals ignore case
//	 String university = "madras";
//	 String university1 = "Madras";
//	 boolean equalsIgnoreCase = university.equalsIgnoreCase(university1);
//	 System.out.println("EqualsIgnoreCase  -->"+equalsIgnoreCase);
//	 
//	 String university2 = "Madras";
//	 String university3 = "Anna";
//	 boolean equalsIgnoreCase2 = university2.equalsIgnoreCase(university3);
//	 System.out.println("EqualsIgnoreCase2  -->"+equalsIgnoreCase2);
	 
	 
	 
//	 //  ==  (?)
//	 String name = "Mahathuva";
//	 String name1 = "Mahathuva";
//	// name==name1;
//	 System.out.println("==  -->"+name==name1);
//	 
	 
//	 // 8) starts with 
//	 String line = "Mahathuva";
//	boolean startsWith = line.startsWith("M");
//	System.out.println("StartsWith  -->"+startsWith);

	
	 
//	 // 9) ends with
//	 String number = "8056175886";
//	 boolean endsWith = number.endsWith("75886");
//	 System.out.println("EndsWith-->  "+endsWith);
//	 
//	 String word = "Sri";
//	 boolean endsWith2 = word.endsWith("i");
//	 System.out.println("EndsWith2  -->"+endsWith2);
	 
//	 // 10) length
//	 String check = "Mahima";
//	 int length = check.length();
//	 System.out.println("Length  -->"+length);
//	 
//	 String check1 = "MahathuvaSri"; //12
//	 int length2 = check1.length();
//	 System.out.println("Length2  -->"+length2);
//	 
//	 String check2 = "Mahathuva Sri"; //13
//	 int length3 = check2.length();
//	 System.out.println("Length3  -->"+length3);
//	 
//	 String check3 = " Mahathuva Sri "; //15
//	 int length4 = check3.length();
//	 System.out.println("Length4  -->"+length4);
	 
//	 // 11) trim
//	 String remove = " 123 456 ";
//	 String trim = remove.trim();
//	 System.out.println("Trim  -->"+trim);
//	 
//	 String removeAllSpace = remove.replaceAll(" ", "");
//	 System.out.println("Trim2  -->"+removeAllSpace);
	 
	 // control statement
	 // 1. while loop  2. do while loop  3. for loop  4. for each loop 
	 
	 // 3. For loop 
//	 for (int i = 1; i <10; i++) {
//		System.out.println(i);
//		System.out.println("loop "+i+" completed");
//	
//		
//	 }
//	 
//	 for (int i =10; i >=1;  i--) {
//			System.out.println(i);
//			System.out.println("loop "+i+" completed");
//	 }
	 
//	 for (int i = 1; i <10+1; i++) {
//		System.out.println(i);
//		System.out.println("loop "+i+" completed");
	
		
//	 }
 
	 
	 
	 // 12) index of (starts with 0. So calculate from zero)
//	 String baby1 = "Amaya"; // 3
//	 int indexOf = baby1.indexOf('A');
//	 System.out.println("Index of -->  "+indexOf);
	 

	 
	 // 13) last index of
//	 
//	 String baby1 = "Amaya"; // 3
//	 int lastIndexOf = baby1.lastIndexOf('a');
//	 System.out.println("Last Index of -->  "+lastIndexOf);
	 
	 // 14) char at
//	 String boy = "Riyaz";
//	 char ennavo = boy.charAt(3);
//	 System.out.println("Char at -->  "+ennavo);
//	 
	 // 15) concat
	 
//	 String name1 = "mahathuva";
//	 String name2 = "sri";
//	 String concat = name1.concat(name2);
//	 System.out.println("Concat -->  "+concat);
//	 
	 
	 // 16) split
//	 
//	 String name3 = "mahathuvasri";
//		 String replace = name3.replace("s", " s");
//	 System.out.println(replace);
//	 String[] split = replace.split(" ");
//	 for (int i = 0; i < split.length; i++) {
//		 System.out.println("Split -->  "+split[i]);
//		
//	}
//	 String split1 = replace.split(" ")[1];
//	 System.out.println("Split 1 -->  "+split1);
	 
	 String date = "10-02-2024 19:13:07";
	 String[] separate = date.split(" ");
	 System.out.println(separate[0]);
	 System.out.println(separate[1]);
	 
//	 for (int i=0; i<separate.length; i++) {
//		System.out.println(separate[i]); 
//	 }
	 
//	 String string = date.split(" ") [0];
	 
	 
//	 System.out.println(split);
	 
	 
	 // 17) to char array
	String name ="mahathuva";
	char [] names=name.toCharArray();
for (char c : names) {
	System.out.println("To Char array -->  "+c);
	
}
	 
	 // 18) sub string
String name1 ="mahathuva";
String subString = name1.substring(0, 6);
System.out.println(subString);
String substring2 = name1.substring(7);
System.out.println("Substring -->  "+substring2);

	 
	 // 19) compare to
String name10 = "Maha"; //77
String name11 = "maha"; //109
int compareTo = name10.compareTo(name11);
System.out.println("CompareTo -->  "+compareTo);//32
	 
//	Reverse for loop
	 //for (int i=10; i>0; i--) {
//		System.out.println(i);
//		System.out.println("loop  "+i+"  completed");
//	}
//	

}

//1. Oru date a string ah declare pannu. 02/19/2024 12:05 PM. Date a mattum eduthu kudu
// Type 1:
 public void method_Split () {
	 String date = "02/19/2024 12:05 PM";
	 String[] splitting = date.split(" ");
//	 splitting [0] = "02/19/2024";
//	 splitting [1] = "12:05";
//	 splitting [2] = "PM";
//	 for (int i=0; i<splitting.length; i++) {
//	 if (splitting [i].equals ("02/19/2024")) {
//	 System.out.println(splitting[i]);
//	 }	 
//	 }
//Type 2:
	 System.out.println(splitting[0]);
	  }
 
//2. Mahathuva sri. SriMahathuva nu ans varanum.
 // Type 1:
     public void method_concat () {
    	 String name = "Mahathuva Sri";
    	 String [] divide = name.split (" ");
//    	 System.out.println(divide[1]);
    	 String answer = divide[1]+divide[0];
     System.out.println(answer);
// Type 2:
     String answer1 = divide[1].concat(divide[0]);
     System.out.println(answer1);
     }
     
//2.1 Mahathuvasri. SriMahathuva nu ans varanum 
// Type1:    
     public void method10 () {
     String name = "Mahathuvasri";
//     String namey = name.substring(0, 9);
//     System.out.println(namey);
//     String namey1 = name.substring(9);
//     System.out.println(namey1);
//     String namiie = namey1.concat(namey);
//     System.out.println(namiie);
    
//Type 2:
     int findM = name.indexOf('M');
     int findA = name.lastIndexOf('a');
     String findMA = name.substring(findM, findA+1);
     System.out.println(findMA);
     }
     
     
     // 3. Mahathuvasri. print reverse
 
 
 
 public static void main(String[] args) {
	
	 String_Concepts sc = new String_Concepts();
	// sc.name();
	 sc.stringMethods();
	 
	 
}

// 
}

// 1. toLowerCase ();
// 
//

// 2. toUpperCase ();
// 
//

// 3. 

