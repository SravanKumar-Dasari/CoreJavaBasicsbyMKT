package javabasics;

public class C12_Switch_Case_2 {

	public static void main(String[] args) 
	{
		int age = 19;
		
			switch (age)
			{
			case 17:
				System.out.println("You're Minor");
				break;
			
			case 19:
				System.out.println("You Can Vote now");
				break;
				
			default:
				System.out.println("You're Senior Citizen");
			}
		
	}

}
