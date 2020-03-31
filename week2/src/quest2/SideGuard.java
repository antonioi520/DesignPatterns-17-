package quest2;

public class SideGuard extends NPC {
	public SideGuard(){
		attackBehavior = new AttackPistol();
		reasonBehavior = new ReasonAllow();
		charmBehavior = new CharmDeny();
	}
}
