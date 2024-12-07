package javabasics;

public class C11_Thread_Class {

	public static void main(String[] args) throws InterruptedException 
	{
		for(int i=3; i<=20; i++)
		{
			System.out.println(i);
			i++;
			Thread.sleep(1000);
		}
	}

}
