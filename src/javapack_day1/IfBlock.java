package javapack_day1;

import java.util.Scanner;

public class IfBlock 
{

	public static void main(String[] args) 
	{
		//int a=10;
		//int b=10;
		System.out.println("Enter the value of a:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
				
		if(a==b) 
		{
			System.out.println("a and b are equal and the value of a and b is 10");
		}

	}
}