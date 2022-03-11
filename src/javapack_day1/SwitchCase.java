package javapack_day1;

import java.util.Scanner;

public class SwitchCase
{

	public static void main(String[] args) 
	{
		//String name="Harsh";
		System.out.println("Enter your Name: ");
		
		Scanner s= new Scanner(System.in);
		String name=s.next();
		
		switch(name)
		{
		case "Harsh":
			System.out.println("Welcome "+ name);
			break;
		case "Akash":
			System.out.println("Welcome "+ name);
			break;
		case "John":
			System.out.println("Welcome "+ name);
			break;
			
		default:
			System.out.println("No case is matching");
			break;
		}

	}

}
