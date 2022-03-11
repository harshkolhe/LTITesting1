package Assignment_Abstract_classes;

public class CurrentAccount extends Account{
	
private float overdraftLimitAmount;
private float amount;
	
	public CurrentAccount()
	{
		super();
		overdraftLimitAmount = 100000;
		amount=150000;
	}
	public CurrentAccount(int n, float b, String sb, float ol, float a)
	{
		super(n,b,sb);
		overdraftLimitAmount = ol;
		amount=a;
	}
	public float getoverdraftLimitAmount()
	{
		return overdraftLimitAmount;
	}
	public void setoverdraftLimitAmount(float ol)
	{
		overdraftLimitAmount = ol;
	}
	
	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount> accountBalance)
		{
			float limit = amount - accountBalance;
			float remaining = overdraftLimitAmount - limit;
			System.out.println("Overdraft Limit Left: Rs."+ remaining);
		}
		else
		{
			float balance = accountBalance - amount;
			System.out.println("Account Balance : Rs."+ balance);
		}
		
	}
	
	public void displayAccount()
	{
		super.displayAccount();
		System.out.println("Overdraft Limit Amount : Rs."+getoverdraftLimitAmount());
		System.out.println("Withdrawl Amount: Rs."+amount);
		withdraw(amount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount obj = new CurrentAccount();
		obj.displayAccount();
		
		System.out.println("");
		
		CurrentAccount obj1 = new CurrentAccount(21003345, 100000, "HDFC Bank", 200000, 233000);
		obj1.displayAccount();

	}
	

}
