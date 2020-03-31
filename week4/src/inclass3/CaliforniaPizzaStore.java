package inclass3;

public class CaliforniaPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item){
		if(item.equalsIgnoreCase("cheese")){
			return new CaliforniaStyleCheesePizza();
		} else if (item.equalsIgnoreCase("veggie")){
			return new CaliforniaStyleVeggiePizza();		
		} else if (item.equalsIgnoreCase("pepperoni")){
			return new CaliforniaStylePepperoniPizza();
		} else return null;
	}
}

