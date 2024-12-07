package javabasics;

public class C9_Static_Para_Method {
	
	static void add(int a, int b)
	{
		System.out.println("Addition");
		System.out.println(a+b);
	}
	
	static void sub(int a, int b)
	{
		System.out.println("Subtraction");
		System.out.println(a-b);
	}
	
	static void multi(int a, int b)
	{
		System.out.println("Multiplication");
		System.out.println(a*b);
	}
	
	static void full(int a, int b, double c, float d, boolean e, char f, String g)
	{
		System.out.println("Full data types");
	}
	
	public static void main(String[] args) 
	{
		add(40, 9);
		sub(25, 10);
		multi(25, 20);
		full(2, 4, 3.34, 1, false, 'S', "SravanSruthi");
	}

}
