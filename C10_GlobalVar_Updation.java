package javabasics;

public class C10_GlobalVar_Updation {
	
	int a = 10;
	
	static double b = 20.9; 

	public static void main(String[] args) 
	{
		 b = 10; // updating static value for global variable by directly
		 System.out.println(b);
		 
		 C10_GlobalVar_Updation g1 = new C10_GlobalVar_Updation();
		 g1.a=20; // updating non-static value for global variable
		 System.out.println(g1.a);
	}

}
