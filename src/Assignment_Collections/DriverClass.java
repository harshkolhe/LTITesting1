package Assignment_Collections;

public class DriverClass {
public static void main(String[] args) {
	
	
	InMemoryAccountDaoImpl inmem=new InMemoryAccountDaoImpl();
	inmem.addAnAccount(new Account(12345,5000,"supriya@123"));
	inmem.addAnAccount(new Account(47285,3400,"cutie@894"));
	inmem.addAnAccount(new Account(22315,2000,"pari@88472"));
	inmem.addAnAccount(new Account(42355,3700,"angel@#4772"));
	inmem.addAnAccount(new Account(32345,4300,"cat@323"));

	inmem.viewAllAccounts();
	inmem.getAccountDetails(12345);
	
}
}