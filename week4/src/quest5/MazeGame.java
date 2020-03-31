package quest5;


public abstract class MazeGame {
	public MapSite makeMap(String type){
		MapSite mapSite;
		
		mapSite = createMaze(type);
		
		mapSite.addWall();
		mapSite.enchantWall();
		mapSite.addDoor();
		mapSite.enchantDoor();
		
		return mapSite;
	}
	
	
	protected abstract MapSite createMaze(String type);

}
