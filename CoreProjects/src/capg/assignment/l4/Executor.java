package capg.assignment.l4;

public class Executor {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("smith");
	Account smithAcc=new SavingAccount(2000,p);
	

	Person p1=new Person();
	p1.setName("Kathy");
Account kathyAcc=new CurrentAccount(3000,p1,1200);

smithAcc.deposit(2000);
kathyAcc.withdraw(2000);

System.out.println("Smith's Balance:- "+smithAcc.getBalance());
System.out.println("Kathy's Balance:- "+kathyAcc.getBalance());



	}

}
