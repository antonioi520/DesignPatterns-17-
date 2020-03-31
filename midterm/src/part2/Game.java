package part2;

public abstract class Game {
	double price;
	double units;
	double tax;
	static double revenue;
	TaxBehavior taxBehavior;
	
	public Game(){
		
	}
	
	public void setTaxBehavior(TaxBehavior tb){
		taxBehavior = tb;
	}
	
	public void calculate(){
		tax = taxBehavior.tax() / 100;
		revenue += (price + (price * tax)) * units;
	}
	public double getRevenue(){
		return revenue;
	}
	
}
