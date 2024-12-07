package javabasics;

public class C17_Global_Local_Var 
{
	int age;
	String name;
	double salary;
	
	void employee_details(int age, String name, double salary)
	{
		System.out.println("My Age is: " + age);
		System.out.println("My Name is: " + name);
		System.out.println("My Salary is: " + salary);
	}
	

	public static void main(String[] args) 
	{
		C17_Global_Local_Var g1 = new C17_Global_Local_Var();
		g1.employee_details(25, "Sruthi", 85000);
		System.out.println(g1.age); // int default value is 0
		System.out.println(g1.name); // String default value is null
		System.out.println(g1.salary); // double default value is 0.0
		

	}

}
