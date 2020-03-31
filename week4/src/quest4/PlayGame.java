package quest4;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boss boss = Boss.getInstance();
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		p1.setStrikingPower(5);
		p2.setStrikingPower(10);
		p3.setStrikingPower(15);
		
		while(boss.getHealth() >= 0){
			System.out.println("Player p1 strikes boss, boss health = " + p1.strike(boss));
			if(boss.getHealth() >= 0)
				System.out.println("Player p2 strikes boss, boss health = " + p2.strike(boss));
			if(boss.getHealth() >= 0)
			System.out.println("Player p3 strikes boss, boss health = " + p3.strike(boss));
		}
		if(boss.getHealth() <= 0){
			System.out.println("Game Over!");
		}
		
	}

}
