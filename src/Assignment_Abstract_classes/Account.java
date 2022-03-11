package Assignment_Abstract_classes;

public abstract class Account {
	
		private int accountNo;
		protected float accountBalance;
		private String bankName;
		
		
		public Account(){
			accountNo = 100708634;
			accountBalance = 102045;    //Default Constructor
			bankName = "Bank Of India";
			}
		
		public Account(int n, float b, String sb)
		{
			accountNo = n;
			accountBalance = b;       //Parameterized constructor
			bankName= sb;
		}
		public float getaccountBalance()
		{
			return accountBalance;
		}
		
		
		public abstract void withdraw(float amount);
		
		
		public void displayAccount()
		{
			System.out.println("Account No: "+ accountNo);
			System.out.println("Account Balance: Rs."+ accountBalance);
			System.out.println("Bank Name: "+ bankName);
		}

		

}
