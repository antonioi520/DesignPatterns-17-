package part1;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl(){
		onCommands = new Command[8];
		offCommands = new Command[8];
		undoCommand = new NoCommand();
		
		Command noCommand = new NoCommand();
		Command macroCommand = new MacroCommand();
		onCommands[0] = macroCommand;
		offCommands[0] = macroCommand;
		for (int i = 1; i < 8; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		if(slot == 0){
			for(int i=0; i<8; i++){
				onCommands[i].execute();
			}
		}
		else{
			onCommands[slot].execute();
		}
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot){
		if(slot == 0){
			for(int i=0; i<8; i++){
				offCommands[i].execute();
			}
		}
		else{
			offCommands[slot].execute();
		}
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed(int slot) {
		undoCommand.undo();
	}

	
	//overwrite toString
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n-------- Remote Control --------\n");
		for(int i = 0; i < onCommands.length; i++){
			stringBuff.append("[slot " + i + "] "
					+ onCommands[i].getClass().getName()
					+ "             "
					+ offCommands[i].getClass().getName()
					+ "\n");
		}
		return stringBuff.toString();
	}
}
