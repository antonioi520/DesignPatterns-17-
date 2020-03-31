package inclass1;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ", Mocha";
	}
	
	public String getSize(){
		return beverage.getSize();
	}
	public void setSize(String size){
		beverage.setSize(size);
	}
	public double cost(){
		if(beverage.getSize().equals("tall")){
			return .15 + beverage.cost();
		}
		if(beverage.getSize().equals("grande")){
			return .20 + beverage.cost();
		}
		if(beverage.getSize().equals("venti")){
			return .25 + beverage.cost();
		}
		else return 0;
	}
}
