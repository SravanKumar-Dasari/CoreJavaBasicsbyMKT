package javabasics;

import java.util.Scanner;

public class C13_Area_of_Triangle_by_Scanner {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		int b = s1.nextInt();
		System.out.println("Enter the 'b' value: ");
		int h = s1.nextInt();
		System.out.println("Enter the 'h' value: ");
		
		// Are of Triangle = 1/2 * b * h;
		int c = b*h;
		int AreaOfTriangle = c/2;
		
		System.out.println("Area of Triangle is: " + AreaOfTriangle);
		
	}

}
