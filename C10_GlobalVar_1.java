package javabasics;

public class C10_GlobalVar_1 {
	
	static int age;
	static boolean answer;
	
	static double pi = 3.14;  //global variable
	
	static void add()
	{
		double area = pi * 10 * 10;
		System.out.println(area);
	}
	

	public static void main(String[] args) 
	{
		System.out.println(age);
		System.out.println(answer);
		add();
		
		double area1 = pi * 12 * 10;
		System.out.println(area1);
		
	}

}
