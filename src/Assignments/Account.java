package Assignments;

public class Account {
	
		private int accountNo;
		private float accountBalance;
		private String accountPassword;
		private String bankName;
		
		public Account(){
			accountNo = 100708634;
			accountBalance = 102045;    //Default Constructor
			accountPassword = "Amey@23";
			bankName = "Bank Of India";
			}
		
		public Account(int n, float b, String p, String sb)
		{
			accountNo = n;
			accountBalance = b;
			accountPassword = p;       //Parameterized constructor
			bankName= sb;
		}
		
		public int getaccountNo()
		{
			return accountNo;
		}
		public float getaccountBalance()
		{
			return accountBalance;
		}
		public String getaccountPassword()
		{
			return accountPassword;
		}
		public String getbankName()
		{
			return bankName;
		}
		
		public void setaccountNo(int n)
		{
			accountNo = n;
		}
		public void setaccountBalance(float b)
		{
			accountBalance = b;
		}
		public void setaccountPassword(String p)
		{
			accountPassword = p;
		}
		public void getbankName(String sb)
		{
			bankName = sb;
		}
		
		
		public void displayAccount()
		{
			System.out.println("Account No: "+getaccountNo());
			System.out.println("Account Balance: Rs."+getaccountBalance());
			System.out.println("Account Password: "+getaccountPassword());
			System.out.println("Bank Name: "+getbankName());
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.displayAccount();
		
		System.out.println("");
		
		Account obj1 = new Account(17002345, 34600, "Harsh@1","ICICI Bank");
		obj1.displayAccount();

	}

}
