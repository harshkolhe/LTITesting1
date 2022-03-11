package Strings;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		String s1= new String("Hello Welcome");
		
		System.out.println(s1);
		
		//Methods
		System.out.println(s1.charAt(0));// index of 0 is H, index starts from 0
		System.out.println("Length of String is: "+s1.length());
		System.out.println("get the substring: "+s1.substring(5, 13));// return substring of s1
		System.out.println("Check whether s1 contains Welcome:(T/F): "+s1.contains("Welcome"));
		System.out.println("Equality (T/F): "+s1.equals("Hello Welcome"));
		System.out.println("Equals ignorecase(T/F): "+s1.equalsIgnoreCase("hello welcome"));
		System.out.println("Replace of all the occurances: "+s1.replace('l', '*'));
		System.out.println("Check string is empty(T/F): "+s1.isEmpty());
		System.out.println("String  to uppercase: "+s1.toUpperCase());
		System.out.println("Convert to lowercase: "+s1.toLowerCase());
		
		String[] s3 =s1.split(" ");
		System.out.println(s3[0]);// hello
		System.out.println(s3[1]);//welcome
		
		/*
		String[]s4= s1.split("e");
		System.out.println(s4[0]);
		*/
		
		String s2="   Hello    ";
		System.out.println(s2.trim());
		
		                                     

	}

}
