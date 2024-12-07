package javabasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class C26_CollectionMethods {

	public static void main(String[] args) 
	{
		//1. add Method
		Collection c1 = new ArrayList();
		
		c1.add("Class");
		c1.add("Str 123");
		c1.add(98.23);
		System.out.println(c1);
		
		//2.addAll Method
		Collection c2 = new ArrayList();
		c2.addAll(c1);
		c2.add("Lion");
		c2.add("tiger");
		System.out.println(c2);
		
	/* //3. clear method
		c1.clear();
		System.out.println(c1);
	*/	
		//4.isEmpty
		boolean b1 = c1.isEmpty();
		System.out.println(b1);
		
		//5.contains
		System.out.println(c2.contains("Lion"));
		
		// 6.containsAll
		System.out.println(c2.containsAll(c1));
		
		// 7. remove
		System.out.println("C2 Elements: " + c2);
		System.out.println(c2.remove("Lion"));
		System.out.println(c2);
		
		// 8. removeAll
		System.out.println("C1 Elements: " + c1);
		System.out.println(c2.removeAll(c1));
		System.out.println(c2);
		
		// 9. size
		System.out.println(c1.size());
		
		// Iterator Concept
		Iterator i2 = c1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		
		
		
		
	}

}
