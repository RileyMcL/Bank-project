

import java.math.BigDecimal;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws UserAlreadyExistsException {
//		// TODO Auto-generated method stub
	final BigDecimal accountBalance = new BigDecimal ("10000");
//		//SavingsAccount savingsAccount = new SavingsAccount(accountBalance, 1000, "Riley");
//		//CheckingAccount checkingAccount = new CheckingAccount(accountBalance, 1000, "Riley");
//		BigDecimal withAmount = null;
//		//Teller tom = new Teller(null, null, null, null, null, null, 0);
//		//tom.addUser();
//		
//		try {
//			
//			do {
//				Scanner kb = new Scanner(System.in);
//				System.out.println("Please enter the amount you want to withdraw: ");
//				withAmount = kb.nextBigDecimal();
//				if (withAmount.signum() == -1 || withAmount.compareTo(accountBalance) == 1) {
//					System.out.println("Please enter a valid amount!");
//				}
//			} while (withAmount.signum() == -1 || withAmount.compareTo(accountBalance) == 1);
//		} catch (InputMismatchException e) {
//			System.out.println("You must enter a number!");
//		}
//		
//		//savingsAccount.withdraw(withAmount);
//		
//		Scanner kb = new Scanner(System.in);
//		System.out.println("Please enter the amount you want to withdraw: ");
//		withAmount = kb.nextBigDecimal();
//		
		//checkingAccount.withdraw(withAmount);
		//savingsAccount.deposit(new BigDecimal ("20.00"));
		//checkingAccount.deposit();
		//checkingAccount.withdraw();
		//System.out.println(savingsAccount.compInt());
		
		Date date = new Date();
		User Riley = new User("Riley", "McLaughlin", "10/28/1997", "696969", "Theater", "302 oak tree drive", 21);
		Teller Tom = new Teller(null, null, null, null, null, null, 0);
		Tom.addUser(Riley.licNum, Riley);
		Tom.openAccount(Riley,BankingSystem.typeOfAccount.businessCh, accountBalance,"janet", "Riley", date, null);
		Tom.openAccount(Riley,BankingSystem.typeOfAccount.businessCh, accountBalance,"janet", "Riley", date, null);
		System.out.println(Riley.accounts);
		Tom.closeAccount(Riley, BankingSystem.typeOfAccount.businessCh, );
		
		
		
		
		
	}

}

class UserAlreadyExistsException extends Exception{
	public UserAlreadyExistsException(String message) {
		super(message);
	}
	
}
