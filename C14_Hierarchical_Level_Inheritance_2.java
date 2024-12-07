package javabasics;

public class C14_Hierarchical_Level_Inheritance_2 extends C14_Hierarchical_Level_Inheritance
{
	static void log()
	{
		System.out.println("Waiting for the Audit Log");
	}
	
	static void call_log()
	{
		System.out.println("Call History is required");
	}
	
	public static void main(String[] args) 
	{
		add();
		log();
		call_log();
	}
}
