package javabasics;

public class C7_LogicalOperator_AND {

	public static void main(String[] args) 
	{
		
		// Case:-1 If AND condition is satisfied then it'll execute and print
		char gender = 'M';
		int age = 45;
		
		if (gender =='M' && age >= 12)
		{
			System.out.println("Full Ticket amount need to be paid");
		}
		else 
		{
			System.out.println("No Ticket and berth allowed for child");
		}
		
		// Case:-2 If AND condition is not satisfied then it'll execute the else if condition and 
		// if it is also not satisfied then else condition will be execute and print
		char gender1 = 'F';
		int age1 = 9;
		
		if (gender1 =='F' && age1 >= 12)
		{
			System.out.println("Full Ticket amount need to be paid");
		}
		else if (gender1 == 'F' && age1 >= 9)
		{
			System.out.println("No Ticket but if berth is required then need to pay");
		}
		else
		{
			System.out.println("No Ticked and No Berth for Child");
		}
	}

}
