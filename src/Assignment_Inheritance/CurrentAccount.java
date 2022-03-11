package Assignment_Inheritance;

public class CurrentAccount extends Account{
	
private float overdraftLimitAmount;
	
	public CurrentAccount()
	{
		super();
		overdraftLimitAmount = 100000;
	}
	public CurrentAccount(int n, float b, String p, String sb, float ol)
	{
		super(n,b,p,sb);
		overdraftLimitAmount = ol;
	}
	public float getoverdraftLimitAmount()
	{
		return overdraftLimitAmount;
	}
	public void setoverdraftLimitAmount(float ol)
	{
		overdraftLimitAmount = ol;
	}
	
	public void displayAccount()
	{
		super.displayAccount();
		System.out.println("Overdraft Limit Amount : Rs."+getoverdraftLimitAmount());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount obj = new CurrentAccount();
		obj.displayAccount();
		
		System.out.println("");
		
		CurrentAccount obj1 = new CurrentAccount(21003345, 20000, "Raj@34", "HDFC Bank", 200000);
		obj1.displayAccount();

	}

}
