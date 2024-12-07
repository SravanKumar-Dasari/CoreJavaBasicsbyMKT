package javabasics;

public class C7_ConditionalStatement_Nested_If_Else {

	public static void main(String[] args) 
	{
		
		int a1 = 10;
		int a2 = 20;
		int a3 = 30;
		
		// Case:-1 -- If condition is true and Nested-If condition is true then it'll execute and print
		if (a1 < a2)
		{
			if (a1 != a3)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		else 
		{
			System.out.println("3");
		}
		
		//Case:-2 -- If condition is true and Nested-If is false then it'll move to else condition to execute and print
		if (a2 < a3)
		{
			if (a1 == a2)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		else 
		{
			System.out.println("3");
		}
		
		//Case:-3 -- If condition is false then it'll execute the else condition directly and print without going to inside 
		if (a1 > a2)
		{
			if (a1 == a3)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		else 
		{
			System.out.println("3");
		}
		
	}

}
