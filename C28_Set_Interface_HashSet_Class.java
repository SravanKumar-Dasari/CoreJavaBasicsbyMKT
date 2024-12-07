package javabasics;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class C28_Set_Interface_HashSet_Class
{

	public static void main(String[] args) 
	{
		// add() method --- parameter is Object
		Set a1 = new HashSet();
		a1.add("Sravan");
		a1.add("Sruthi");
		a1.add(143);
		a1.add(23.34);
		a1.add(true);
		a1.add(null);
		a1.add("Sravan");
		a1.add(2346.678);
		a1.add(23.34);
		System.out.println(a1);
				
		//addAll() method --- parameter is collection
		Set a2 = new HashSet();
		a2.addAll(a1);
		a2.add("Lion");
		a2.add("Shersha");
		a2.add(false);
		a2.add(234567);
		System.out.println(a2);
				
		// isEmpty() method --- parameter is boolean
		boolean b1 = a2.isEmpty();
		System.out.println(b1);
				
		// contains() method --- parameter is object
		System.out.println(a2.contains("Lion"));
				
		// containsAll() method --- parameter is collection
		System.out.println(a2.containsAll(a1));
				
		// remove() method --- parameter is object
		System.out.println(a2.remove(9)); //remove(int index)
		System.out.println(a2);
		System.out.println(a2.remove(null)); //remove(object e)
		System.out.println(a2);
				
		// removeAll() method --- parameter is collection
		System.out.println(a2.removeAll(a1));
		System.out.println(a2);
				
		// size() method --- parameter is Int	
		System.out.println(a2.size());
		System.out.println(a1.size());
				
		// clear() method --- Its clear entire collection 
		a2.clear();
		System.out.println(a2);
		
		// sort() method
		// Collections.sort(a1);
		
	}

}
