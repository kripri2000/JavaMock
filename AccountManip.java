import java.util.Scanner;
class Customer{
	int customerid;
	String customerName;
	String emailid;
	public Customer(int customerid, String customerName, String emailid) {
		this.customerid = customerid;
		this.customerName = customerName;
		this.emailid = emailid;
	}
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}

abstract class Account{
	protected int accountNumber;
	protected Customer customerObj;
	protected double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer getCustomerObj() {
		return customerObj;
	}
	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	Account(int accountNumber,Customer customerObj,double balance){
		this.accountNumber = accountNumber;
		this.customerObj= customerObj;
		this.balance = balance;
	}
	abstract public boolean withdraw(double amount);
		

}
class SavingsAccount extends Account{
	double minimumBalance;
	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	
    
	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public boolean withdraw(double amount) {
		if((balance-amount)>this.minimumBalance) {
			balance -= amount;
			return true;
		}			
		else
			return false;
	}
	
	
}
public class AccountManip {

	public static void main(String[] args) {		
		Customer c = new Customer(123,"krishnapriya","kp@ust.com");
		System.out.println("Enter money to be withdrawn : ");
		Scanner sc = new Scanner(System.in);
		double cash = sc.nextDouble();
		SavingsAccount saveacc = new SavingsAccount(345,c,5000,1000);
		if(saveacc.withdraw(cash))
			System.out.println("Withdraw successful\nBalance Amount : "+saveacc.getBalance());
		else
			System.out.println("Insufficient balance\nBalance Amount : "+saveacc.getBalance());
		
		

	}

}
