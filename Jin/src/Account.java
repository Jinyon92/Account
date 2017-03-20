
public class Account {
	
	private double balance;
	
	public Account(double firstbalance){
		if(firstbalance>0)
		{
			balance = firstbalance;
		}
	}
	public double getbalance(){
		return balance;
	}
	public void debit(double withdraw){
		if(balance>=withdraw)
		{
			balance = balance-withdraw; 
		}
		else if(balance<withdraw)
		{
			System.out.print("Dedit amount exceeded account balance");
		}
	}
	
}