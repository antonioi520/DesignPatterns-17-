package inclass3;

public class PizzaTestDrive {
	public static void main(String[] args){
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoStore();
		PizzaStore californiaStore = new CaliforniaPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("First customer ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Second customer ordered a " + pizza.getName() + "\n");
		
		pizza = californiaStore.orderPizza("cheese");
		System.out.println("Third customer ordered a " + pizza.getName() + "\n");
	}
}
