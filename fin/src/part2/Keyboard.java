package part2;

public class Keyboard extends RobotDecorator {
	Robot robot;
	
	public Keyboard(Robot robot){
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + ", keyboard";
	}
}
