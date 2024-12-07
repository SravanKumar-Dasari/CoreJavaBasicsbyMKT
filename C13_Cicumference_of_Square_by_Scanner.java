package javabasics;

import java.util.Scanner;

public class C13_Cicumference_of_Square_by_Scanner {

	public static void main(String[] args) 
	
	{
		
		Scanner s1 = new Scanner(System.in);
		
		int a = s1.nextInt();
		System.out.println("Enter the 'a' value: ");
		
		// Are of Square = 4 * a;
		
		int CircumferenceOfSquare = 4*a;
		
		System.out.println("Circumference of Square is: " + CircumferenceOfSquare);
		
	}

}
