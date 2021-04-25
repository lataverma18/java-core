package cap.abstractinterface;

public class Executor {

	public static void main(String[] args) {
		/*Human h1=new Human();
		h1.communicateWithProjector(new Projector());
		System.out.println(AccessProjector.noOfButtons);
		/*AccessProjector p=new Projector();
		p.changeSizeOfProjection();
		p.onOff();
*/
		Jdk8InfImpl i=new Jdk8InfImpl();
		i.put();
	}

}
