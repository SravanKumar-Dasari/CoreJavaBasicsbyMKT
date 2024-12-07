package javabasics;

class Amazon
{
	Amazon(String name)
	{
		System.out.println("Online E-Commerce Application: " + name);
	}
}

class Auth_Num extends Amazon
{
	Auth_Num(int age)
	{
		super("Amazon");
		System.out.println("Authentication Number is: " + age);
	}
}


public class C16_Super_Calling_Statement_MLI_PSCS_Explicitly extends Auth_Num
{
	C16_Super_Calling_Statement_MLI_PSCS_Explicitly() 
	{
		super(101193);
		System.out.println("Parameterized Super Calling Statement - Explicit Invocation");
	}

	public static void main(String[] args) 
	{
		new C16_Super_Calling_Statement_MLI_PSCS_Explicitly();
	}

}
