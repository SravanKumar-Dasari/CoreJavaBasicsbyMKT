package javabasics;

public class C8_Non_Static_Inside_Main_Method {
	
	/*
	 * syntax for Non-static Method:
	 * =============================
	 * 
	 *  className ref_variable = new className();
	 *  ref_variable.nonstaticmethod();
	 * 
	 */
	
	void login ()
	{
		System.out.println("login with email");
	}
	
	void logout()
	{
		System.out.println("logout");
	}
	
	public static void main(String[] args) 
	{
		C8_Non_Static_Inside_Main_Method ref_var_1 = new C8_Non_Static_Inside_Main_Method();
		ref_var_1.login();
		ref_var_1.logout();
	}

}
