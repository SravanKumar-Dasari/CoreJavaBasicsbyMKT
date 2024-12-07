package javabasics;

public class C24_Given_String_Ends_With_e 
{

	public static void main(String[] args) 
	{
		String a = "axe";
		// matches return type is boolean
		// .* means multi character
		System.out.println(a.matches("(.*)e"));
	}

}
