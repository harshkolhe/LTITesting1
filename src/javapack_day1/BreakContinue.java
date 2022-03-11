package javapack_day1;

public class BreakContinue 
{

	public static void main(String[] args) 
	{
		/*
		for(int i=0; i<=5; i++)
		{
			if(i==3)
				break;           //Stops the iteration
			System.out.println(i);
		}
		*/
		for(int i=0; i<=5; i++)
		{
			if(i==3)
				continue;        //Skips the iteration
			System.out.println(i);
		}

	}

}
