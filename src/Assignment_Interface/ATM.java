package Assignment_Interface;

interface ATM {
	
public abstract double withdraw(int accNo, double amount);

public abstract void changePassword(int accNo, String oldPassword, String newPassword);

public abstract double checkBalance();
}
