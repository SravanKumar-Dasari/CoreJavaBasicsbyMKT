package javabasics;

import java.util.Arrays;

public class C21_String_Functions_All 
{
	// length()
	// toUpperCase()
	// toLowerCase()
	// trim()
	// charAt()
	// indexOf(Char)
	// substring(begin index)
	// substring(start index, end index)
	// equals()
	// contains()
	// equalsIgnoreCase() --- 9849847242
	
	public static void main(String[] args) 
	{
		
		// method 1 - lenght()
		String a = "Sruthi Sravan";
		System.out.println(a.length());
				
		//method 2 - length()
		String a1 = new String("Sruthi");
		System.out.println(a1.length());
		
		// toUpperCase()
		String name = "Sravan Sruthi";
		System.out.println(name.toUpperCase());
		
		// toLowerCase()
		String name1 = "Sruthi";
		System.out.println(name1.toLowerCase());
		
		// trim()
		String name2 = "  Sruthi Sravan  ";
		System.out.println(name2.trim());
		
		// charAt()
		// indexOf()
		String a2 = "Sravan Sruthi";
		System.out.println(a2.charAt(4));
		System.out.println(a2.indexOf('t'));
		
		// substring(start index)
		// substring(start index, end index)
		String p1 = "Bangalore";               // index position starts with 0
		System.out.println(p1.substring(3));
		System.out.println(p1.substring(4, 9));
		
		// equals()
		// contains()
		// equalsIgnoreCase()
		String c1 = "Automation Testing";
		System.out.println(c1.equals("automation"));
		System.out.println(c1.contains("Testing"));
		System.out.println(c1.equalsIgnoreCase("automation testing"));
		
		// toCharArray()
		 String m1 = "abcde";
		 char[] b2 = m1.toCharArray();
		 System.out.println(Arrays.toString(b2));
		
	}

}
