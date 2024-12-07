package javabasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C27_Iterator_ListIterator_in_List_Interface 
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
		System.out.println(a1);
				
		//addAll() method --- parameter is collection
		List a2 = new ArrayList();
		a2.addAll(a1);
		a2.add("Lion");
		a2.add("Shersha");
		a2.add(false);
		a2.add(234567);
		System.out.println(a2);	
		
		System.out.println("**** Iterator ****");
		Iterator i1 = a1.iterator();
		while (i1.hasNext()) // return type is boolean
		{
			System.out.println(i1.next()); // return type is object
		}
		
		System.out.println("**** ListIterator ****");
		ListIterator i2 = a2.listIterator();
		System.out.println("**** Forward Iteration ****");
		while (i2.hasNext()) // return type is boolean
		{
			System.out.println(i2.next()); // return type is object
		}
		System.out.println("**** Backward Iteration ****");
		while (i2.hasPrevious()) // return type is boolean
		{
			System.out.println(i2.previous());  // return type is object
		}
		
	}

}
