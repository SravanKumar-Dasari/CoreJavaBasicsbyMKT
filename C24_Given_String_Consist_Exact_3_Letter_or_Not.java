package javabasics;

public class C24_Given_String_Consist_Exact_3_Letter_or_Not 
{

	public static void main(String[] args) 
	{
		String a = "axe";
		// matches return type is boolean
		// dot represent single character
		boolean b1 = a.matches("...");
		System.out.println(b1);
	}

}
