package MyPackage;

public class Car3 extends Vehicle3 {
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("drive in road");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 camry = new Car3();
		camry.drive();
		camry.lightsOn();
		
		
	}

	

}
