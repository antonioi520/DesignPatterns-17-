package Quest8;

public class WindowDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window window1 = new SimpleWindow();
		System.out.println(window1.getDescription());
		
		Window window2 = new SimpleWindow();
		window2 = new HorizontalScrollbar(window2);
		System.out.println(window2.getDescription());
		
		Window window3 = new SimpleWindow();
		window3 = new VerticleScrollbar(window3);
		window3 = new Border(window3);
		System.out.println(window3.getDescription());
	}

}
