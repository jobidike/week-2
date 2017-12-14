package atmproject;

public class Atm {
	

	private String requiredPin;
	private double balance;
	
	public Atm(String requiredPin, double balance) {
		this.requiredPin=requiredPin;
		this.balance=balance;
	}
	
	public boolean allowAccess(String enteredPin) {
		return requiredPin.equals(enteredPin);  //do not use == for this
		}
	public void makeDeposit(double amount) {  //only use this if names were the same
		balance += amount;   //if we were making a new balance then we would need to specify this. balance
	}
	
	public void makeWithdraw(double amount) {
		balance -=amount;
	}
	
	public double getBalance() {
		return balance;
	}
	}





