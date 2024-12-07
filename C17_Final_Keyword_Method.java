package javabasics;

class ParentClass 
{
	final void add()
	{
		System.out.println("Adding 2 numbers");
	}
}

public class C17_Final_Keyword_Method extends ParentClass
{
	
	void add(int a, int b, int c)
	{
		System.out.println("Adding 3 numbers");
	}
	
	public static void main(String[] args) 
	{
		C17_Final_Keyword_Method m1 = new C17_Final_Keyword_Method();
		m1.add();
	}

}
