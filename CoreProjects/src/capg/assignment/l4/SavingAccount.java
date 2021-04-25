package capg.assignment.l4;

public class SavingAccount extends Account {
	final double minBal=500;
	
	
	public SavingAccount(double balance, Person accHolder) {
		super(balance, accHolder);
	}


	@Override
	public void withdraw(double amt)
	{
		//minLimit=500;
		if((getBalance()-amt)<minBal)
			System.err.println("Error!!! Insufficient Balance :-  Minimum Balance of Rs.500 is to be maintained!!!");
		else 
			super.withdraw(amt);
	}
}
