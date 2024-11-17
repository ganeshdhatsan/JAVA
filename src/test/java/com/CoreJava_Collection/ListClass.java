package com.CoreJava_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListClass {
 public void method1() {
// Array type:
 int[] a = new int[4];
 a[0] = 10;
 a[1] = 20;
 a[2] = 30;
 a[3] = 10;
 for (int i : a) {
 System.out.println(i);
 }
 System.out.println("a --> "+a); //in array method if we put like this, only we can get memory address
 System.out.println("a --> "+a[2]);

 // Declaration of list: 
 List l = new ArrayList();
 List l3 = new LinkedList();
 List l2 = new Vector();// legacy

 // add(object)
 l.add("mahath");
 l.add(100);
 l.add("mahathuva");
 l.add("sri");
//add(index,object) 
 l.add(0, "mahathuva"); 
 
 l.add("mahathuva");
 System.out.println("l --> " + l);

 // get(index)

 	System.out.println("getFirst "+l.getFirst());
 	System.out.println("getLast "+l.getLast());
 	System.out.println(l.get(2));

 // indexof(object)-(object means value)
 System.out.println("index of object val -- > " + l.indexOf("mahathuva")); //doubt
 //	int indexOf = l.indexOf(100);
 //	System.out.println("index of  -- > "+indexOf);
 
 //	Object object = l.get(indexOf);
 //	System.out.println("index of object val -- > "+object); 

 // lastIndexof(object)

 System.out.println(l.lastIndexOf("mahathuva"));

 //size()// to find the size of given list
 System.out.println("size --> " + l.size());

 // set(index,Object) -- to replace
 Object set = l.set(3, "mahi");
 System.out.println("set --> " + set);
 System.out.println("After set --> " + l);

 // isEmpty()
 boolean empty = l.isEmpty();
 System.out.println("isEmpty --> " + empty);

 // contains
 boolean contains = l.contains("mahi");
 System.out.println("contains --> " + contains);

 // addAll() -- copy from all values from one list to another list at a time

 List l1 = new LinkedList();
 l1.addAll(l);
 System.out.println("add all --> " + l1);

 // retainAll()
 l.add("synergy");
 l.add("wipro");

 //		boolean retainAll2 = l1.retainAll(l);
 //		System.out.println("l --> " + l);
 //		System.out.println("l1--> " + l1);
 
//		boolean retainAll = l.retainAll(l1);

//		System.out.println("l --> " + l);
//		System.out.println("l1--> " + l1);

 // remove(index)
 Object remove = l.remove(4);
 System.out.println("remove --> " + remove);
 System.out.println("After remove --> " + l);
		
 //removeAll()
 boolean removeAll = l.removeAll(l1);
 System.out.println("After removeAll l --> " + l);
 System.out.println("After removeAll l1 --> " + l1);
 }

 public static void main(String[] args) {
 ListClass ref = new ListClass();
 ref.method1();
 }
 }
