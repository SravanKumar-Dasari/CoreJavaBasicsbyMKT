package javabasics;

public class C17_This_Keyword 
{
	
	int age;
	String name;
	double salary;
	
	void employee_details(int age, String name, double salary)
	{
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) 
	{
		C17_This_Keyword t1 = new C17_This_Keyword();
		t1.employee_details(26, "Sravan Sruthi", 84000);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
	}

}
