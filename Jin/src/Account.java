
public abstract class Account implements Valuable {
	
	private double balance;
	
	public Account(double balance){
		if(balance>0)
		{
			this.balance = balance;
		}
	}
	public void credit(double deposit){
		balance = balance + deposit;
	}
	
	public double getbalance(){
		return balance;
	}
	protected void setbalance(double change){
		balance = change;
	}
	
	public void debit(double withdraw){
		if(balance>=withdraw)
		{
			balance = balance - withdraw;
		}
		else
		{
			System.out.print("Debit amount exceeded account balance.\n");
		}		
	}
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int time);
		
}