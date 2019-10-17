import java.math.BigDecimal;
import java.util.InputMismatchException;
/**
 * Abstract class that is used for banking
 * @author mclau1ra
 *
 */
public abstract class Account {
	protected BigDecimal accountBalance;
	protected int accountNumber;
	protected String accountOwner;
	protected String authUser;
	protected String dateCreated;
	protected String dateClosed;
	protected enum accountStatus{active, frozen, closed};
	
	
	public Account(BigDecimal accountBalance, int accountNumber, String accountOwner, String authUser,String dateCreated,String dateClosed){
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.authUser = authUser;
		this.dateCreated = dateCreated;
		this.dateClosed = dateClosed;
	}
	
	/**
	 * checks if the amount the user want to deposit is valid.
	 * @param depAmount amount the user wants to deposit
	 * @return boolean if it is an acceptable number. 
	 */
	protected  boolean verifyAmount(BigDecimal depAmount) {
		try {
			do {
				if (depAmount.signum() == -1) {
					System.out.println("Please enter a positive number!");
					return false;
				}

			} while (depAmount.signum() == -1);
		} catch (InputMismatchException e) {
			System.out.println("You must enter a number!");
			return false;
		}
		return true;
	}
	
	
	/**
	 * This method is a abstract deposit method that will work to 
	 * deposit an amount into the account balance.
	 * @return accountBalance the balance of the account
	 */
	protected abstract BigDecimal deposit(BigDecimal depAmount);
	
	/**
	 * This method is a abstract withdraw method that 
	 * withdraws money from the account balance.
	 * @return accountBalance remaining balance
	 */
	protected abstract BigDecimal withdraw(BigDecimal depAmount);
	
	
	
	
	
	
	
	//Getters and setters.
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	
}
