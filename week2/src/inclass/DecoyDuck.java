package inclass;

public class DecoyDuck extends Duck {
	
	public DecoyDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("looks like a decoy duck");
	}
}
