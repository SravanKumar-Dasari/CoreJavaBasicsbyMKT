package javabasics;

import java.util.Enumeration;
import java.util.Vector;

public class C29_Enumeration_Iterator 
{

	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(10);
		v1.add("Sravan");
		v1.add(15.23);
		v1.add(null);
		v1.add(true);
		
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
	}

}
