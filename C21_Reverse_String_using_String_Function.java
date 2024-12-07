package javabasics;

public class C21_Reverse_String_using_String_Function 
{

	public static void main(String[] args) 
	{
		String name = "abcd";
		String output = "";
		
		for (int i = name.length()-1; i>=0; i--)
		{
			char c1 = name.charAt(i);
			output = output + c1;
		}
		
		System.out.println(output);
		
	}

}
