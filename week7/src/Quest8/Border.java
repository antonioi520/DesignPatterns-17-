package Quest8;

public class Border extends BorderWindowDecorator{
	Window window;
	
	public Border(Window window){
		this.window = window;
	}
	public String getDescription() {
		return window.getDescription() + ", bordered";
	}

}
