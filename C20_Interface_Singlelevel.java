package javabasics;

interface Addition
{
	void add();
	void sub();
}

public class C20_Interface_Singlelevel implements Addition

{
	public void add()
	{
		System.out.println("Real Logic Implemented by Developer");
	}


	public void sub() 
	{
		System.out.println("Internal Logic");
		
	}
	
	public static void main(String[] args) 
	{
		
	}

}
