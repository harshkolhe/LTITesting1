package Strings;

public class StringSample1 
{

	public static void main(String[] args) 
	{
		// Literals:
		String s1="Harsh";
		String s2="Harsh";// created only one object
	
		System.out.println(s1); 
		System.out.println(s2);
		
		if(s1==s2)
		{
			System.out.println("s1 and s2 is equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 is equal");
		}
		
		
		//concatination- concat() , +operator
		s1= s1.concat("Kolhe");
		System.out.println("s1 value is "+ s1);
		
		
		String a1=new String ("Hello");
		String a2= new String ("Hello");
		
		//compare 2 object reference
		if(a1==a2)  //'=='compares two references
		{
			System.out.println("a1 is equal to a2");
		}
		else
		{
			System.out.println("a1 is not equal to a2");
		}
		//compare characters inside string object
		if(a1.equals(a2))  //'equals'compares characters inside the reference
		{
			System.out.println("a1 is equal to a2");
		}
		
		
	}

}
