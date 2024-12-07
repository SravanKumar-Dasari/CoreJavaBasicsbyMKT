package javabasics;

public class C7_LogicalOperators_OR {

	public static void main(String[] args) 
	{
		
		// Case-1: If anyone of the condition is True then output is True otherwise False.
		int a1 = 10;
		int b1 = 20;
		int c1 = 30;
		
		if (a1 > 5 || b1 == 20)
		{
			System.out.println(a1 + c1 );
		}
		
		// Case-2: If anyone of the condition is True then output is True otherwise False.
		int a2 = 10;
		int b2 = 20;
		int c2 = 30;
		
		if (a2 < 5 || c2 == 20)
		{
			System.out.println(b2 + c2 );
		}
		else 
		{
			System.out.println(c2 / b2);
		}
		
	}

}
