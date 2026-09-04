package neeraj.exception;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(100000);
		a.deposite(50);
		try {
			a.withdrawl(100060);

		} catch (InsuficientBalance e) {
			System.out.println(e);
		}
	}

}
