package javabasics;

import java.util.Arrays;

public class C22_Array_Program_Int_DataType 
{

	public static void main(String[] args) 
	{
		int rollno[] = new int[4];
		rollno[0] = 85;
		rollno[1] = 67;
		rollno[2] = 95;
		rollno[3] = 50;
	
	/*	
		//1st method to print Int Data Type values
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		
		//2nd method to print Int Data Types by using for-loop
		for (int i=0; i<=3; i++)
		{
			System.out.println(rollno[i]);
		}
		
	*/	
		//3rd method to print Int Data Types in Array
		System.out.println(Arrays.toString(rollno));
		
	}

}
