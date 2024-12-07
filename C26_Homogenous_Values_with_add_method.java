package javabasics;

import java.util.ArrayList;
import java.util.Collection;

public class C26_Homogenous_Values_with_add_method 
{

	public static void main(String[] args) 
	{
		//1. add Method
		Collection c1 = new ArrayList();
				
		c1.add("Class");
		c1.add("Str@123");
		c1.add("Lion");
		c1.add("Tiger");
		System.out.println(c1);
	
	}

}
