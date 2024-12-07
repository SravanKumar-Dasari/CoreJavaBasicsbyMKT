package javabasics;

class Method_over
{
	void login()
	{
		System.out.println("Login with Mobile Number");
	}
}

public class C16_Method_Over_Riding extends Method_over
{
	void login()
	{
		super.login();
		System.out.println("Login with Email ID");
	}
	
	public static void main(String[] args) 
	{
		C16_Method_Over_Riding m1 = new C16_Method_Over_Riding();
		m1.login();

	}

}
