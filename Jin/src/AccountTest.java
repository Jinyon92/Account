import java.util.Scanner;
	public class AccountTest {
		
		public static void main(String[] args){
		
			Scanner input=new Scanner(System.in);
			
			checkingAccount account1=new checkingAccount(100.00);
			checkingAccount account2=new checkingAccount(100.00);
			
			System.out.printf("Account1 balance: %f\n",account1.getbalance());
			System.out.printf("Account2 balance: %f\n",account2.getbalance());
			
			System.out.print("Enter deposit amount for account1:");
			double a;
			a=input.nextDouble();
			
			account1.credit(a);
			
			System.out.printf("Account1 balance: %f\n",account1.getbalance());
			System.out.printf("Account2 balance: %f\n",account2.getbalance());
			
		
			
			System.out.print("Enter withdrawal amount for account2:");
			double b;
			b=input.nextDouble();
			
			account2.debit(b);
			
			System.out.printf("Account1 balance: %f\n",account1.getbalance());
			System.out.printf("Account2 balance: %f\n",account2.getbalance());
			System.out.print("next month!\n");
			
			account1.nextMonth();
			account2.nextMonth();
			
			System.out.printf("Account1 balance: %f\n",account1.getbalance());
			System.out.printf("Account2 balance: %f\n",account2.getbalance());
	}
}
