package inclass1;

public class StarbuzzCoffee {
	public static void main(String args[]){
		Beverage beverage = new Expresso();
		beverage.setSize("grande");
		System.out.println(beverage.getDescription() 
				+ ", " + beverage.getSize() 
				+ " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize("tall");
		beverage2 = new Mocha(beverage2); //wrap it with mocha
		beverage2 = new Mocha(beverage2); //wrap it with a second mocha
		beverage2 = new Whip(beverage2);//wrap it with whip
		System.out.println(beverage2.getDescription() 
				+ ", " + beverage2.getSize() 
				+ " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize("tall");
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()
				+ ", " + beverage3.getSize() 
				+ " $" + beverage3.cost());
	}
}
