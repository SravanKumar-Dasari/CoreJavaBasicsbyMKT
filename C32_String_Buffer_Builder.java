package javabasics;

public class C32_String_Buffer_Builder {

	public static void main(String[] args) 
	{
		
		System.out.println("*** String Concat Method ***");
		System.out.println("-----------------------------");
		
		String a1 = new String("automation");
		System.out.println(a1.concat(" testing"));
		System.out.println();
		
		System.out.println("*** String Buffer ***");
		System.out.println("----------------------");
		
		StringBuffer a2 = new StringBuffer("automation selenium");
		a2.append(" course");
		System.out.println(a2);
		System.out.println();
		
		System.out.println("*** String Builder ***");
		System.out.println("-----------------------");
		
		StringBuilder a3 = new StringBuilder("automation");
		a3.append(" interviews for core java");
		System.out.println(a3);
		
	}

}
