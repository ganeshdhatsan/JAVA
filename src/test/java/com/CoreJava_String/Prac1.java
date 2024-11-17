package com.CoreJava_String;

public class Prac1 {

 public void to_Lower_Case () {
 String name = "YaaZHI";
 String history = name.toLowerCase ();
 System.out.println(history);
 }
	
 public void to_Upper_Case () {
 String name = "maha";		
 String changename = name.toUpperCase () ;
 System.out.println ("To Upper Case -->  "+changename);
 }

 public void  equals_Method1 () {
 String [] name = {"Mahath", "MAHATH", "MaHath", "MahatH"};
 for (String split: name) {
 boolean equal1 = split.equals ("MahatH");
 System.out.println ("M1 To Equals -->  "+equal1);
 }
 }

 public void  equals_Method2 () {
 String [] name = {"Mahath", "MAHATH", "MaHath", "MahatH"};
 for (String split: name) {
 boolean equals = split.equals ("MahatH");
 if(equals==true) { 
// if (split.equals ("MahatH")) { 
 System.out.println ("M2 To Equals -->  "+equals);
 break;
 }
 }
 }

 public void  equals_Method3 () {
 String [] name = {"Mahath", "MAHATH", "MaHath", "MahatH"};
 for (String split: name) {
 if (split.equals ("MahatH")) { 
 System.out.println ("M3 To Equals -->  "+split);
 break;
 }
 }
 }
 
 public void equals_Ignore_Case () {
 String [] names = {"Mahath", "Sri", "Pooja", "Ayan"};
 for (String getvalue: names) {
 boolean match = getvalue.equalsIgnoreCase ("MAHATH");
 System.out.println ("To Equals Ignore Case -->  "+match);
 }
 }
		
 public static void main (String [] args) {
 Prac1 output = new Prac1 () ;
 output.equals_Method1 ();
 output.equals_Method2 ();
 output.equals_Method3 ();
 }
 }