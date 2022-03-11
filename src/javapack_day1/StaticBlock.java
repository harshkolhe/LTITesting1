package javapack_day1;

public class StaticBlock 
{
	static int a;
	//static block
	static
	{
		a=100;
		System.out.println("Static Block "+a);
	}
	//Constructor
	public StaticBlock()
	{
		System.out.println("Default Constructor");
	}
	//Static Method
	public static void staticmethod()
	{
		System.out.println("In Static Method");
	}
	//Normal Method
	public void normalmethod()
	{
		System.out.println("In Normal Method");
	}

	public static void main(String[] args) 
	{
		StaticBlock s=new StaticBlock();
		s.normalmethod();
		staticmethod();

	}

}
