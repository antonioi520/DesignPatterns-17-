package part2;

public class DiskDrive extends RobotDecorator {
	Robot robot;
	
	public DiskDrive(Robot robot){
		this.robot = robot;
	}
	
	public String getDescription() {
		return robot.getDescription() + ", disk drive";
	}
}
