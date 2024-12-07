package javabasics;

public class C24_String_Method_Concat_Problems 
{

	public static void main(String[] args) 
	{
		String a = "automation";
		System.out.println(a.concat("testing"));
		System.out.println(a.concat(" testing"));
		
		String a1 = "Sravan";
		System.out.println(a1.concat(" Sruthi").concat(" Kumar"));
		
		StringBuffer s4 = new StringBuffer("MKT");
		s4.append(" Class");
		System.out.println(s4);
		
	}

}
