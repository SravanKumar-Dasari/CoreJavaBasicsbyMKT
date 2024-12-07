package javabasics;

public class C12_Continue_Keyword {

	public static void main(String[] args) 
	{
		int i;
		for(i=1; i<11; i++)
		{
			if(i<4)
			{
				continue;
			}
			if(i>=7)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
