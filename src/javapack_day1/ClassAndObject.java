package javapack_day1;

public class ClassAndObject 
{
	//properties/instance
	int var1= 10;
	int var2= 20;
	
	//Method
	public void add()
	{
		int c= var1 + var2;
		System.out.println("The result is "+c);
	}

	public static void main(String[] args) 
	{
		//invoke method or properties by creating an object to this class
		ClassAndObject obj= new ClassAndObject();
		obj.add();
		System.out.println("var1 value is: "+obj.var1);

	}

}
