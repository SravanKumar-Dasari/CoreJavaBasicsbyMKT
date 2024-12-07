package javabasics;

public class C12_SwtichCase_ForLoop {

	public static void main(String[] args) 
	{
		int i;
		for(i=1; i<=4; i++)
		{
			switch(2)
			{
			case 1:
				System.out.println("SS Rose");
				break;
			case 2:
				System.out.println("SS Jasmine");
				break;
			case 3:
				System.out.println("SS Life");
				break;
			default:
				System.out.println("SS Whole Life");
			}
		}
	}

}
