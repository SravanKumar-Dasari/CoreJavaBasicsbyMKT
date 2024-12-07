package javabasics;

public class C10_MethodOverload {
	
	static void add()
	{
		System.out.println("Static Method with No Argument");
	}
	
	static void add(int a)
	{
		System.out.println(a); //Static Method with Arguments
	}
	
	void add(double a)
	{
		System.out.println(a); //Non-Static Method with Arguments
	}
	
	
	public static void main(String[] args) 
	{
		add();
		add(11);
		C10_MethodOverload m1 = new C10_MethodOverload();
		m1.add(2.234);
	}

}
