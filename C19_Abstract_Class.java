package javabasics;

abstract class Google_2
{
	abstract void login();
	abstract void logout();
	static void add()
	{
		System.out.println("Static Method");
	}
	void sub()
	{
		System.out.println("Non Static Method");
	}
}

public class C19_Abstract_Class extends Google_2
{	
	
	void login() 
	{
		System.out.println("Login Now");
	}

	
	void logout() 
	{
		System.out.println("Logout Now");
	}
	public static void main(String[] args) 
	{
		C19_Abstract_Class a1 = new C19_Abstract_Class();
		a1.login();
		a1.logout();
		//a1.add();
	}

}
