package javapack_day1;

public class ForEachLoop 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		//System.out.println(a[0]);
		
		
		int sum=0;
		for(int b: a)    //For Each Loop  
			             // Also possible through simple "for" loop
		{
			sum= sum+b;
			//System.out.println(b+5);
		}
		System.out.println(sum);
		
   
	}

}
