
public class SavingAccount extends Account {

	private double interest;
	private double time;
	
	
	public SavingAccount(double balance,double interest) {
		super(balance);
		this.interest=interest;
	}
	
	@Override
	public void debit(double withdraw){
		if(time<=12){
			System.out.println("아직 출금할 수 없습니다");
		}else{
			setbalance(getbalance()-withdraw);
		}
	}
	
	public double getWithdrawableAccount(){
		if(time<12){
			return 0;
		}else{
			return getbalance();
		}
	}
	
	public void passTime(int time){
		this.time = this.time + time;
		if(this.time==12)
			setbalance(getbalance()*Math.pow(1+interest,this.time));
	}
	
}