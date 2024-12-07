package javabasics;

interface One
{
	void add();
	void sub();
}

interface Two
{
	void multi();
	void div();
}

public class C20_Interface_Multiple_level implements One, Two
{
	
	public void multi() 
	{
		System.out.println("1");
	}

	public void div() 
	{
		System.out.println("2");
	}

	public void add() 
	{
		System.out.println("3");
	}

	public void sub() 
	{
		System.out.println("4");
	}
	
	public static void main(String[] args) 
	{
		
		
	}

	

}
