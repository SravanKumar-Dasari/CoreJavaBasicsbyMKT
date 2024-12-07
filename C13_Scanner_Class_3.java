package javabasics;

import java.util.Scanner;

public class C13_Scanner_Class_3 {

	public static void main(String[] args) 
	{
		System.out.println("**** let's do Declaration & Initialization using all the Scanner methods *****");
		System.out.println();
		
		Scanner m1 = new Scanner(System.in);
		
		String name = m1.next();
		int n1 = m1.nextInt();
		double d1 = m1.nextDouble();
		float f1 = m1.nextFloat();
		byte b1 = m1.nextByte();
		long l1 = m1.nextLong();
		short s1 = m1.nextShort();
		
		System.out.println(name);
		System.out.println(n1);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(b1);
		System.out.println(l1);
		System.out.println(s1);
		
		
		
		}

}
