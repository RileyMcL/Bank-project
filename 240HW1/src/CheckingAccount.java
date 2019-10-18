import java.math.BigDecimal;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckingAccount extends Account {

	CheckingAccount(BigDecimal accountBalance, int accountNumber, String accountOwner, String authUser,Date dateCreated,Date dateClosed) {
		super(accountBalance, accountNumber, accountOwner,authUser, dateCreated, dateClosed );
		// TODO Auto-generated constructor stub
	}

	private static final BigDecimal OVER_DRAFT_FEE = new BigDecimal("35.00");
	private static final BigDecimal MAX_OVER_DRAFT = new BigDecimal("-5000.00");



	/**
	 * deposit function allows user to deposit money to account checks for non
	 * numbers and negatives and returns error while repromting.
	 */
	@Override
	protected BigDecimal deposit(BigDecimal depAmount) {
		// TODO Auto-generated method stub
		if (super.verifyAmount(depAmount)) {
			accountBalance = accountBalance.add(depAmount);
			System.out.println("Your remaining balance is : " + accountBalance);
			return accountBalance;
		}
		return accountBalance;
	}

	/**
	 * checks if the account is overdrawn
	 * @return account balance
	 */
	protected BigDecimal checkOverdrawn() {
		// checks if max over draft is met.
				if (accountBalance.compareTo(MAX_OVER_DRAFT) == 0 || accountBalance.compareTo(MAX_OVER_DRAFT) == -1) {
					System.out.println("Max over draft is -5000!");
					accountBalance = MAX_OVER_DRAFT;

				}
				// checks if balance has been overdrawn if it has subtract 35 dollars.
				if (accountBalance.signum() == -1) {
					System.out.println("You have Overdrawn your account!");
					accountBalance = accountBalance.subtract(OVER_DRAFT_FEE);
				}
				System.out.println("Your remaining balance is : " + accountBalance);
				return accountBalance;
	}
	
	
	
	/**
	 * withdraw method for withdrawing money from account if overdraft charge 35
	 * dollars max overdraw is -5000 dollars no more money can be withdrawn at that
	 * point.
	 */
	@Override
	protected BigDecimal withdraw(BigDecimal withAmount) {
		// TODO Auto-generated method stub
		
		// try and catch for non numbers.

		// do while for postive numbers

		if (super.verifyAmount(withAmount)) {
			accountBalance = accountBalance.subtract(withAmount);
			checkOverdrawn();
		}
		return accountBalance;
		}
		

	public static BigDecimal getOverDraftFee() {
		return OVER_DRAFT_FEE;
	}
}
