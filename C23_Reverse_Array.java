package javabasics;

import java.util.Arrays;

public class C23_Reverse_Array {

	public static void main(String[] args) 
	{
		int input[]=new int[4];
		input[0]=2;
		input[1]=4;
		input[2]=6;
		input[3]=8;
		int output[]=new int[input.length];
		
		for(int i=0,j=3;i<input.length;i++,j--)
		{
			output[j] = input[i];
		}

		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));

	}

}
