package inclass1;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ", Whip";
	}
	
	public String getSize(){
		return beverage.getSize();
	}
	public void setSize(String size){
		beverage.setSize(size);
	}
	public double cost(){
		if(beverage.getSize().equals("tall")){
			return .5 + beverage.cost();
		}
		if(beverage.getSize().equals("grande")){
			return .10 + beverage.cost();
		}
		if(beverage.getSize().equals("venti")){
			return .15 + beverage.cost();
		}
		else return 0;
	}
}
