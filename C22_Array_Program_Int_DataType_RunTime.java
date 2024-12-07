package javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class C22_Array_Program_Int_DataType_RunTime 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		int age[] = new int[4];
		
		for(int i=0; i<=3; i++)
		{
			System.out.println("Enter the value of Index --> " + i);
			age[i] = s1.nextInt();
		}
		
		System.out.println(Arrays.toString(age));
		
	}

}
