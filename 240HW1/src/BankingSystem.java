import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingSystem {

	private static BankingSystem bs;
	Map <String, List<Account>>  accounts = new HashMap<>();
	Map <String, User> users = new HashMap<>();
	
	
	
	
	private BankingSystem() {
		System.out.println("Loading the goods......");
	}
	public static BankingSystem getInstance() {
		if(bs == null) {
			bs = new BankingSystem();
		}
		return bs;
	}
	
	
	
	
	protected boolean checkUser(String licNum) {
		if (users.containsKey(licNum)) {
			return true;
		}

		return false;

	}

	protected boolean checkUserAccount(String licNum) {

		if (accounts.containsKey(licNum)) {
			return true;
		}

		return false;

	}
	
	protected void addUser(String licNum, User a) throws UserAlreadyExistsException{
		if(users.containsKey(licNum)) {
			throw new UserAlreadyExistsException("This user already exists!");
		} else
		users.put(licNum, a);
	}
	
	
	protected void removeUser(String licNum) {
		users.remove(licNum);
	}
	
	
	protected void openAccount(User u, Account a) {
		
		List<Account> accList = new ArrayList<>();
		accList.add();
	}
	
//	protected void closeAccount() {
//		
//	}
	
	protected void printTransaction(User a, int accountNumber, BigDecimal amount ) {
		
	}
	
	
	
}
