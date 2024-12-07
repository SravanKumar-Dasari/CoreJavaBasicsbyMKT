package javabasics;

public class C24_Given_String_Remove_All_Capital_Letters 
{

	public static void main(String[] args) 
	{
		String name = "Sravan Kumar";
		System.out.println("Given String is: " + name);
		System.out.println(name.replaceAll("[A-Z]", ""));
	}

}
