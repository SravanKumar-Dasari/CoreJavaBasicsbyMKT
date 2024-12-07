package javabasics;

public class C10_LocalVar_1 {

	public static void main(String[] args) 
	{
		int a = 100;
	//	int b;        // It is not Initialized because of this, we'll get compile time error
		int b = 20;   // Now it is initialized
		int sum = a+b;
		System.out.println(sum);
		
	}

}
