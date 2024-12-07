package javabasics;

public class C24_Input_ManishKumarTiwari_Output_MKT {

	public static void main(String[] args) 
	{
		
		String input = "Manish Kumar Tiwari";
	
		String opt1 = input.substring(0, 1);
		String opt2 = input.substring(7, 8);
		String opt3 = input.substring(13, 14);
		
		String output = opt1.concat(opt2).concat(opt3);
		System.out.println(output);
		
	}

}
