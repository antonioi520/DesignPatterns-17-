package part1;

public interface Command {
	public void execute();
	public void undo(); //opposite of what was executed
}
