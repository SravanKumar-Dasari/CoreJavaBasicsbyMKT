package javabasics;

public class C32_StringBuffer_Methods 
{

	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("Sravan Kumar");
		//append(object) method
		s1.append(" Dasari");
		System.out.println("Append method : " + s1);
		// delete(int start index, int end index) method
		s1.delete(7, 13);
		System.out.println("Delete method : " + s1);
		//insert(int index, String str) method
		s1.insert(7, "Sruthi ");
		System.out.println("Insert method : " + s1);
		// single substring(int index)
		System.out.println("Single SubString : " + s1.substring(7));
		// double substring(int start index, int end index)
		System.out.println("Double SubString : " + s1.substring(7, 13));
		// replace method
		s1.replace(14, 20, "Satya Sri");
		System.out.println("Replace method : " + s1);
		// capacity method
		System.out.println("Capacity method : " + s1.capacity());
		// charAt method
		System.out.println("charAt method : " + s1.charAt(7));
		// reverse method
		s1.reverse();
		System.out.println("Reverse method : " + s1);
		
	}

}
