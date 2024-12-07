package javabasics;

import java.util.Date;

public class C25_Current_Future_Past_Time_In_Date_Class 
{

	public static void main(String[] args) 
	{
		// taking epoch time
		Date d1 = new Date();
		System.out.println(d1.getTime());
		// For Current Time
		Date d2 = new Date(d1.getTime()); // converting epoch time to current time
		System.out.println(d2);
		// For Past time
		Date d3 = new Date(d1.getTime() - (1000 * 60 * 60 * 24 * 1));
		System.out.println(d3);
		//For Future time
		Date d4 = new Date(d1.getTime() + (1000 * 60 * 60 * 24 * 1));
		System.out.println(d4);
		
		String clock_time = d2.toString();
		String month = clock_time.substring(4, 7);
		System.out.println(month);
		String date = clock_time.substring(8, 10);
		System.out.println(date);
		String year = clock_time.substring(clock_time.length()-4);
		System.out.println(year);
		
		// Printing the date format without any spaces
		String format1 = date.concat(month).concat(year);
		System.out.println(format1);
		// Printing the date format with Spaces
		String format2 = date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(format2);
		// Printing the date format with Special Characters
		String format3 = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format3);
		String format4 = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format4);
		
		
		
		
	}

}
