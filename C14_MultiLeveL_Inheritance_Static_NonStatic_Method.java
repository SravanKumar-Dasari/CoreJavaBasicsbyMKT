package javabasics;

class Three
{
	static void signIn() 
	{
		System.out.println("To Access the Website, SignIn is required");
	}
}

class Two_1 extends Three
{
	static void signUp()
	{
		System.out.println("To get the account, SignUp is required");
	}
}


public class C14_MultiLeveL_Inheritance_Static_NonStatic_Method extends Two_1
{	
	static void signOut()
	{
		System.out.println("For safe browsing, Signout is mandatory");
	}
	
	public static void main(String[] args) 
	{
		signUp();
		signIn();
		signOut();
		
	}

}
