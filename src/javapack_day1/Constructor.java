package javapack_day1;

public class Constructor 
{
	//default constructor
	public Constructor()
	{
		System.out.println("Default Constructor");
	}
	
	//parameterized constructor
	public Constructor(int id, String name)
	{
		System.out.println(id+" -------> "+name);
	}
	public static void main(String[] args) 
	{
		Constructor c=new Constructor();  //default constructor gets called
		Constructor c1=new Constructor(100,"Harsh"); //parameterized constructor gets called
	}

}
