package quest4;

public class Boss {
	static int health;
	private static Boss uniqueInstance;
	private Boss(){
		health = 100;
	}
	public static Boss getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Boss();
		}
		return uniqueInstance;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
}
