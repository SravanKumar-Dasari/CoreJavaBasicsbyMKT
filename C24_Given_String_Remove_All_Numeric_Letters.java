package javabasics;

public class C24_Given_String_Remove_All_Numeric_Letters 
{

	public static void main(String[] args) 
	{
		String name = "Sravan 3289";
		System.out.println("Given String is: " + name);
		System.out.println(name.replaceAll("[0-9]", ""));
	}

}
