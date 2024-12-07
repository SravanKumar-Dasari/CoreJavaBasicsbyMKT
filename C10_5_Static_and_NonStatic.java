package javabasics;

public class C10_5_Static_and_NonStatic {
	
	static void add()
	{
		System.out.println("Static Method with No Argument");
	}
	
	static void add(int a)
	{
		System.out.println(a); //Static Method with Arguments -- int
	}
	
	static void test(String un)
	{
		System.out.println(un); //Static Method with Arguments -- String
	}
	
	static void test(boolean a)
	{
		System.out.println(a); //Static Method with Arguments -- boolean
	}
	
	static void test(long a)
	{
		System.out.println(a); //Static Method with Arguments -- long
	}
	
	
	void add(double a)
	{
		System.out.println(a); //Non-Static Method with Arguments -- double
	}
	
	void add(char a)
	{
		System.out.println(a); //Non-Static Method with Arguments -- char
	}
	
	void len(long a)
	{
		System.out.println(a); //Non-Static Method with Arguments -- long
	}
	
	void add(String name)
	{
		System.out.println(name); //Non-Static Method with Arguments -- String
	}
	
	void add(float a)
	{
		System.out.println(a); //Non-Static Method with Arguments -- char
	}
	
	public static void main(String[] args) 
	{
		System.out.println("*** 5 Static Methods ***");
		System.out.println("-------------------------");
		System.out.println();
		
		add();
		add(11);
		test("Sravan");
		test(true);
		test(123456789);
		
		System.out.println();
		
		System.out.println("*** 5 Non-Static Methods ***");
		System.out.println("------------------------------");
		System.out.println();
		
		C10_5_Static_and_NonStatic s1 = new C10_5_Static_and_NonStatic();
		s1.add(2.23);
		s1.add('S');
		s1.len(567890);
		s1.add("Sruthi");
		s1.add(50.34f);
		
	}

}
