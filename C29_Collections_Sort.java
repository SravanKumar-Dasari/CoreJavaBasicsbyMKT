package javabasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class C29_Collections_Sort 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Class");
		a1.add("String");
		a1.add("ABC");
		
		System.out.println("Before sorting for String " + a1);
		
		Collections.sort(a1);
		System.out.println("After sorting for String " + a1);
		
		System.out.println("=====================================================");
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(94);
		a2.add(76);
		a2.add(52);
		a2.add(36);
		
		System.out.println("Before Sorting for Integer " + a2);
		
		Collections.sort(a2);
		System.out.println("After Sorting for Integer " + a2);
		
	}

}
