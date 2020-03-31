package part2;



public class Simulator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot1 = new VanillaRobot();
		robot1 = new Controller(robot1);
		robot1 = new DiskDrive(robot1);
		robot1 = new Keyboard(robot1);
		robot1 = new Monitor(robot1);
		robot1 = new Wheel(robot1);
		System.out.println(robot1.getDescription());
		
		System.out.println();
		
		Robot robot2 = new VanillaRobot();
		robot2 = new Keyboard(robot2);
		robot2 = new Monitor(robot2);
		robot2 = new DiskDrive(robot2);
		System.out.println(robot2.getDescription());
		
	
	}
}	
