package thread;

public class Account {
	int accountBalance;
	
	public Account(int accountBalance)
	{
		super();
		this.accountbalance=accountBalance;
	}
	
	public void checkBalance()
	{
		System.out.println("current balance:"+accountBalance);
	}
	
	public void depositAmount(int amount)
	{
		System.out.println("despositing"+amount+"rs in account");
		accountBalance += amount;
		checkBalance();
	}
	public void withdrawAmount(int amount)
	{
		System.out.println("Trying to withdraw"+amount+"rs from account");
	}
	
	if(amount>accountBalance)
	{
		System.out.println("Insufficient Balance");
	}else
	{
		accountBalance-=account;
		checkBalance();
	}

}
}
