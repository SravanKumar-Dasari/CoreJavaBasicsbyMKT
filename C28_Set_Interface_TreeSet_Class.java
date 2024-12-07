package javabasics;

import java.util.Set;
import java.util.TreeSet;

public class C28_Set_Interface_TreeSet_Class 
{

	public static void main(String[] args) 
	{
		// add() method --- parameter is Object
		Set<String> a1 = new TreeSet<String>();
		a1.add("Sravan");
		a1.add("Sruthi");
		a1.add("ABC");
		a1.add("Lion");
		a1.add("ABC");
		
		System.out.println(a1);
	}

}
