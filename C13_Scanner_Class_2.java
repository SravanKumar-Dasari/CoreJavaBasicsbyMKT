package javabasics;

import java.util.Scanner;

public class C13_Scanner_Class_2 {

	public static void main(String[] args) 
	{
		System.out.println("**** write a programme, Add, Sub, Multi, Div, Mod operators using 2 var in Single programme by Scanner Class ****");
		System.out.println();
		
		Scanner ss_1 = new Scanner(System.in);
		
		System.out.println("Enter the number of a: " );
		int a = ss_1.nextInt();
		
		System.out.println("Enter the number of b: ");
		int b = ss_1.nextInt();
		
		int sum = a+b;
		System.out.println("Sum of the 2 number: " + sum);
		
		int sub = a-b;
		System.out.println("Subtraction of the 2 numbers: " + sub);
		
		int multi = a*b;
		System.out.println("Multiplication of the 2 numbers: " + multi);
		
		int div = a/b;
		System.out.println("Division of the 2 numbers: " + div);
		
		int mod = a%b;
		System.out.println("Modulus of the 2 numbers: " + mod);
		
		
	}

}
