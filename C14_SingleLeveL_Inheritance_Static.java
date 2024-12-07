package javabasics;

public class C14_SingleLeveL_Inheritance_Static extends C14_SingleLeveL_Inheritance_Static_Method
{
	
	static void gateway()
	{
		System.out.println("Payment failed due to Wrong gateway method");
	}
	
	public static void main(String[] args) 
	{
		payment();
		authentication();
		gateway();
	}

}
