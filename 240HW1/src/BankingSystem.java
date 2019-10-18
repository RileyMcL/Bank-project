import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class BankingSystem {

	private static BankingSystem bs;

	Map<String, User> users = new HashMap<>();

	protected enum typeOfAccount {
		personalSa, studentSa, businessSa, personalCh, studentCh, businessCh
	};

	private BankingSystem() {
		System.out.println("Loading the goods......");
	}

	public static BankingSystem getInstance() {
		if (bs == null) {
			bs = new BankingSystem();
		}
		return bs;
	}

	protected boolean checkUser(String licNum) {
		if (users.containsKey(licNum)) {
			System.out.println("User Exists");
			return true;
		}
		System.out.println("User does not Exist");
		return false;

	}

	protected boolean checkUserAccount(User u) {

		if (u.accounts.isEmpty() == false) {
			return true;
		}

		return false;

	}

	protected void addUser(String licNum, User a) throws UserAlreadyExistsException {
		if (users.containsKey(licNum)) {
			throw new UserAlreadyExistsException("This user already exists!");
		} else {
			users.put(licNum, a);

		}
	}

	protected void removeUser(String licNum) {
		users.remove(licNum);
	}

	protected void openAccount(User u, typeOfAccount a, BigDecimal accountBalance,
			String accountOwner, String authUser, Date dateCreated, Date dateClosed) {
		Random r = new Random();
		int userNum;
		switch (a) {
		case personalSa:
			userNum = r.nextInt(10000);
			SavingsAccount pS = new PersonalSavings(accountBalance, userNum, accountOwner, authUser, dateCreated,
					dateClosed);
			u.accounts.add(pS);
		case studentSa:
			userNum = r.nextInt(10000);
			SavingsAccount sS = new StudentSaving(accountBalance, userNum, accountOwner, authUser, dateCreated,
					dateClosed);
			u.accounts.add(sS);
		case businessSa:
			userNum = r.nextInt(10000);
			SavingsAccount bS = new BusinessSaving(accountBalance, userNum, accountOwner, authUser, dateCreated,
					dateClosed);
			u.accounts.add(bS);
		case personalCh:
			userNum = r.nextInt(10000);
			CheckingAccount pC = new PersonalChecking(accountBalance, userNum, accountOwner, authUser, dateCreated,
					dateClosed);
			u.accounts.add(pC);
		case studentCh:
			userNum = r.nextInt(10000);
			CheckingAccount sC = new StudentChecking(accountBalance, userNum, accountOwner, authUser, dateCreated,
					dateClosed);
			u.accounts.add(sC);
		case businessCh:
			userNum = r.nextInt(10000);
			CheckingAccount bC = new BusinessChecking(accountBalance, userNum, accountOwner, authUser, dateCreated,
					dateClosed);
			u.accounts.add(bC);
		}

	}

	protected void closeAccount(User u, typeOfAccount a, int userId) {
		switch(a) {
		case businessCh:
			 if ((u.accounts.contains(userId))){
				System.out.println("hi");
			}
			
		
		
		
		}
	}

	protected void printTransaction(User a, int accountNumber, BigDecimal amount) {

	}

}
