package Assignment_Inheritance;

public class SavingsAccount extends Account{
	
	private float minimumBalance;
	
	public SavingsAccount()
	{
		super();
		minimumBalance = 2000;
	}
	public SavingsAccount(int n, float b, String p, String sb, float mb)
	{
		super(n,b,p,sb);
		minimumBalance = mb;
	}
	public float getminimumBalance()
	{
		return minimumBalance;
	}
	public void setminimumBalance(int mb)
	{
		minimumBalance = mb;
	}
	
	public void displayAccount()
	{
		super.displayAccount();
		System.out.println("Minimum Balance :"+getminimumBalance());
	}

	
	public static void main (String[] args)
	{
		SavingsAccount obj = new SavingsAccount();
		obj.displayAccount();
		
		System.out.println("");
		
		SavingsAccount obj1 = new SavingsAccount(21003345, 20000, "Harsh@51", "HDFC Bank", 2500);
		obj1.displayAccount();
	}
}

