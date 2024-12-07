package javabasics;

public class C14_SingleLeveL_Inheritance_Static_NonStatic extends C14_SingleLeveL_Inheritance_Static_NonStatic_Method
{
	
	static void login()
	{
		System.out.println("Login credentials required");
	}
	
	void logout()
	{
		System.out.println("Logout is not possible without login");
	}
	
	public static void main(String[] args) 
	{
		google();
		login();
		C14_SingleLeveL_Inheritance_Static_NonStatic a1 = new C14_SingleLeveL_Inheritance_Static_NonStatic();
		a1.amazon();
		a1.logout();
		
		
	}

}
