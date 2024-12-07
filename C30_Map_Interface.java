package javabasics;

import java.util.HashMap;
import java.util.Map;

public class C30_Map_Interface 
{

	public static void main(String[] args) 
	{
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Sravan", "SS02");
		m1.put("Sruthi", "SS01");
		m1.put("Amma", "SS03");
		m1.put("Sunny", "SS04");
		System.out.println(m1);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("Rice", 10);
		m2.put("Sugar", 20);
		m2.put("Salt", 30);
		m2.put("Jaggery", 40);
		System.out.println(m2);
		
		Map<String, Character> m3 = new HashMap<String, Character>();
		m3.put("Sravan", 'M');
		m3.put("Sruthi", 'F');
		m3.put("Amma", 'F');
		m3.put("Sunny", 'F');
		System.out.println(m3);
		
		Map<String, Double> m4 = new HashMap<String, Double>();
		m4.put("Sravan", 60000.89);
		m4.put("Sruthi", 50000.34);
		m4.put("Amma", 40000.75);
		m4.put("Sunny", 30000.46);
		System.out.println(m4);
		
	}

}
