package javabasics;

public class C24_Given_String_Remove_All_Lower_Letters 
{

	public static void main(String[] args) 
	{
		String name = "Kv No 2";
		System.out.println("Given String is: " + name);
		System.out.println(name.replaceAll("[a-z]", ""));
	}

}
