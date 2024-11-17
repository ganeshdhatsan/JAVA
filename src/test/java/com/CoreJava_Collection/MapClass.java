package com.CoreJava_Collection;
	import java.util.Collection;
	import java.util.HashMap;
	import java.util.Hashtable;
	import java.util.LinkedHashMap;
	import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
	import java.util.TreeMap;

	public class MapClass {
	 
// Map--
// Interface 
// key and value--
// Map<Key, Value> m = new HashMap<K, V>();

// key never allow null
// value allow null
// List<String> l = new ArrayList();
// Set<Integer> s = new LinkedHashSet();
// Map Implementing classes
// 1. HashMap 2. LinkedHashMap 3. TreeMap 4. HashTable-legacy
	 
	private void m1() {
	 
// Declaration
//----------
 Map<String, String> m1 = new HashMap<String, String>();
 Map<String, String> m2 = new LinkedHashMap<String, String>();
 Map<String, String> m3 = new TreeMap<String, String>();
 Map<String, String> m4 = new Hashtable<String, String>();
	 
// adding values
// ----------------
// Map<String, String> m = new HashMap<String, String>();
// m.put(null, "ganesh");
// m.put("name", "kumar");
// m.put("Animal", "Tiger");
// m.put(null, "Tiger");
// m.put("mahi", null);
// m.put("sahi", null);
// m.put("suhi", null);		
// System.out.println("m---> "+m);
	 
// Map<String, Integer> m5 = new LinkedHashMap<String, Integer>();
// m5.put("maha", 100);
// m5.put("ganesh", 35);
// m5.put(null, 56);
// m5.put("Animal", null);
// m5.put("mahi", null);
// m5.put("suhi", null);
// m5.put(null, 23);
// System.out.println("m5---> "+m5);
	 
// Map<Character, String> m6 = new TreeMap<Character, String>();
// m6.put('P', "maha");
// m6.put('D', "ganesh");
// m6.put(null, "ganesh"); //null pointer exception throw
// System.out.println("m6 "+m6);
			
// Map<Character, String> m7 = new Hashtable<Character, String>();
// m7.put('P', "maha");
// m7.put('D', null);
// m7.put(null, "ganesh"); //null pointer exception throw
// m7.put(null, null);
// System.out.println("m7 "+m7);
			
// output Order
// -----------
// 1. HashMap  -- Random Order
// Key allows one null  but values allow N number of Null
// compile time never show any error whereas in run time last null value only accepted
// 2. LinkedHashMap  -- Insertion
// Key allows one null  but values allow N number of Null
// compile time never show any error whereas in run time last null value only accepted
// 3. TreeMap  -- Ascending ASSCI order
// Key never allows null  but values allow N number of Null
// compile time never show any error whereas in run time will throw null pointer exception
// 4. HashTable-legacy  -- Random
// never allows null in both Key and values
// compile time never show any error whereas in run time will throw null pointer exception
// Methods
// =======
// put(To add values)
   Map<String, Integer> m8 = new LinkedHashMap<String, Integer>();
   m8.put("maha", 100);
   m8.put("ganesh", 35);
   m8.put("kumar", 75);
   System.out.println("m8---> "+m8);

// get(To retrieve values using key)(pass key)
   Integer integer = m8.get("maha");
   System.out.println("maha "+integer);
	
// remove (To remove both key and value)
   m8.remove("kumar");
   System.out.println("m8---> "+m8);
			
// containsKey (to check whether key is available or not)
   boolean containsKey = m8.containsKey("kumar");
   System.out.println(containsKey);
			
// containsValue (to check whether value is available or not)
   boolean containsValue = m8.containsValue(100);
   System.out.println(containsValue);
			
// isEmpty (To Check whether map is empty or not)
   boolean empty = m8.isEmpty(); 
   System.out.println(empty);
			
// keySet (to fetch only all keys )
// {maha=100, ganesh=35}
   Set<String> keySet = m8.keySet();
   for (String single : keySet) {
   System.out.println("Keys --> "+single);
   }
	
// values
   Collection<Integer> values = m8.values();
   for (Integer integer2 : values) {
   System.out.println("values --> "+integer2);
   }
			
// entrySet() (for converting map to set)
// map won't support foreach loop directly
// so first we have to convert Map to set then we have to use foreach loop
// Map<String, Integer> m8 = new LinkedHashMap<String, Integer>();
					
   Set<Entry<String, Integer>> entrySet = m8.entrySet();
// Set<String > sss = new HashSet<>();
// for (String single : sss) {
// }

// getKey() & getValue() both methods will work only when we are using the Entryset
   System.out.println("m8 --> "+m8);
   for (Entry<String, Integer> single : entrySet) {
	   
// getKey()
   System.out.println("getKey --> "+single.getKey());

// getValue()
   System.out.println("getValue --> "+single.getValue());
   }
   }
   public static void main(String[] args) {
   MapClass m = new MapClass();
   m.m1();
   }
   }

