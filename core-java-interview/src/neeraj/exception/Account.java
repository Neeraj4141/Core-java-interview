package neeraj.exception;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Balance After Deposite = " + balance);
	}

	public void withdrawl(double amount) throws InsuficientBalance {
		if (balance < amount) {
			throw new InsuficientBalance();
		} else {
			balance = balance - amount;
			System.out.println("Balance After Withdrawl = " + balance);
		}
	}

}
