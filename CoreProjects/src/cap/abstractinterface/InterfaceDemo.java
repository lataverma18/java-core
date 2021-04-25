package cap.abstractinterface;

interface Inf1
{
	void get();
}
class ABC implements Inf1
{
	public void get()
	{
		System.out.println("get of ABC");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		ABC a1=new ABC();
		a1.get();
		
		//Second Way
		Inf1 i1=new ABC();  //Upcasting
		i1.get();
	}
}
