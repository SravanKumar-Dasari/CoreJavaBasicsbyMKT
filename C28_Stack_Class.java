package javabasics;

import java.util.Stack;

public class C28_Stack_Class 
{

	public static void main(String[] args) 
	{
		// push() method
		Stack<String> s1 = new Stack<String>();
		s1.push("Sravan");
		s1.push("Eating");
		s1.push("Hyderabad");
		s1.push("Biryani");
		
		System.out.println("Push Method like add method ---> " + s1);
		
		//peak() method
		Stack s2 = new Stack();
		s2.addAll(s1);
		s2.push(100);
		s2.push(true);
		s2.push(null);
		s2.push(false);
		s2.push("Class by MKT");
		System.out.println(s2);
		
		System.out.println("Peek method for last element : " + s2.peek());
		
		//pop() method -- removes last element
		System.out.println(s2.pop()); // it'll call last element
		System.out.println("After pop method : " + s2);
	}

}
