package javabasics;

import java.util.Scanner;

public class C13_Area_of_Square_by_Scanner {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		int a = s1.nextInt();
		System.out.println("Enter the 'a' value: ");
		
		// Are of Square = a * a;
		
		int AreaOfSquare = a*a;
		
		System.out.println("Area of Square is: " + AreaOfSquare);
	}

}
