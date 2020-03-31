package quest2;

public class FrontGuard extends NPC{
	public FrontGuard(){
		attackBehavior = new AttackRifle();
		reasonBehavior = new ReasonDeny();
		charmBehavior = new CharmAllow();
	}
}
