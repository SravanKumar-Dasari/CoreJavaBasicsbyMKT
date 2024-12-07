package javabasics;

public class C6_ConditionalStatement_If_Else_Block {

	public static void main(String[] args) 
	{
		// If a person age is >= 18 then he can eligible for the vote
		int age = 45;
		
		if (age >= 18)
		{
			System.out.println("I can Vote because I'm at 45");
		}
		else 
		{
			System.out.println("I can't Vote");
		}
		
		int age1 = 12;
		
		if (age1 >= 18)
		{
			System.out.println("I can Vote");
		}
		else 
		{
			System.out.println("I can't Vote because I'm at 12");
		}
		
	}

}
