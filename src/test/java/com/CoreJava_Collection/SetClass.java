package com.CoreJava_Collection;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.List;
	import java.util.Set;
	import java.util.TreeSet;
	
	public class SetClass {	 
		
//Set
//===
//collection - super Interface
//set - child Interface

//List
//====
//1.Duplicates are allowed
//2.Insertion order
	
// List l = new arraylist();
// l.add("java");
// l.add("selenium");
// l.add(100);
// java selenium  Insertion Order
// 0      1
	
// Default size 10
// List l = new arraylist(); --> we can add dissimilar data types
// List <String> l1 = new ArrayList<String>(); -- we are controlling our data types through <Wrapperclass>,
// <> doesn't support any data type supports only wrapper class

// Set
// ===
// 1.Duplicates never allowed , doesn't show any compile time error while adding duplicate value
// where as in run time , it will keep first duplicate value only
// 2.value based not index based
// 3. can use only for each loop

// implementing class
// ==================
// 1.Hashset
// 2.LinkedHashSet
// 3.TreeSet
	
// 2.output order
// ===============
// 1.Hashset -- Random order
// 2.LinkedHashSet -- Insertion order
// 3.TreeSet
// ==========
// -- Ascending order of ASSCII Value of the given input
// Ex
// Mahath 33
// mahath 67
// TreeSet allows only similar datatypes(Wrapper Class)
// <Wrapper Class>. if we are trying to add dissimilar data types ,
// it will through ClassCast Exception
// Never allows null and will through Null Pointer Exception
// HashSet  -- 16
// 75%
		
 private void method() {
  List l1 = new ArrayList();
  List <Integer>l2 = new ArrayList<Integer>();
  Set s = new HashSet(100,90);
  Set <Integer> s1 = new HashSet <Integer>();
  Set <String> s2 = new LinkedHashSet <String>();
  Set <Character> s3 = new TreeSet <Character>();
		
// 1. add();
// 2. addAll();
// 3. removeAll();
// 4. retainAll();
// 5. isEmpty();
// 6. contains();
// 7. size();
// 8. clear();
			
// Set l = new TreeSet();
// add(object) 	 to add a value in set	
// l.add("mahath") ;
// l.add(100);
// l.add("mahathuva");
// l.add("mahath");
// l.add("sri");
// l.add(null);
			
   Set l = new HashSet();
// add(object) - to aad a value in set	
   l.add("mahath") ;
   l.add(100);
   l.add("mahathuva");
   l.add("mahath");
   l.add("sri");
   l.add(null);
   System.out.println("l --> " + l);

// addAll() -- copy from all values from one list to another list at a time
   Set g = new LinkedHashSet();
   g.addAll(l);
   System.out.println("g -->"+g);
			
// isEmpty()
   boolean empty = l.isEmpty();
   System.out.println("isEmpty --> " + empty);

// removeAll()
   boolean removeAll = l.removeAll(g);
   System.out.println("After removeAll l --> " + l);
   System.out.println("After removeAll g --> " + g);
   
// contains
   boolean contains = g.contains("mahi");
   System.out.println("contains g --> " + contains);
			
// retainAll()
   l.add("synergy");
   l.add("wipro");
   boolean retainAll2 = l.retainAll(g);
   System.out.println(" retainAll l --> " + l);
   System.out.println("retainAll g--> " + g);
   }
		
public static void main(String[] args) {
   SetClass s = new SetClass();
   s.method();
   }
   }
