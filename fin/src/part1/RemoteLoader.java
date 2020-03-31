package part1;

public class RemoteLoader {
	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();
		
		//Create all the devices
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		//Create all the light command objects
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		//create on and off command for ceiling fan
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		//create up and down command for garage door
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		//create stereo on and off commands
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		//macro command
		MacroCommand macroOn = new MacroCommand();
		MacroCommand macroOff = new MacroCommand();
		
		//load commands into remote slots
		remoteControl.setCommand(0, macroOn, macroOff);
		remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(2, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(3, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(5, garageDoorOpen, garageDoorDown);
		
		System.out.println(remoteControl);
		
		//Push on and off buttons
		System.out.println("Macro Commands:" + "\n");
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println("\n" + "Normal Commands" + "\n");
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.undoButtonWasPushed(4);
	}
}
