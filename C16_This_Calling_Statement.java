package javabasics;

public class C16_This_Calling_Statement 
{
	C16_This_Calling_Statement()
	{
		this("Sravan Sruthi");
		System.out.println("Non Parameterized Constructor");
	}
	
	C16_This_Calling_Statement(String name)
	{
		this(true);
		System.out.println(name);
	}
	
	C16_This_Calling_Statement(boolean b)
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		new C16_This_Calling_Statement();

	}

}
