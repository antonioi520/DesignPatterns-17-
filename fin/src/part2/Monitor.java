package part2;

public class Monitor extends RobotDecorator {
	Robot robot;
	
	public Monitor(Robot robot){
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + ", monitor";
	}
}
