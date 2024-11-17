package com.CoreJava_String;

public class All_String_Methods {

	// 1. toLowerCase ();
	public void method1 () {
	String name1 = "Mahath";
	String name2 = "Sri";
	String lower = name1.toLowerCase ();
	System.out.println ("To Lowercase -->  "+lower);
	}

	// 2. toUpperCase ();
	public void method2 () {
	String name1 = "mahath";
	String name2 = "sri";
	String upper = name2.toUpperCase ();
	System.out.println ("To Uppercase -->  "+upper);
	}

	// 3. equals ();
	public void method3 () {
	String [] names = {"MAHATH", "Sri", "MahathuvA"};
	for (String name:names) {
	boolean result =name.equals("Sri");
	System.out.println("Equals1 -->  "+result);
	if (result == true) {
	break;
	}
//	if (name.equals ("MahathuvA")){
//	System.out.println ("Equals -->  "+name);
//	}
	}
	}

    // 4. equalsIgnoreCase ();
	public void method4 () {
	String [] names = {"MAHATH", "sri", "mahi"};
	for (String name:names) {
    boolean result = name.equalsIgnoreCase ("mahath");
    System.out.println ("EqualsIgnore -->  "+result);
    break;
//	if (name.equalsIgnoreCase ("mahath")) {
//	System.out.println ("Equals Ignore Case -->  "+name);
//	}
	}
	}

	// 5. contains ();
	public void method5 () {
	String name = "Mahathuvasri";
	boolean include = name.contains ("sri");
	System.out.println ("Contains -->  "+include);
	}

	// 6. trim ();
	public void method6 () {
	String name = " Mahathuvasri ";
	String trimming = name.trim ();
	System.out.println ("Trim -->  "+trimming);
	}

	// 7. length ();
	public void method7 () {
	String name = "Mahath";
	int count = name.length ();
	System.out.println (count);
	}

	// 8. startsWith ();
	public void method8 () {
	String [] names = {"shri", "sri", "Money", "pocket"};
	for (String name:names) {
	boolean starting = name.startsWith ("s");
	System.out.println ("Starts with Condition -->  "+starting);
	}
	for (String name: names) {
	if (name.startsWith("s")) {
	System.out.println ("Starts with -->  "+name);
	}
	}
	}

	// 9. endsWith ();
	public void method9 () {
	String [] names = {"shri", "sri", "Money", "pocket"};
	for (String name : names) {
	boolean ending = name.endsWith ("y");
	System.out.println("Ends with -->  "+ending);
	}
	}

	// 10. replace ();
	public void method10 () {
	String name = "Mahathuvam";
	String replacing = name.replace ("m","a");
	System.out.println ("Replace method -->  "+replacing);
	}

	// 11. replaceAll ();
	public void method11 () {
	String [] names = {"mahathi", "yuvathi", "janani", "yuvan"};
	for (String name : names) {
	String allreplacing = name.replaceAll ("i","a");
	System.out.println ("Replace All -->  "+allreplacing);
	}
	}

	// 12. concat ();
	public void method12 (){
	String name1 = "Mahathuva";
	String name2 = "Sri";
	String united = name1.concat (name2);
	System.out.println ("Concat -->  "+united);
	}

	// 13. indexOf ();
	public void method13 () {
	String name = "Mahathuvasri";
	int find = name.indexOf ("t");
	System.out.println ("Index Of -->  "+find);
	}

	// 14. lastIndexOf ();
	public void method14 () {
	String name = "Mahathuva";
	int findlast = name.lastIndexOf ("a");
	System.out.println("Last Index Of -->  "+findlast);
	}

	// 15. split ();
	public void method15 () {
	String name = "Mahathuva1sri1palanivel";
	String [] splitting = name.split ("1");
	for (String singleshot:splitting) {
	System.out.println("Split -->  "+singleshot);
	}
	}

	// 16. charAt ();
	public void method16 (){
	String name = "Mahathuva";
	char locate = name.charAt (3);
	System.out.println("Char At -->  "+locate);
	}

	public static void main (String [] args) {
	All_String_Methods result = new All_String_Methods();
	result.method1 ();
	result.method2 ();
	result.method3 ();
	result.method4 ();
	result.method5 ();
	result.method6 ();
	result.method7 ();
	result.method8 ();
	result.method9 ();
	result.method10 ();
	result.method11 ();
	result.method12 ();
	result.method13 ();
	result.method14 ();
	result.method15 ();
	result.method16 ();
	}
    }
