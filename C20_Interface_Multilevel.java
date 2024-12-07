package javabasics;

interface GrandParent
{
	void add();
	void sub();
}

abstract class Parent1 implements GrandParent
{
	abstract void mul();
	abstract void div();
	void ss()
	{
		System.out.println("Logic to Expose");
	}
}


public class C20_Interface_Multilevel extends Parent1

{

	public void add() 
	{
		System.out.println("1");
	}

	public void sub() 
	{
		System.out.println("2");
	}
	
	void mul() 
	{
		System.out.println("3");
	}

	void div() 
	{
		System.out.println("4");
	}
	

	public static void main(String[] args) 
	{
		
	}


}
