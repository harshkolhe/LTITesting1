package Arrays;

public class TwoArray 
{

	public static void main(String[] args) 
	{
		int a[][]= {
				{00,01,02}, {10,11,12}, {20,21,22}
		};
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0;i<a.length;i++)
			
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}

	}

}
