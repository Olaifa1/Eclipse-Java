
public class Account {
	private String name;
	private String accountType;
	private double balance;
	private double bvn;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBvn() {
		return bvn;
	}
	public void setBvn(double bvn) {
		this.bvn = bvn;
	}
	
	public double credit(double value) {
		double finalValue = 0;
		double deduction = (0.05 * value);
		double balance = value - deduction;
		if(balance <= 10000) {
			finalValue  = value;
		}
		if(balance > 10000) {
			finalValue = balance;
		}
		return balance;
	}
	

}

