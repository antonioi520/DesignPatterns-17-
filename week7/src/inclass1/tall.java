package inclass1;

public class tall extends SizeDecorator {
	Beverage beverage;
	
	public tall(){
		size = beverage.getSize();
	}
	
	public String getSize() {
		return beverage.getSize();
	}

	public void setSize(String size) {
		beverage.setSize("tall");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		
	}
	

}
