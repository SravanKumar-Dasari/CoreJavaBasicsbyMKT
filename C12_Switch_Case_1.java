package javabasics;

public class C12_Switch_Case_1 {

	public static void main(String[] args) 
	{
		
		switch (2)
		{
		case 1:
			System.out.println("Chrome Browser Launch");
			break;
		
		case 2:
			System.out.println("Mozilla Browser Launch");
			break;
		
		case 3:
			System.out.println("Edge Browser Launch");
			break;
			
		case 4:
			System.out.println("IE Browser Launch");
			break;
		
		default:
			System.out.println("Your selection is wrong, Kindly press 1, 2, 3 or 4 only");
		}		
		
	}

}
