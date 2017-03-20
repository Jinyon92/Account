
public class checkingAccount extends Account {

	public checkingAccount(double firstbalance) {
		super(firstbalance);
		
		
	}
	
	private double credit_limit = -50;
	private double interest=0.01;
	private double loan_interest=0.07;
	
	@Override
	public double debit(double withdraw){
		if(getbalance()-withdraw>credit_limit)
		{
			 return getbalance()-withdraw;
		
		}

}
