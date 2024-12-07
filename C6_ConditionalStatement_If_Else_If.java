package javabasics;

public class C6_ConditionalStatement_If_Else_If 
{
	public static void main(String[] args) 
	{
		//1st Case:-
		int a1 = 100;
		int b1 = 200;
		
		if (a1 > b1)
		{
			System.out.println("1st Value");
		}
		else if (a1 != b1) 
		{
			System.out.println("2nd Value");
		}
		else 
		{	
			System.out.println("3rd Value");
		}
		
		//2nd Case:-
		int a2 = 100;
		int b2 = 200;
		
		if (a2 < b2)
		{
			System.out.println("1st Value");
		}
		else if (a2 != b2) 
		{
			System.out.println("2nd Value");
		}
		else 
		{	
			System.out.println("3rd Value");
		}
		
		//3rd Case:-
		int a3 = 100;
		int b3 = 200;
		
		if (a3 >= b3)
		{
			System.out.println("1st Value");
		}
		else if (a3 == b3) 
		{
			System.out.println("2nd Value");
		}
		else 
		{	
			System.out.println("3rd Value");
		}
		
		//4th Case:
		int a4 = 300;
		int b4 = 200;
		
		if (a4 > b4)
		{
			System.out.println("4th Value");
		}
		else if (a4 <= b4) 
		{
			System.out.println("2nd Value");
		}
		else 
		{	
			System.out.println("3rd Value");
		}
		
		//5th Case:-
		int date = 9;
		
		if (date == 1) 
		{
			System.out.println("Monday");
		}
		else if (date == 2) 
		{
			System.out.println("Tuesday");
		}
		
		else if (date == 3) 
		{
			System.out.println("Wednesday");
		}
		else if (date == 4) 
		{
			System.out.println("Thursday");
		}
		else if (date == 5) 
		{
			System.out.println("Friday");
		}
		else if (date == 6) 
		{
			System.out.println("Saturday");
		}
		else if (date == 7) 
		{
			System.out.println("Sunday");
		}
		else 
		{
			System.out.println("Out of the Weekday");
		}
		
	}

}
