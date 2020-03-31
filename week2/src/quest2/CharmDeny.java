package quest2;

public class CharmDeny implements CharmBehavior{

	@Override
	public void charm() {
		System.out.println("You could not charm the guard and you are denied access into the building");
	}

}
