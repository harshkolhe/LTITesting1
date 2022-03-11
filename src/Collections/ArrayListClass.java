package Collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListClass 
{

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		//adding element
		a.add("a");
		a.add("b");
		a.add("c");
		a.add(100);
		a.add(1);
		
		System.out.println(a.size()); //no of elements stored in arraylist
		System.out.println(a);  // print all the values in arrylist
		
		//traversing through iterator
		Iterator data = a.iterator();
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
		
		//remove value from arraylist
		a.remove(4);
		System.out.println(a);
		
		//check contains method
		System.out.println(a.contains("c"));
		
		
		

	}

}
