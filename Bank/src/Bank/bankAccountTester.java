package Bank;
import java.util.Scanner;
public class bankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter amount to start the account: ");
		double startBal = in.nextDouble();
		System.out.println("Enter the interest rate for this account: ");
		double interestPct = in.nextDouble();
		bankAccount myBankAccount = new bankAccount(startBal,interestPct);
		System.out.println("Enter amount to deposit in the account: ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		double Bal = myBankAccount.getBalance();
		System.out.print("Enter amount to withdraw fom the account: ");
		double withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		double withdrawBal = myBankAccount.getBalance();
		if(withdrawBal == Bal)
		{
			System.out.print("Enter amount to withdraw from the account: ");
			withDrawAmount = in.nextDouble();
			myBankAccount.withdraw(withDrawAmount);
		}
		
		System.out.println("Would you like to know the your balance with interest? (Y/N)");
		String response = in.next();
		
		if(response.compareTo("Y")==0)
		{
			myBankAccount.calcInterest();
			System.out.println("The account balance is: $" + myBankAccount.getBalance());
		}
		else
		{
			System.out.println("The account balance is: $" + myBankAccount.getBalance());
		}	
		in.close();
	}
}
