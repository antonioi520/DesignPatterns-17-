package inclass3;

public class ChicagoStyleClamPizza extends Pizza{
	public ChicagoStyleClamPizza(){
		name = "Chicago Style Deep Dish Clam Pizza";
		dough = "Extra Thich Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
}
