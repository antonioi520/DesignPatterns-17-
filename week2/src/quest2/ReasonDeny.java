package quest2;

public class ReasonDeny implements ReasonBehavior{

	@Override
	public void reason() {
		System.out.println("The guard ignores you and tells you to leave");
	}

}
