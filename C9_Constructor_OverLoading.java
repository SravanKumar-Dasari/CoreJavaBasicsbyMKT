package javabasics;

public class C9_Constructor_OverLoading {
	
	C9_Constructor_OverLoading (char a)
	{
		System.out.println("This is 1st Constructor");
	}
	
	C9_Constructor_OverLoading (int b)
	{
		System.out.println("This is 2nd Constructor");
	}
	
	C9_Constructor_OverLoading (double c)
	{
		System.out.println("This is 3rd Constructor");
	}
	
	C9_Constructor_OverLoading (String d)
	{
		System.out.println("This is 4th Constructor");
	}
	
	C9_Constructor_OverLoading (int a, int b, double c, char d, String e)
	{
		System.out.println("This is 5th Constructor");
	}
	
	C9_Constructor_OverLoading ()
	{
		System.out.println("This is 6th Constructor");
	}
	
	public static void main(String[] args) 
	{
		new C9_Constructor_OverLoading ('S');
		new C9_Constructor_OverLoading (120);
		new C9_Constructor_OverLoading (2.234);
		new C9_Constructor_OverLoading ("Sravan");
		new C9_Constructor_OverLoading (25, 48, 3.576, 'M', "SruthiSravan");
		new C9_Constructor_OverLoading ();
	}

}
