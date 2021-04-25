class NegativeAgeException extends RuntimeException
{
	public NegativeAgeException() {
		super();
	}	
}


public class AgeExcepDemo {
	public static void main(String []args)
	{
		int aNumber=3;
	if (aNumber >= 0)
			if (aNumber == 0)
			       System.out.println("first string");
			else System.out.println("second string");
			System.out.println("third string");

		/*System.out.println("Enter the Age:");
		int age=0;
		try
		{
			age=new java.util.Scanner(System.in).nextInt();
		if(age<0)
			throw new NegativeAgeException();
		}
		catch(NegativeAgeException ne)
		{
			age=0;
			System.out.println(ne);
		}
		System.out.println("Age is:"+age);*/
	}
}
