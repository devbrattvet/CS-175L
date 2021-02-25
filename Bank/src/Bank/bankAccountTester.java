package Bank;
import java.util.Scanner;
public class bankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your starting balance: ");
		double startBal=in.nextDouble();
		bankAccount myBankAccount=new bankAccount(startBal);
		System.out.println("Please enter the amount you would like to withdraw: ");
		double withdrawAmount=in.nextDouble();
		myBankAccount.withdraw(withdrawAmount);
		System.out.println("Please enter the amount you would like to deposit: ");
		double depositAmount=in.nextDouble();
		myBankAccount.deposit(depositAmount);
		System.out.println("Your current balance is: $"+myBankAccount.getBalance());
		in.close();
	}

}
