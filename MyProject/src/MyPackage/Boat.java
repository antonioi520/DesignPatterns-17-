package MyPackage;

public class Boat implements IVehicle {
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("drive in water");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boat loveboat = new Boat();
		loveboat.drive();
	}

}
