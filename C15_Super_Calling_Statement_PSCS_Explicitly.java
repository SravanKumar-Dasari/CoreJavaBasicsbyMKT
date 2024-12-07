package javabasics;

class Google_Authentication
{
	Google_Authentication(String name) 
	{
		System.out.println("Constructor name is: " + name);
	}
}

public class C15_Super_Calling_Statement_PSCS_Explicitly extends Google_Authentication
{
	C15_Super_Calling_Statement_PSCS_Explicitly()
	{
		super("SS");
		System.out.println("Constructor 2");
	}
	public static void main(String[] args) 
	{
		new C15_Super_Calling_Statement_PSCS_Explicitly();
	}

}
