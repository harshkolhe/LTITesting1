package Assignment_Abstract_classes;

public class SavingsAccount extends Account{
	
	private float amount;
	
	public SavingsAccount()
	{
		super();
		amount = 2000;
	}
	public SavingsAccount(int n, float b, String sb, float a)
	{
		super(n,b,sb);
		amount = a;
	}
	public float amount()
	{
		return amount;
	}
	@Override
	public void withdraw (float amount) {
		// TODO Auto-generated method stub
		float balance = getaccountBalance() - amount;
		System.out.println("Balance Amount : Rs."+balance);
	}
	
	public void displayAccount()
	{
		super.displayAccount();
		System.out.println("Withdrawl Amount : Rs."+amount);
		withdraw(amount);
	}
	

	
	public static void main (String[] args)
	{
		SavingsAccount obj = new SavingsAccount();
		obj.displayAccount();
		
		System.out.println("");
		
		SavingsAccount obj1 = new SavingsAccount(21003345, 20000, "HDFC Bank", 2500);
		obj1.displayAccount();
	}
	
}