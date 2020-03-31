package quest2;

public class ReasonAllow implements ReasonBehavior{

	@Override
	public void reason() {
		System.out.println("The guard allows you access into the building");
	}

}
