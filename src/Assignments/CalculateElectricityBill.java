package Assignments;

import java.util.Scanner;

public class CalculateElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter number of units: ");
		 
		Scanner obj = new Scanner(System.in);
				float units = obj.nextFloat();

				if(units<=100)
				{
					float bill= units * 1.20f;
					System.out.println("Electricity Bill : Rs."+bill);
				}
				else if(units > 100 && units <= 200)
				{
					float bill = (100 * 1.20f) + ((units-100) * 2);
					System.out.println("Electricity bill : Rs."+bill);
				}
				else if(units > 300)
				{
					float bill= (100 * 1.20f) + (200 * 2) + ((units-300) * 3);
					System.out.println("Electricity bill : Rs."+bill);
				}
			}
			
			
		}
		
		



