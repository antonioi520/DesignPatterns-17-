package MyPackage;

public class Car2 implements IVehicle{
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("drive in land");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 camry = new Car2();
		camry.drive();
		
	}

	

}
