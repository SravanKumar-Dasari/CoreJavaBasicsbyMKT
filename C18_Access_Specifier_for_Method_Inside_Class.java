package javabasics;

public class C18_Access_Specifier_for_Method_Inside_Class 
{
	private void add()
	{
		System.out.println("Addition");
	}
	
	public void sub()
	{
		System.out.println("Subtraction");
	}
	
	protected void multi()
	{
		System.out.println("Multiplication");
	}
	
	void div()
	{
		System.out.println("Division");
	}
	
	
	public static void main(String[] args) 
	{
		C18_Access_Specifier_for_Method_Inside_Class a1 = new C18_Access_Specifier_for_Method_Inside_Class();
		a1.add();
		a1.sub();
		a1.multi();
		a1.div();
	}

}
