package part2;

public class Wheel extends RobotDecorator {
	Robot robot;
	
	public Wheel(Robot robot){
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + ", wheel";
	}
}