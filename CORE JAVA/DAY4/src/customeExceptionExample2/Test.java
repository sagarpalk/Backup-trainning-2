package customeExceptionExample2;

public class Test {

	// TODO Auto-generated method stub
	public static void main(String args[]) throws InSufficientFundException {
		AccountException acct = new AccountException();
		System.out.println("Current balance : " + acct.balance());
		System.out.println("Withdrawing $200");
		acct.withdraw(200);
		System.out.println("Current balance : " + acct.balance());
		acct.withdraw(3500);
	}

}
