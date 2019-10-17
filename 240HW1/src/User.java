
public class User {

	protected String fName;
	protected String lName;
	protected String bDay;
	protected String licNum;
	protected String job;
	protected String address;
	protected String accountOwner;

	public User(String fName, String lName, String bDay, String licNum, String job, String address) {
		this.fName = fName;
		this.lName = lName;
		this.bDay = bDay;
		this.licNum = licNum;
		this.job = job;
		this.address = address;
		this.accountOwner = fName + " " + lName;
	}

	protected void openCAccount(Account a ) {
		CheckingAccount cA = new CheckingAccount(a.accountBalance, a.accountNumber, a.accountOwner, a.authUser,a.dateCreated, a.dateClosed);
	}
	
	
	protected void openSAccount(Account a) {
		SavingsAccount sA  = new SavingsAccount(a.accountBalance, a.accountNumber, a.accountOwner, a.authUser,a.dateCreated, a.dateClosed);
	}

}
