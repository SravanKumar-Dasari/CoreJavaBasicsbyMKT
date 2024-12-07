package javabasics;

public class C12_Continue_Keyword_Skip_3 {

	public static void main(String[] args) 
	{
		int i;
		for (i=1; i<=8; i++)
		{
			if (i>=3)
			{
				continue;
			}
			
			System.out.println(i);
		}
	}

}
