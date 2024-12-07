package javabasics;

public class C10_GlobalVar_2 {
	
	int a = 10;              // Non Static Type
	
	static double b = 20.14; // Static Type

	public static void main(String[] args) 
	{
		
		System.out.println(b);
		
		C10_GlobalVar_2 g1 = new C10_GlobalVar_2();
		System.out.println(g1.a);
		
		
	}

}
