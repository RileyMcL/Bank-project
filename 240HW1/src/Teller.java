import java.math.BigDecimal;
import java.util.Date;

public class Teller extends User {
	
	private BankingSystem bs;
	

	public Teller(String fName, String lName, String bDay, String licNum, String job, String address, int age) {
		super(fName, lName, bDay, licNum, job, address, age);
		this.bs = BankingSystem.getInstance();
		// TODO Auto-generated constructor stub
	}
	
	protected boolean checkUser(String licNum) {
		return bs.checkUser(licNum);
	}
	
	protected boolean checkUserAccount(User u) {
		return bs.checkUserAccount(u);
	}
	
	protected void addUser(String licNum, User a) throws UserAlreadyExistsException{
		bs.addUser(licNum, a);
	}
	
	protected void removeUser(String licNum) {
		bs.removeUser(licNum);
	}
	
	protected void openAccount(User u, BankingSystem.typeOfAccount a, BigDecimal accountBalance,
			String accountOwner, String authUser, Date dateCreated, Date dateClosed) {
		
		bs.openAccount(u, a, accountBalance, accountOwner, authUser, dateCreated, dateClosed);
	}
	
	protected void closeAccount(User u, BankingSystem.typeOfAccount a, int userId) {
		bs.closeAccount(u, a, userId);
	}
	
	
	protected void printTransaction(User a, int accountNumber, BigDecimal amount) {
		bs.printTransaction(a, accountNumber, amount);
	}
	
	
	
	
	
	
	
	
	
	

}
