package part1;

public class CarBuilder {
	private String carName;
	private String body;
	private String chassis;
	
	private static CarBuilder uniqueInstance;
	private CarBuilder(){
		
	}
	public static CarBuilder getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new CarBuilder();
		}
		return uniqueInstance;
	}
	
	public void setCarName(String carName){
		this.carName = carName;
	}
	public void buildBody(){
		body = "base body";
	}
	public void buildChassis(){
		chassis = "base chassis";
	}
	public void buildCar(){
		System.out.println(carName + " " + body + " " + chassis);
	}
	
	
}
