package javabasics;

class Jump
{
	Jump()
	{
		System.out.println("Super Calling Statement - Implicitly");
	}	
}


public class C15_Super_Calling_Statement_NPSCS_Implicitly extends Jump
{
	
	C15_Super_Calling_Statement_NPSCS_Implicitly()
	{
		System.out.println("Non Parameterized Super Calling Statements");
	}
	
	public static void main(String[] args) 
	{
		new C15_Super_Calling_Statement_NPSCS_Implicitly();
	}

}
