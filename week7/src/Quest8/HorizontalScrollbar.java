package Quest8;

public class HorizontalScrollbar extends ScrollingWindowDecorator {
	Window window;
	
	public HorizontalScrollbar(Window window){
		this.window = window;
	}
	
	public String getDescription() {
		return window.getDescription() + ", horizontal scroll bar";
	}

}
