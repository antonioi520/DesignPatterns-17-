package inclass;

public class RedheadDuck extends Duck {

	public RedheadDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("looks like a readhead");
	}

}
