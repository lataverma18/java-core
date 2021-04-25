import java.io.IOException;

class A
{
	void display()
	{
		
	}
}
class B extends A
{
	
}
public class ExceptionDemo {

	public static void main(String[] args) {
		int a=10,b=2; //Scanner--From users
		int c=a+b;	//10
		int d=a-b;	//10
		int e=a*b;	//0
		int f=0;
		try
		{
			f=a/b;	//Infinite  //Abnormal Execution  //ArithmeticException
			System.out.println(f);
			
			try {
				throw new IOException();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			//System.exit(0);//finally is not executed
			//B b1=(B)new A();
			/*A a1=null;
			a1.display();*/
		}
		catch(ClassCastException e2)
		{
			System.out.println("You need Backward Typecasting");
		}
		catch(ArithmeticException ex)  	//General Catch Block should be the last catch block
		{
			
			System.out.println("Exception: "+ex);
		}
		finally
		{
			System.out.println("Closing operations");
		}
		
		
		System.out.println(c+"\t"+d+"\t"+e+"\t"+f);
		System.out.println("End");
	}
}
