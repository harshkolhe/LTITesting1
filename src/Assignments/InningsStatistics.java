package Assignments;

public class InningsStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int runs[]= {0,2,1,0,0,0,4,6,6,2,1,1,0,0,4,2,4,6,6,2,1,1,1,0,0,2,6,4,2,1};
		
		float sum=0;
		for(int i=0; i<runs.length; i++)
		{
			sum += runs[i];
		}
		System.out.println("Total runs scored by batsman: "+sum);
		System.out.println("");
		
		int count0 =0;
		int count1= 0;
		int count2= 0;
		int count4= 0;
		int count6= 0;
		
		for(int i=0; i<runs.length; i++)
		{
			if(runs[i]==0)
				count0++;
			
			else if(runs[i]==1)
				count1++;
			
			else if(runs[i]==2)
				count2++;
			
			else if(runs[i]==4)
				count4++;
			
			else if(runs[i]==6)
				count6++;
		}
		System.out.println("Number of 0s: "+count0);
		System.out.println("Number of 1s: "+count1);
		System.out.println("Number of 2s: "+count2);
		System.out.println("Number of 4s: "+count4);
		System.out.println("Number of 6s: "+count6);
		System.out.println("");
		
		float strikerate = (sum/runs.length) * 100;
		System.out.println("Strike Rate : "+strikerate);
		
	}

}
