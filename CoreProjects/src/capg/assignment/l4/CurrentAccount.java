package capg.assignment.l4;

public class CurrentAccount extends Account{
	private double overDraftLimit;

	public CurrentAccount(double balance, Person accHolder, double overDraftLimit) {
		super(balance, accHolder);
		this.overDraftLimit = overDraftLimit;
	}
	@Override 
	public void withdraw(double amt)
	{
		//overDraftLimit;
				if((getBalance()-amt)<overDraftLimit)
				{
					
					System.err.println(this.getAccHolder().getName()+ " : Withdrawl is not possible:");
					System.err.println("For Account No: "+this.getAccNum());
					System.err.println("Error!!! Insufficient Balance :-  Overdraft Limit has been reached!!!");
				}
				else 
					super.withdraw(amt);
	}

}
