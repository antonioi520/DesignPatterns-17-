package inclass3;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza(){
		name = "Chicago Style Deep Dish Veggie Pizza";
		dough = "Extra Thich Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
}
