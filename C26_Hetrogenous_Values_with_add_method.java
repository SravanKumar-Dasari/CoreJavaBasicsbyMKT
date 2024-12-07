package javabasics;

import java.util.ArrayList;
import java.util.Collection;

public class C26_Hetrogenous_Values_with_add_method 
{

	public static void main(String[] args) 
	{
		Collection c1 = new ArrayList();
		
		c1.add("Class");
		c1.add(1234);
		c1.add(23.45);
		c1.add(true);
		System.out.println(c1);
	}

}
