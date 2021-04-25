package capg.assignment.l4;

public class Account {
private long accNum;
private double balance;
private Person accHolder;
private static int autoGen=121000101;

public Account(double balance, Person accHolder) {
	super();
	this.accNum = autoGen;
	this.balance = balance;
	this.accHolder = accHolder;
	autoGen++;
}

public void deposit(double amt)
{
	this.balance=this.balance+amt;
}

public void withdraw(double amt)
{
	if(amt>balance)
		System.err.println("Error!!! Insufficient balance!!!");
	else
		this.balance=this.balance-amt;
}

public double getBalance()
{
	return this.balance;
}

public long getAccNum() {
	return accNum;
}

public void setAccNum(long accNum) {
	this.accNum = accNum;
}

public Person getAccHolder() {
	return accHolder;
}

public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}

public void setBalance(double balance) {
	this.balance = balance;
}

}
