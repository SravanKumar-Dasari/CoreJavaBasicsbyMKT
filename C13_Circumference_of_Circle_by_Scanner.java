package javabasics;

import java.util.Scanner;

public class C13_Circumference_of_Circle_by_Scanner {

	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		
		double pi = Math.PI;
		
		double r = s1.nextDouble();
		System.out.println("Enter the 'r' value: ");
		
		// Circumference of Circle = pi * r * r;
		
		double CircumferenceOfCircle = 2 * pi *r;
		
		System.out.println("Circumference of Circle is: " + CircumferenceOfCircle);
		
		System.out.println("PI value: "+ pi);
		
	}

}
