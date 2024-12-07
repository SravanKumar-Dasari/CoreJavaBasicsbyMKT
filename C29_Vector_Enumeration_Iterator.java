package javabasics;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class C29_Vector_Enumeration_Iterator 
{

	public static void main(String[] args) 
	{
		Vector<String> v1 = new Vector<String>();
		v1.add("Sruthi");
		v1.add("Sravan");
		v1.add("SS");
		
		Enumeration<String> e1 = v1.elements();
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		// Sort for Vector
		Collections.sort(v1);
		System.out.println(v1);
		
	}

}
