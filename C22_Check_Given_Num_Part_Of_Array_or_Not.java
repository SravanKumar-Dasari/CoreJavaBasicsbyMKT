package javabasics;

public class C22_Check_Given_Num_Part_Of_Array_or_Not 
{

	public static void main(String[] args) 
	{
		int rollno[] = new int[4];
		rollno[0] = 34;
		rollno[1] = 61;
		rollno[2] = 83;
		rollno[3] = 56;
		
		int given_num = 56;
		
		for(int i=0; i<=3; i++)
		{
			if (given_num == rollno[i])
			{
				System.out.println("Yes the number is present");
				System.out.println("Index Value is: " + i);
			}
			
		}
		
	}

}
