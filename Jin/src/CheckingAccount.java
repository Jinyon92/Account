
public class CheckingAccount extends Account {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount(double balance,double credit_limit,double interest,double loan_interest) {
		super(balance);
		this.credit_limit=-(credit_limit);	
		this.interest = interest;
		this.loan_interest=loan_interest;
	}

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
	
	public double getWithdrawableAccount(){
		return (getbalance()-credit_limit);
	}
	
	public boolean isBankrupted(){
		if(getbalance()<credit_limit)
			return true;
		else
			return false;	
		
	}
	
	
	public void passTime(int time){
		if(getbalance()>0){
			setbalance(getbalance()+time*(getbalance()*interest));
		}else{
			setbalance(getbalance()+time*(getbalance()*loan_interest));
		}
	}
	
}
