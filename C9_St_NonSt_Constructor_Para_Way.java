package javabasics;

public class C9_St_NonSt_Constructor_Para_Way {
	
	/* 
	 * Static Method
	 * ==============
	 */
	
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
	
	/* 
	 * Non-Static Method
	 * ==================
	 */
	
	void add1(int c, int d)
	{
		System.out.println(c+d);
	}
	
	void multi1(int c, int d)
	{
		System.out.println(c*d);
	}
	
	/* 
	 * Constructor 
	 * ============
	 */
	
	C9_St_NonSt_Constructor_Para_Way()
	{
		System.out.println("This is a Constructor Method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("**** Create a Class consisting of Static Methods and Non-Static Methods and Constructors in Parameterised way****");
	
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		System.out.println();
		
		System.out.println("Static Method");
		System.out.println("--------------");
		
		add(40, 9);
		sub(25, 10);
		multi(25, 20);
		
		System.out.println();
		
		System.out.println("Non-Static Method");
		System.out.println("------------------");
		
		C9_St_NonSt_Constructor_Para_Way s1 = new C9_St_NonSt_Constructor_Para_Way();
		s1.add1(12, 23);
		s1.multi1(20, 20);
		
		System.out.println();
		
		System.out.println("Constructor");
		System.out.println("------------");
		
		new C9_St_NonSt_Constructor_Para_Way();
	}

}
