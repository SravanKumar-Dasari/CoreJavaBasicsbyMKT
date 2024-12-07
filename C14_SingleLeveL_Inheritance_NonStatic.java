package javabasics;

public class C14_SingleLeveL_Inheritance_NonStatic extends C14_SingleLeveL_Inheritance_NonStatic_Method
{
	
	void multi()
	{
		System.out.println("for Multiplication method required min 2 parameters");
	}
	
	public static void main(String[] args) 
	{
		C14_SingleLeveL_Inheritance_NonStatic s1 = new C14_SingleLeveL_Inheritance_NonStatic();
		s1.add();
		s1.sub();
		s1.multi();
	}

}
