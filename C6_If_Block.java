package javabasics;

public class C6_If_Block {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		int a = 10;
		int b = 20;
		int d = 30;
		
		// 1st condition - a > d, if it's true print -- "Hello" and also, print other-than if-block
		if (a>d)
		{
			System.out.println("Hello");
		}
		System.out.println("Outside of the block");
		
		// 2nd condition - a < b, if it's true print -- "Hello World" and also, print other-than if-block
		if (a<b)
		{
			System.out.println("Hello World");
		}
		System.out.println("Outside of the If-Block");
	}

}
