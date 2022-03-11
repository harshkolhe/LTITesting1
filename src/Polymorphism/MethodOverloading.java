package Polymorphism;

public class MethodOverloading 
{
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("The result of a and b is "+c);
	}
	public void add(int a, float b)// Method name is same but parameters passed should be different for Method Overloading
	{
		float c=a+b;
		System.out.println("The result of a and b is "+c);
	}
	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.add(10, 20);
		obj.add(10, 20.23f);

	}

}
