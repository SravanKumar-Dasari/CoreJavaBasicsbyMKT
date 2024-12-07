package javabasics;

class Google
{
	Google()
	{
		System.out.println("Google having the Google-Pay for Payment Method");
	}
}

public class C15_Super_Calling_Statement_NPSCS_Explicitly extends Google
{
	C15_Super_Calling_Statement_NPSCS_Explicitly()
	{
		super();
		System.out.println("No Payment Method");
	}
	
	public static void main(String[] args) 
	{
		new C15_Super_Calling_Statement_NPSCS_Explicitly();
		
	}

}
