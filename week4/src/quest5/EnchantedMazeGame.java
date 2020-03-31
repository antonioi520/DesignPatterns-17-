package quest5;

public class EnchantedMazeGame extends MazeGame{
	protected MapSite createMaze(String type){
		if(type.equalsIgnoreCase("wall")){
			return new EnchantedWall();
		}
		else if(type.equalsIgnoreCase("door")){
			return new EnchantedDoor();
		}
		else if(type.equalsIgnoreCase("room")){
			return new EnchantedRoom();
		}
		else return null;
	}
}
