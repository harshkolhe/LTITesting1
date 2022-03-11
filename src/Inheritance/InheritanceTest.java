package Inheritance;

public class InheritanceTest 
{

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.eat();     //Single level Inheritance
		d.bark();
		
		System.out.println("-------------------");
		
		BabyDog b= new BabyDog();
		b.weep();  //Multi-Level Inheritance
		b.bark(); 
		b.eat();
		
		System.out.println("--------------------");
		
		Cat c= new Cat();
		c.meow();   //Hierarchical Inheritance
		c.eat();
		//c.bark
		//weep
	}
	
	

}
