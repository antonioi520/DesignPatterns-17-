package Quest8;

public class VerticleScrollbar extends Window {
	Window window;
	
	public VerticleScrollbar(Window window){
		this.window = window;
	}
	
	public String getDescription() {
		return window.getDescription() + ", verticle scroll bar";
	}
}
