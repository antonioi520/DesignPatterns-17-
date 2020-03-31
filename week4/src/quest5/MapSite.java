package quest5;

import java.util.ArrayList;

public abstract class MapSite {
	String wall;
	String door;
	String room;

	
	void prepare(){
		System.out.println("Preparing " + wall);
		System.out.println("Door is " + door);
		System.out.println("The room is now a(n)" + room);
	}
	
	void removeWall(){
		System.out.println("A wall has been removed");
	}
	
	void addWall(){
		System.out.println("Wall has been added");
	}
	
	void enchantWall(){
		System.out.println("wall has been enchanted");
	}
	
	void removeDoor(){
		System.out.println("A door has been removed");
	}
	
	void addDoor(){
		System.out.println("Door has been added");
	}
	
	void enchantDoor(){
		System.out.println("Door has been enchanted");
	}
	
	public String getWall(){
		return wall;
	}
	
	public String getDoor(){
		return door;
	}
	public String getRoom(){
		return room;
	}
	
}
