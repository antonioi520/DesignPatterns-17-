package MyPackage;

public class Airplane implements IVehicle {
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("drive in air");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane dc10 = new Airplane();
		dc10.drive();
	}

	

}
