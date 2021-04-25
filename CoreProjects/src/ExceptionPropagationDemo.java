import java.io.IOException;

public class ExceptionPropagationDemo {

	static void put() throws IOException
	{
		System.out.println("put() of MyClass");
		throw new IOException();  //
	}
	static void get() throws IOException
	{
		System.out.println("get() of MyClass");
		put();	//
	}
}
