package MethodOverridding;

public class MethodOverriddingTest 
{

	public static void main(String[] args) 
	{
		Chipcardmachine c= new Chipcardmachine();
		c.readcard();  //reads chip card from child class
		
		Swipemachine s=new Swipemachine();
		s.readcard();  //reads normal card from parent class
		
		Swipemachine s1=new Chipcardmachine();
		s1.readcard();  //swipemachine is reference, but in run time object created will have 
                        // the reference of chipcardmachine
	}

}
