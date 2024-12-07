package javabasics;

public class C8_ForLoop_1 {

	public static void main(String[] args) 
	{
		
	/* Syntax: 
	 * =======
	 * for (declaration and initialization; condition; increment/decrement operator)
	 * {
	 *   // logic here
	 * }
	 * 
	 * 	In for-loop --- 1st ==> it'll check the declaration and initialization
	 *              --- 2nd ==> it'll check the condition 
	 *              --- 3rd ==> if condition is met then it'll execute the logic
	 *              --- 4th ==> After execution of logic then it'll go for increment/decrement operator
	 */ 
	
	System.out.println("***** Case-1 *****");	
	// Case-1:- The below for-loop will run for 2 times when i=0 & i=1
		for (int i=0; i<2; i++)
		{
			System.out.println("Sravan");
		}
	
	System.out.println("***** Case-2 *****");	
	// Case-2:- The below for-loop will run for 3 times when j=0, j=1 & j=2 (because j<=2)
		for (int j=0; j<=2; j++)
		{
			System.out.println("SS");
		}
	
	System.out.println("***** Case-3 *****");		
	// Case-3:- The below for-loop will run for 11 times when k=0, k=1 to k=10 (because k<=10)
		for (int k=0; k<=10; k++)
		{
			System.out.println("Sravan_SS");
		}
		
	System.out.println("***** Case-4 *****");		
	// Case-4:- The below for-loop will run for 12 times when a=-1, a=0 to k=10 (because a<=10)
		for (int a=-1; a<=10; a++)
		{
			System.out.println("SS_Sravan");
		}
				
		
	}

}
