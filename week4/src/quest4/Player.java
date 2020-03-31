package quest4;

public class Player {
	int strikingPower;
	public Player(){
		//strikingPower = this.strikingPower;
	}
	public int getStrikingPower() {
		return strikingPower;
	}
	public void setStrikingPower(int strikingPower) {
		this.strikingPower = strikingPower;
	}
	public int strike(Boss boss){
		int bossHealth = boss.health - strikingPower;
		boss.setHealth(bossHealth);
		bossHealth = boss.getHealth();
		return bossHealth;
	}
	
}
