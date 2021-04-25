package cap.abstractinterface;

abstract class A		//Animal
{
	int i;
	A()
	{
		System.out.println("Constructor of A");
	}
	void get()
	{
		System.out.println("get of A");
	}
	abstract void sound();  //Overridden in the derived class
}

class B extends A  //Dog
{
	void sound()
	{
		System.out.println("Baaarkkksss....");
	}
	void get()
	{
		System.out.println("get of B");
	}
	void put()
	{
		System.out.println("put of B");
	}
}
class C extends A			//Lion
{
	void sound()
	{
		System.out.println("Rooaarrrrrr...");
	}
	void get()
	{
		System.out.println("get of C");
	}
}
class D extends A		//Cow
{
	void sound()
	{
		System.out.println("Moo Moo....");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
	A []arr=new A[5];
	arr[0]=new B();  
	//arr[0].get();  Possible  
	//arr[0].put();  Not Possible
	
	arr[1]=new C();
	arr[2]=new D();
	arr[3]=new B();
	arr[4]=new C();
	
	for(A temp:arr)
		temp.get();  //arr[0].get()
	}
}
