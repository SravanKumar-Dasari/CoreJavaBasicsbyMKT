package javabasics;

public class C7_LogicalOperators_Comb_OR_AND {

	public static void main(String[] args) 
	{
		
	/* Case:-1 
	 * ========
	 * 1. If anyone of the OR condition is satisfied then it'll give output as "True" otherwise "False"
	 * 2. Once both OR conditions are True then it'll check the AND condition with the result of OR conditions values
	 * 3. If condition is satisfied then it'll execute otherwise else condition will be execute
	 */		
		int i = 45;
		int j = 35;
		int k = 55;
				
		if ((i > 40 || j <30) && (i < 60 || k >50))
		{
			System.out.println("Success");
		}
		else 
		{
			System.out.println("Fail");
		}
	
	/* Case:-2 
	 * ========
	 * 1. If anyone of the OR condition is satisfied then it'll give output as "True" otherwise "False"
	 * 2. Once both OR conditions are False then it'll check the AND condition with the result of OR conditions values
	 * 3. If condition is satisfied then it'll execute otherwise else condition will be execute
	 */	
		int a1 = 45;
		int b1 = 35;
		int c1 = 55;
				
		if ((a1 > 60 || b1 <30) && (a1 < 60 || c1 >50))
		{
			System.out.println("Success");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		
	/* Case:-3 
	 * ========
	 * 1. If AND condition is satisfied then it'll give output as "True" otherwise "False"
	 * 2. Once both AND conditions are True/False then it'll check the OR condition with the result of AND conditions values
	 * 3. If condition is satisfied then it'll execute otherwise else condition will be execute
	 */	
		int a2 = 45;
		int b2 = 35;
		int c2 = 55;
					
		if ((a2 > 60 && b2 <30) || (a2 < 60 && c2 >50))
		{
			System.out.println("Continue");
		}
		else 
		{
			System.out.println("Discontine");
		}
		
			
	/* Case:-4 
	 * ========
	 * 1. If AND condition is satisfied then it'll give output as "True" otherwise "False"
	 * 2. Once both AND conditions are True/False then it'll check the OR condition with the result of AND conditions values
	 * 3. If condition is satisfied then it'll execute otherwise else condition will be execute
	 */	
	
		int a3 = 45;
		int b3 = 35;
		int c3 = 55;
				
		if ((a3 > 60 && b3 <40) || (a3 < 40 && c3 >70))
		{
			System.out.println("Continue");
		}
		else 
		{
			System.out.println("Discontine");
		}
			
	}

}
