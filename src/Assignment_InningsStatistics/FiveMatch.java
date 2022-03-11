package Assignment_InningsStatistics;

import java.util.Random;

public class FiveMatch {
	int arr[] = new int[40];
	int total;
	int zero=0,one=0,two=0,three=0,four=0,six=0;
	Random rand = new Random();


	public void accept() {
		for(int i=1;i<=30;i++) {
		int int_random = rand.nextInt(7);
		arr[i]=int_random;
	}
		
		
	}
	public void totalRuns() {
		
		
		for(int i=0;i<30;i++) {
			total +=arr[i];
		}

		
	}
	public void numberOfAppearance() {
		for(int i=0;i<30;i++) {
		if(arr[i]==0)
			zero += 1;
			
		else if(arr[i]==1)
			one += 1;
			
	    else if(arr[i]==2)
		    two += 1;
	    else if(arr[i]==3)
			three += 1;
			
		else if(arr[i]==4)
			four += 1;
		
		else if(arr[i]==6)
	     	six += 1;
		
			}
		}


	public void display() {
		
		System.out.println("Number of f 0s, 1s, 2s, 3s, 4s and 6s :"+zero+", "+one+", "+two+", "+three+", "+four+", " +six+".");
		
		System.out.print("Strike Rate (runs per ball):");
		for(int i=1;i<=30;i++) {
			System.out.print(i+": "+arr[i]+", ");
		}
	}

}