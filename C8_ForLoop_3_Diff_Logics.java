package javabasics;

public class C8_ForLoop_3_Diff_Logics {

	public static void main(String[] args) 
	{
		
	// for the below code, Condition is not satisfied that's why, execution is not happened.
	
	for (int i=1; i>2; i++)
	{
		System.out.println(i);
	}
		
	// 	for the below code, -1 is bigger than -5 --> condition is satisfied and executed the logic

	for (int i=-1; i>=-5; i--)
	{
		System.out.println(i);
	}
	
	// for the below code, -i is bigger than -5 ---> condition is not satisfied that's why execution is not happened
	
	for (int i=-1; i<-5; i++)
	{
		System.out.println(i);
	}
		
	// for the below code, condition is satisfied and loop is infinite and it'll start from the 1,0,-1,-2....to infinite	

	for (int i=1; i<2; i--)
	{
		System.out.println(i);
	}
	
	
	}

}
