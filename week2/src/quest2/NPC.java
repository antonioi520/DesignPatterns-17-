package quest2;

public class NPC {
	attackBehavior attackBehavior;
	ReasonBehavior reasonBehavior;
	CharmBehavior charmBehavior;
	
	public NPC(){}
	
	public void attack(){
		attackBehavior.attack();
	}
	public void reason(){
		reasonBehavior.reason();
	}
	public void charm(){
		charmBehavior.charm();
	}
	
	public void setattackBehavior(attackBehavior ab){
		attackBehavior = ab;
	}
	public void setreasonBehavior(ReasonBehavior rb){
		reasonBehavior = rb;
	}
	public void setcharmBehavior(CharmBehavior cb){
		charmBehavior = cb;
	}

	
	
}
