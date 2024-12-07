package javabasics;

import java.util.Scanner;

public class C13_Scanner_Class_4_Swtich_Case {

	public static void main(String[] args) 
	{
		System.out.println("**** To launch the browsers, Press the input accordingly *****");
		
		Scanner s1 = new Scanner(System.in);
		
		int input = s1.nextInt();
		
		switch (input)
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
