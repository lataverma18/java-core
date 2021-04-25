package cap.abstractinterface;

public class Jdk8InfImpl implements Jdk8Inf{

	@Override
	public void get() {
	System.out.println("get () of Impl");	
	}
	@Override
	public void put()
	{
		System.out.println("put of Jdk8InfImpl");
	}
}
