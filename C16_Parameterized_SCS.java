package javabasics;

class Google_1
{
	Google_1(String name)
	{
		System.out.println("Calling the Constructor 1");
	}
}

class Google_Auth extends Google_1
{
	Google_Auth(int a)
	{
		super("SS");
		System.out.println("Calling the Constructor 2");
	}
}

public class C16_Parameterized_SCS extends Google_Auth
{
	C16_Parameterized_SCS()
	{
		super(100);
		System.out.println("Calling the Constructor 3");
	}
public static void main(String[] args) 
{
	new C16_Parameterized_SCS();
}	
	
}
