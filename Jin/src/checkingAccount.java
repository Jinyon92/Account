
public class checkingAccount extends Account {

	public checkingAccount(double firstbalance) {
		super(firstbalance);
			
	}
	
	private double credit_limit = -50;
	private double interest=0.01;
	private double loan_interest=0.07;
	
	
	@Override
	public void debit(double withdraw){
		if(getbalance()-withdraw<credit_limit)
		{
			System.out.print("Debit amout exceeded account balance.\n");
		}
		else
		{
			setbalance(getbalance()-withdraw);
		}
	}
	
	public void nextMonth(){
		if(getbalance()>0)
		{
			setbalance(getbalance()+getbalance()*interest);
		}
		else if(getbalance()<0)
		{
			setbalance(getbalance()+getbalance()*loan_interest);
		}
	}
}
