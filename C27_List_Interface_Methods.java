package javabasics;

import java.util.ArrayList;
import java.util.List;

public class C27_List_Interface_Methods 
{

	public static void main(String[] args) 
	{
		
		// add() method --- parameter is Object
		List a1 = new ArrayList();
		a1.add("Sravan");
		a1.add("Sruthi");
		a1.add(143);
		a1.add(23.34);
		a1.add(true);
		a1.add(null);
		a1.add("Sravan");
		a1.add("Sruthi");
		a1.add(143);
		a1.add(23.34);
		System.out.println(a1);
		
		//addAll() method --- parameter is collection
		List a2 = new ArrayList();
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

	}

}
