package inclass1;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ", Soy";
	}
	public String getSize(){
		return beverage.getSize();
	}
	public void setSize(String size){
		beverage.setSize(size);
	}
	public double cost(){
		if(beverage.getSize().equals("tall")){
			return .10 + beverage.cost();
		}
		if(beverage.getSize().equals("grande")){
			return .15 + beverage.cost();
		}
		if(beverage.getSize().equals("venti")){
			return .20 + beverage.cost();
		}
		else return 0;
	}
}
