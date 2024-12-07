package javabasics;

public class C5_Static_Inside_Main_Method {
	
	static void addition ()
	{
		System.out.println("addition");
	}
	static void subtraction ()
	{
		System.out.println("subtraction");
	}
	static void apptitude ()
	{
		System.out.println("apptitude");
	}
	static void reasoning ()
	{
		System.out.println("reasoning");
	}
	static void quant ()
	{
		System.out.println("quant");
	}

	public static void main(String[] args) 
	{
		System.out.println("**** Access the Static Method inside the Main method ****");
		addition();
		subtraction();
		apptitude();
		reasoning();
		quant();
	}

}
