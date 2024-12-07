package javabasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C30_Map_Interface_methods {

	public static void main(String[] args) 
	{
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Sravan", "SS02");
		m1.put("Sruthi", "SS01");
		m1.put("Amma", "SS03");
		m1.put("Sunny", "SS04");
		System.out.println(m1);
		
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("Rose", "SS05");
		m2.put("Jasmine", "SS08");
		m2.put("Lilly", "SS07");
		m2.put("Lavender", "SS06");
		System.out.println(m2);
		
	/*	// equals() method
		boolean b1 = m2.equals(m1);
		System.out.println(b1);
	*/	
		
		// putAll() method --- like addAll() method
		m2.putAll(m1);
		System.out.println(m2);
		
		// putIfAbsent() method --- 
		m2.putIfAbsent("Sandal", "SS10");
		System.out.println(m2);
		
		Map<String, Integer> m3 = new HashMap<String, Integer>();
		m3.put("Rice", 10);
		m3.put("Sugar", 20);
		m3.put("Salt", 30);
		m3.put("Jaggery", 40);
		System.out.println(m3);
		
		// for-each loop --- to get the single-single values
		System.out.println("**** Map Interface Iterators ****");
		System.out.println("Fetching the keys : ");
		// keySet()
		for (String s1: m1.keySet())
		{
			System.out.println(s1);
		}
		
		System.out.println("Fetching the values : ");
		// values()
		for (String s2: m1.values())
		{
			System.out.println(s2);
		}
		
		System.out.println("Fetching the keys and values : ");
		// entrySet()
		for (Entry<String, String> s3: m1.entrySet())
		{
			System.out.println(s3);
		}
		
		System.out.println("*** Fetching the keys & values with iterator ****");
		Set<Entry <String, String>> s4 = m2.entrySet();
		Iterator <Entry <String, String>> i1 = s4.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		// remove(Key) method
		System.out.println(m2);
		m2.remove("Lavender");
		System.out.println(m2);
		
		// remove(Key, Value) method
		m2.remove("Jasmine", "SS08");
		System.out.println(m2);
		
		// get(Key) method
		System.out.println(m1.get("Sruthi"));
		
		// containsKey() method
		System.out.println(m1.containsKey("Amma"));
		
		// containsValue() method
		System.out.println(m1.containsValue("SS03"));
		
		// clear() method
		m2.clear();
		System.out.println("After clear method, print the values " + m2);
		
		// isEmpty() method
		System.out.println(m2.isEmpty());
				
		
	}

}
