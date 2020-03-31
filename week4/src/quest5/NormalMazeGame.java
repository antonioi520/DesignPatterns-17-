package quest5;

public class NormalMazeGame extends MazeGame {
	protected MapSite createMaze(String type){
		if(type.equalsIgnoreCase("wall")){
			return new Wall();
		}
		else if(type.equalsIgnoreCase("door")){
			return new Door();
		}
		else if(type.equalsIgnoreCase("room")){
			return new Room();
		}
		else return null;
	}
}
