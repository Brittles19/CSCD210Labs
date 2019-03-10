package cscd210Classes;


public class CheckingAccount {
	private int acctNum;
	private double bal;


//DVC
public CheckingAccount(final int acctNum) {
	this.acctNum = 100;
}
public CheckingAccount(final int acctNum, final double bal) {
	this.acctNum = acctNum;
	this.bal = bal;
}
public int getAcctNumber() {
	return acctNum;
	
}
public double getBalance() {
	return bal;
}
public void setAccountNumber(final int acctNum) {
	if( acctNum <= 0)
		throw new IllegalArgumentException("Account number cannnot be less than or equal to zero");
	this.acctNum = acctNum;

}
public void setBalance(final double bal) {
	if(bal <= 0)
		throw new IllegalArgumentException("Balance cannot be less than or equal to zero");
	this.bal = bal;
}

public void withdrawal(final double amt) {
	if(amt > 0) {
		this.setBalance(bal);
	}else
	if(amt > this.bal) {
		
	}
	}

public void deposit(final double amt1) {
	if(amt1 <= 0)
		throw new IllegalArgumentException("Amount cannot be less than or equal to zero");
	if(amt1 > 0)
		this.setBalance(bal + amt1);
}



@Override
public String toString() {
	String str = "Account Number: " + this.acctNum + "\n" + "Account Number: $" + this.bal + "\n";
	return str;
}
@Override
public boolean equals(Object o) {
	if(o == this)
		return true;
	if(o == null)
		return false;
	if(!(o instanceof CheckingAccount))
		return false;
	CheckingAccount pi =(CheckingAccount) o;
	Boolean res = String.valueOf(this.acctNum).equals(String.valueOf(pi.acctNum)) && (this.bal == pi.bal);
	return res;
}
@Override
public int hashCode() {
	int res = String.valueOf(this.acctNum).hashCode() + String.valueOf(this.bal).hashCode();
	return res;
}
}
