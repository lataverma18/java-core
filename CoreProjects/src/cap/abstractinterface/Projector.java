package cap.abstractinterface;

public class Projector implements AccessProjector {
	@Override
	public void onOff() {
		System.out.println("Used to Switch On or Off the projector");
	}

	@Override
	public void changeSizeOfProjection() {
		System.out.println("To Change the Projection resolution");	
	}
}
