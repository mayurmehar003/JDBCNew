package thread;

public class Person1 extends Thread {
	Account account;
	public Person1(int account)
	{
		this.account=account;
	}
	@Override
	public void run()
	{
		account.depositAmount(5000);
		account.depositAmount(3000);
	}
	

}
