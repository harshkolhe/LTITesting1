package javapack_day1;

public class IfElseIfBlock 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b)
			System.out.println("a is greater");
		else if(b>c)
			System.out.println("b is greater");
		else if(c>a)
			System.out.println("c is greater");
		else
			System.out.println("No condition is true");

	}

}
