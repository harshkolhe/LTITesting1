package Abstraction;


public abstract class Shape 
{
	//abstract constructor
	public Shape()
	{
		System.out.println("Abstract constructor");
	}
	//abstract method
	public abstract void draw();
	
	//non-abstract methods
	public void display() 
	{
		System.out.println("Display Shape");
	}
	public final void finalmethod()
	{
		System.out.println("Final Method");
	}
}
class Rectangle extends Shape
{

	@Override
	public void draw()  //not mandatory to implement abstract method
	{
		//display(); not mandate to call abstract method inside the sub-class 
		//finalmethod();
		System.out.println("Drawing Rectangle...");
	}
	
}
class Circle extends Shape
{

	@Override
	public void draw() 
	{
		display();
		System.out.println("Drawing Circle...");
	}
	
}
