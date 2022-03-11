package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass1 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(100);
		a.add(50);
		a.add(29);
		//a.add("Harsh");
		a.add(300);
		
		System.out.println(a); //element maintains its insertion order
		Collections.sort(a); //sorting of element will be done in collections
		System.out.println(a); // elements will be stored
		
		Collections.sort(a, Collections.reverseOrder());// element will be stored in reversed order
		System.out.println(a);
		
		//traversing through arraylist
		Iterator data = a.iterator();
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
		
		//fetch through for each loop
		for(int c:a)
		{
			System.out.println(c+100);
		}
		
	}

}
