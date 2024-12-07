package javabasics;

public class C10_MethodOverload_ConstructorOverload {
	
	// Method Overloading
	
	static void add(int a)
	{
		System.out.println(a);
	}
		
	void add(String c)
	{
		System.out.println (c);
	}
	
	// Constructor Overloading
	
	C10_MethodOverload_ConstructorOverload(int a)
	{
		System.out.println(a + " " + "is 1st Constructor");
	}
	
	C10_MethodOverload_ConstructorOverload(String a)
	{
		System.out.println(a + " " + "is 2nd Constructor");
	}

	public static void main(String[] args) 
	{
		
		// Method Overloading
		add(1000);
		C10_MethodOverload_ConstructorOverload g1 = new C10_MethodOverload_ConstructorOverload("Sravan");
		g1.add("Sravan12");
		add(34);
		
		//Constructor Overloading
		new C10_MethodOverload_ConstructorOverload(10);
		new C10_MethodOverload_ConstructorOverload("Sravan");
				
		
	}

}
