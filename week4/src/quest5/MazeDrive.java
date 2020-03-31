package quest5;

public class MazeDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazeGame enchantedMaze = new EnchantedMazeGame();
		MazeGame normalMaze = new NormalMazeGame();
		
		
		MapSite maze1 = normalMaze.createMaze("room");
		System.out.println("First room is a " + maze1.getRoom());
		maze1 = normalMaze.createMaze("wall");
		System.out.println("It has " + maze1.getWall());
		maze1 = normalMaze.createMaze("door");
		System.out.println("It has a " + maze1.getDoor());
		maze1.addWall();
		maze1.enchantWall();
		
		System.out.println();
		
		MapSite maze2 = enchantedMaze.createMaze("room");
		System.out.println("Second room is an " + maze2.getRoom());
		maze2 = enchantedMaze.createMaze("wall");
		System.out.println("It has " + maze2.getWall());
		maze2 = enchantedMaze.createMaze("door");
		System.out.println("It has an " + maze2.getDoor());
	}

}
