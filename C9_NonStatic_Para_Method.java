package javabasics;

public class C9_NonStatic_Para_Method {
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void multi(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		C9_NonStatic_Para_Method SS = new C9_NonStatic_Para_Method();
		SS.add(25, 12);
		SS.multi(32, 30);
	}

}
