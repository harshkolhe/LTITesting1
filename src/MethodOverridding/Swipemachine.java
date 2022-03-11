package MethodOverridding;

 class Swipemachine 
{
	public void readcard()
	{
		System.out.println("Reads normal card");
	}
}
class Chipcardmachine extends Swipemachine
{
	public void readcard()
	{
		System.out.println("Reads chip card");
	}
}
