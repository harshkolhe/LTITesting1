package Assignment_InningsStatistics;

import java.util.*;

public class TestFiveMatch {

	public static void main(String[] args) {
		
		   FiveMatch i1=  new FiveMatch();
		   i1.accept();
           i1.totalRuns();
           i1.numberOfAppearance();
           
           FiveMatch i2=  new FiveMatch();
		   i2.accept();
           i2.totalRuns();
           i2.numberOfAppearance();
           
           FiveMatch i3=  new FiveMatch();
		   i3.accept();
           i3.totalRuns();
           i3.numberOfAppearance();
           
           FiveMatch i4=  new FiveMatch();
		   i4.accept();
           i4.totalRuns();
           i4.numberOfAppearance();
           
           FiveMatch i5=  new FiveMatch();
		   i5.accept();
           i5.totalRuns();
           i5.numberOfAppearance();
           
           
           double avgs=i1.total+i2.total+i3.total+i4.total+i5.total/5;
           int tot = i1.total+i2.total+i3.total+i4.total+i5.total;
           System.out.println("Average score of last 5 matches: "+avgs);
           System.out.println("Total runs : "+tot);
           
           i1.display();
           i2.display();
           i3.display();
           i4.display();
           i5.display();
           
		
	}

}