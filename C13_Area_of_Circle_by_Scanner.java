package javabasics;

import java.util.Scanner;

public class C13_Area_of_Circle_by_Scanner {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		double pi = Math.PI;
		
		double r = s1.nextDouble();
		System.out.println("Enter the 'r' value: ");
		
		// Are of Circle = pi * r * r;
		
		double AreaOfCircle = pi*r*r;
		
		System.out.println("Area of Circle is: " + AreaOfCircle);
		
		System.out.println("PI value: "+ pi);

	}

}
