package javabasics;

public class C7_LogicalOperator_AND_NOT_OR_NOT {

	public static void main(String[] args) 
	{
	
	// NOt Operator always reverse the output value.	
		
	// Case-1: AND with Not Operator
	
		int a = 20;
		int b = 30;
		
		if (!(a == 10 && b >= 30))
		{
			System.out.println("1");
		}
		
	// Case-2: OR with Not Operator	
		int a1 = 20;
		int b1 = 30;
		
		if (!(a1 > 20 || b1 < 30))
		{
			System.out.println("2");
		}
		
	}

}
