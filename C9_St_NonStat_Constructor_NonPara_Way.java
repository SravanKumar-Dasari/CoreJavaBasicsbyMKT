package javabasics;

public class C9_St_NonStat_Constructor_NonPara_Way 
	{

		/* 
		 * Static Method
		 * ==============
		 */
		
		static void add()
		{
			System.out.println("Static method with No parameters");
		}
		
		
		/* 
		 * Non-Static Method
		 * ==================
		 */
		
		void add1()
		{
			System.out.println("Non static method with NO parameters");
		}
		
		
		/* 
		 * Constructor 
		 * ============
		 */
		
		C9_St_NonStat_Constructor_NonPara_Way()
		{
			System.out.println("Constructor Method with No parameter");
		}
		
		public static void main(String[] args) 
		{
			System.out.println("**** Create a Class consisting of Static Methods and Non-Static Methods and Constructors in Non Parameterised way****");
		
			System.out.println("---------------------------------------------------------------------------------------------------------------------");
			
			System.out.println();
			
			System.out.println("Static Method");
			System.out.println("--------------");
			
			add();
			
			System.out.println();
			
			System.out.println("Non-Static Method");
			System.out.println("------------------");
			
			C9_St_NonStat_Constructor_NonPara_Way s1 = new C9_St_NonStat_Constructor_NonPara_Way();
			s1.add1();
			
			System.out.println();
			
			System.out.println("Constructor");
			System.out.println("------------");
			
			new C9_St_NonStat_Constructor_NonPara_Way();

	}

}
