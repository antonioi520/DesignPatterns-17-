package inclass1;

//this is the client
public class RemoteControllerTest {
	public static void main(String[] args){
		//the remote is the invoker which will be passed a command object to make our request
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		//receiver of the request
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		//create a command and pass the receiver to it
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		//Pass the command to the invoker
		remote.setCommand(lightOn);		
		
		//simulate button being pressed
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}
