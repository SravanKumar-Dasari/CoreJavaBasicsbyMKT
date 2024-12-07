package javabasics;

import java.util.Collections;
import java.util.Vector;

public class C28_Vector_Class 
{

	public static void main(String[] args) 
	{
		
		// addElement() method
		Vector v1 = new Vector();
		v1.addElement("String");
		v1.addElement(10);
		v1.addElement(12.45);
		v1.addElement(null);
		v1.addElement(true);
		v1.addElement(null);
		
		System.out.println("addElement method values ---> " + v1);
		
		// addElement() method with homogeneous values
		Vector<String> v2 = new Vector<String>();
		v2.addElement("String");
		v2.addElement("Class");
		v2.addElement("Double");
				
		System.out.println("addElement method with homogenous values ---> " + v2);
		
		Vector v3 = new Vector();
		v3.addAll(v1);
		v3.addElement("Class");
		v3.addElement(200);
		v3.addElement(v2);
		
		System.out.println(v3);
		
		
		// Sort Method
		Collections.sort(v2);
		System.out.println("After Sorting --->" + v2);
		
		// firstElement() method
		System.out.println("In given Array, first Element is : " + v2.firstElement());
		

		// lastElement() method
		System.out.println("In given Array, last Element is : " + v2.lastElement());
		

		// removeElement() method
		System.out.println("In given Array, remove Element is : " + v1.removeElement(null));
		System.out.println("After removeElement method : " + v1);
		
		// removeElementAt() method -- index position
		v1.removeElementAt(1);
		System.out.println("After removeElementAt method : " + v1);
		
		// removeAllElements() method -- index position
		v3.removeAllElements();
		System.out.println("After removeAllElements method : " + v3);
		
	}

}
