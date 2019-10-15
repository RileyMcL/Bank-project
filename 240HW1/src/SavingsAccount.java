
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Savings account class that deals with the functions a savings account needs
 * to perform.
 * 
 * @author mclau1ra
 *
 */

public class SavingsAccount extends Account {
	SavingsAccount(BigDecimal accountBalance, int accountNumber, String accountOwner) {
		super(accountBalance, accountNumber, accountOwner);
		// TODO Auto-generated constructor stub
	}

	

	// variables being declared.
	private static final BigDecimal COMPOUND_INTEREST_RATE = new BigDecimal("0.01");
	private static final BigDecimal COMPOUND_INTEREST_YEAR = new BigDecimal("365");

//constructor.

	/**
	 * computes interest from a daily compound
	 * 
	 * @return the daily compound interest earning.
	 */
	public BigDecimal compInt() {
		BigDecimal finalAns = accountBalance.multiply(
				(BigDecimal.ONE.add(COMPOUND_INTEREST_RATE.divide(COMPOUND_INTEREST_YEAR, 15, RoundingMode.HALF_UP))
						.pow(1).subtract(BigDecimal.ONE)));
		return finalAns;
	}

//getter.
	public static BigDecimal getCompoundInterestRate() {
		return COMPOUND_INTEREST_RATE;
	}

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

	@Override
	protected BigDecimal withdraw(BigDecimal withAmount) {
		// TODO Auto-generated method stub
		accountBalance = accountBalance.subtract(withAmount);
		System.out.println("Your remaining balance is : " + accountBalance);
		return accountBalance;
	}

}
