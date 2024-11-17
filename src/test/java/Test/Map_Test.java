package Test;
import java.util.*;
import java.util.Map.Entry;


public class Map_Test {
	public void method1() throws InterruptedException {
		Thread.sleep(1000);
	Map <String, Integer> a = new HashMap<>();
//	1
	a.put("yamaha", 5);
	a.put("TVS", 8);
	a.put("KTM", 10);
	System.out.println("Put -->  "+a);
// 2	
	Map <String, Integer> b = new LinkedHashMap<>();
	b.putAll(a);
	System.out.println("Put All -->  "+b);
//	3
	a.get("KTM");
	System.out.println("Get -->  "+a);
//	4
	boolean check = a.containsKey("TVS");
	System.out.println("Contains Key -->  "+check);
//	5
	boolean check1 = a.containsValue(5);
	System.out.println("Contains Value -->  "+check1);
//	6
	boolean empty = b.isEmpty();
	System.out.println("Is Empty -->  "+empty);
//	7
	Set<String> set = a.keySet();
	System.out.println("Key Set -->  "+set);
//	8
Collection<Integer> values = a.values();
	System.out.println("Values -->  "+values);
//	9
	a.remove("TVS");
	System.out.println("Remove -->  "+a);
//	10
	int size = a.size();
	System.out.println("Size -->  "+size);
//	11
	Set<Entry<String, Integer>> c = a.entrySet();
	for(Entry<String, Integer> s : c) {
//	12
	System.out.println(s.getKey());  
//	13
	System.out.println(s.getValue());
	}
//	14
	a.clear();
	System.out.println("Clear -->  "+a);
    }
	public static void main (String []args ) throws InterruptedException {
	Map_Test	 ref = new Map_Test();
	ref.method1();
	}
	}
