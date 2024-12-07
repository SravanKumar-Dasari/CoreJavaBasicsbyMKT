package javabasics;

public class C21_Check_Given_String_Is_Palindrome 
{

	public static void main(String[] args) 
	{
		String input = "CIVIC";
		String output = "";
		
		for (int i = input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output + c1;
		}
		
		System.out.println(output);
		
		if (input.equals(output)== true)
		{
			System.out.println("This is a Palindrome");
		}
		else
		{
			System.out.println("This is not a Palindrome");
		}
		
	}

}
