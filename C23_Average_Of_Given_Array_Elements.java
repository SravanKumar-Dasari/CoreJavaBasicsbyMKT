package javabasics;

public class C23_Average_Of_Given_Array_Elements 
{

	public static void main(String[] args) 
	{
		double age[] = new double[5];
		age[0] = 20;
		age[1] = 35;
		age[2] = 45;
		age[3] = 64;
		
		double sum = 0;
		
		for (int i=0; i<age.length; i++)
		{
			sum = sum + age[i];
		}
		
		System.out.println(sum);
		
		double Average = sum/age.length;
		System.out.println(Average);
		
 	}

}
