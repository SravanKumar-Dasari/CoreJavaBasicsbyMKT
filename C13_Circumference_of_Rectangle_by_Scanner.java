package javabasics;

import java.util.Scanner;

public class C13_Circumference_of_Rectangle_by_Scanner {

	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		
		int l = s1.nextInt();
		System.out.println("Enter the 'l' value: ");
		int b = s1.nextInt();
		System.out.println("Enter the 'b' value: ");
		
		// Are of Rectangle = 2 (l * b);
		
		int CircumferenceOfRectangle = 2 * l * b;
		
		System.out.println("Cicumference of Rectangle is: " + CircumferenceOfRectangle);
		
	}

}
