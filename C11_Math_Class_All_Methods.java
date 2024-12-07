package javabasics;

public class C11_Math_Class_All_Methods {

	public static void main(String[] args) 
	
	{
		//Addition -- addExact for int & long
		System.out.println(Math.addExact(12, 10));
		System.out.println(Math.addExact(2343, 1000));
		
		//Subtraction -- subtractExact for int & long
		System.out.println(Math.subtractExact(20, 10));
		System.out.println(Math.subtractExact(2349, 100));
		
		//Multiplication -- multiplyExact for int & long
		System.out.println(Math.multiplyExact(25, 25));
		System.out.println(Math.multiplyExact(2345, 2));
		System.out.println(Math.multiplyExact(2364, 2345));
		
		//Min -- min for double, float, int & long
		System.out.println(Math.min(-1, -5));
		System.out.println(Math.min(22.34, 22.14));
		System.out.println(Math.min(23, 10));
		System.out.println(Math.min(23435, 6789));
		
		//Max -- max for double, float, int & long
		System.out.println(Math.max(2345, 987654));
		System.out.println(Math.max(23.45, 43.80));
		System.out.println(Math.max(128, 120));
		System.out.println(Math.max(567568, 987654));
		
		//abs -- absolute for double, float, int & long
		System.out.println(Math.abs(234.4589));
		System.out.println(Math.abs(20));
		System.out.println(Math.abs(23.45));
		System.out.println(Math.abs(987653348));
		
		//Math.PI
		System.out.println(Math.PI);
		
	 	//Math random
		for (int i=1; i<=20; i++)
		{
		System.out.println(Math.random());
		}
		
		
	}

}
