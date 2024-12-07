package javabasics;

import java.util.Scanner;

public class C13_Circumference_of_Triangle_by_Scanner {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		int a = s1.nextInt();
		System.out.println("Enter the 'a' value: ");
		int b = s1.nextInt();
		System.out.println("Enter the 'b' value: ");
		int c = s1.nextInt();
		System.out.println("Enter the 'c' value: ");
		
		// Circumference of Triangle = a + b + c;
		
		int CircumofTriangle = a + b + c;
		
		System.out.println("Circumference of Triangle is: " + CircumofTriangle);
	}

}
