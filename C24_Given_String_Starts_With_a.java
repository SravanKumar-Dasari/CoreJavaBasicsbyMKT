package javabasics;

public class C24_Given_String_Starts_With_a 
{

	public static void main(String[] args) 
	{
		String a = "axe";
		// matches return type is boolean
		// .* means multi character
		System.out.println(a.matches("a(.*)"));
	}

}
