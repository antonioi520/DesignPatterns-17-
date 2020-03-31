package part2;

public class Controller extends RobotDecorator {
	Robot robot;
	
	public Controller(Robot robot){
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + ", controller";
	}
}
