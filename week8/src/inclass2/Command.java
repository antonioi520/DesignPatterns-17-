package inclass2;

public interface Command {
	public void execute();
	public void undo(); //opposite of what was executed
}
