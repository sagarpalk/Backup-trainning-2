package synchronization;

class Account {
	int actBal;

	Account(int actBal) {
		this.actBal = actBal;
	}

	synchronized public void deposit(int dbal) {
		System.out.println("Going to Deposit!!!");
		actBal = actBal + dbal;
		System.out.println("Deposit Complete. Balance :" + actBal);
		notify();
	}

	synchronized void withdraw(int wbal) {
		System.out.println("Withdrawing!!!");
		if (wbal > actBal) {
			System.out.println("Less Balance waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {

		}
	}
}

public class ThreadCommunication {
	public static void main(String args[]) {
		Account a = new Account(60000);
		Runnable r1 = () -> {
			a.withdraw(80000);
		};

		Runnable r2 = () -> {
			a.deposit(40000);
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
