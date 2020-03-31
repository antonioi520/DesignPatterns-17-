package inclass;

public class WizardDuck extends Duck {

	public WizardDuck(){
		quackBehavior = new SignLanguage();
		flyBehavior = new FlyTeleport();
	}
	
	public void display() {
		System.out.println("I'm a wizard duck");
	}
	
}
