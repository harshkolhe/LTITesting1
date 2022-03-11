package InterfaceClass;

public class Calculation implements InterfaceClass1, InterfaceClass2

{

	@Override
	public void add(int a, int b) 
	{
		int c=a+b;
		System.out.println("Addition : "+c);
		
	}

	@Override
	public void sub(int a, int b) 
	{
		int c=a-b;
		System.out.println("Substraction : "+c);
		
	}

}
