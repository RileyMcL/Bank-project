import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

	protected String fName;
	protected String lName;
	protected String bDay;
	protected String licNum;
	protected String job;
	protected String address;
	protected String accountOwner;
	protected int age;
	List<Account> accounts = new ArrayList<>();
	
	
	public int getAge() {
		return age;
	}


	public User(String fName, String lName, String bDay, String licNum, String job, String address, int age) {
		this.fName = fName;
		this.lName = lName;
		this.bDay = bDay;
		this.licNum = licNum;
		this.job = job;
		this.address = address;
		this.accountOwner = fName + " " + lName;
		this.age = age;
	}

	protected void openCAccount(BigDecimal accountBalance, String accountOwner, int accountNumber, String authUser,Date dateCreated,Date dateClosed ) {
		CheckingAccount cA = new CheckingAccount(accountBalance, accountNumber, accountOwner, authUser, dateCreated, dateClosed);
	}
	
	
	protected void openSAccount(BigDecimal accountBalance,  String accountOwner, int accountNumber, String authUser,Date dateCreated,Date dateClosed) {
		SavingsAccount sA  = new SavingsAccount(accountBalance, accountOwner, accountNumber, authUser, dateCreated, dateClosed);
	}

	
	
	
	
}
