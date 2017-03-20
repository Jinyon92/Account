import java.util.Scanner;
	public class AccountTest {
		
		public static void main(String[] args){
		
			Scanner input=new Scanner(System.in);
			
			Account account1=new Account(50.00);
			Account account2=new Account(0.00);
			
			System.out.printf("Account1 balance: %f\n",account1.getbalance());
			System.out.printf("Account2 balance: %f\n",account2.getbalance());
			
			System.out.print("Enter withdrawal amount for account1:");
			double a;
			a=input.nextDouble();
			
			account1.debit(a);
			
			System.out.printf("substracting %f from account1 balance\n",a);
			
			System.out.printf("Account1 balance: %f\n",account1.getbalance());
			System.out.printf("Account2 balance: %f\n",account2.getbalance());
			
			System.out.print("Enter withdrawal amount for account2:");
			double b;
			b=input.nextDouble();
			
			account2.debit(b);
			
			
			System.out.printf("\n substracting %f from account2 balance\n",b);
			
			System.out.printf("Account1 balance: %f\n",account1.getbalance());
			System.out.printf("Account2 balance: %f\n",account2.getbalance());
			
			
	}
}
