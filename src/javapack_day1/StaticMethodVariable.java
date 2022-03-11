package javapack_day1;

public class StaticMethodVariable 
{
	static int svar=1000;
	
	public static void display(int id, String empname)
	{
		System.out.println(id + "--------->"+ empname);
		System.out.println("Static variable is: "+svar);
	}
	public static void main(String[] args) 
	{
		display(101,"Harsh");
		//System.out.println(svar);
	}

}
