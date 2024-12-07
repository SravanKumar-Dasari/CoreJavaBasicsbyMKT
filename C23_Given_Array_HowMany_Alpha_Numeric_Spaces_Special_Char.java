package javabasics;

import java.util.Arrays;

public class C23_Given_Array_HowMany_Alpha_Numeric_Spaces_Special_Char {
	
	static int count_of_alphabet = 0;
	static int count_of_numeric = 0;
	static int count_of_spaces = 0;

	public static void main(String[] args) 
	{
		String a = "Sravan @143 Loves Sruthi 143_101193";
		
		char c1[] = a.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for (int i=0; i<a.length(); i++)
		{
			boolean v1 = Character.isAlphabetic(c1[i]);
			boolean v2 = Character.isDigit(c1[i]);
			boolean v3 = Character.isWhitespace(c1[i]);
			
			if (v1 == true)
			{
				count_of_alphabet++;
			}
			if (v2 == true)
			{
				count_of_numeric++;
			}
			if (v3 == true)
			{
				count_of_spaces++;
			}
		}
		
		System.out.println("Count of Alphabets in given Array: " + count_of_alphabet);
		System.out.println("Count of Numeric  in given Array: " + count_of_numeric);
		System.out.println("Count of Spaces in given Array: " + count_of_spaces);
		
		int count_of_special_char = c1.length - (count_of_alphabet + count_of_numeric + count_of_spaces);
		System.out.println("Count of Specail Characters in given Array: " + count_of_special_char);
		
	}

}
