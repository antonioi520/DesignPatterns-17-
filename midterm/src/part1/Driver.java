package part1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarBuilder cb = CarBuilder.getInstance();
		cb.buildBody();
		cb.buildChassis();
		System.out.println("cb object memory address = " + cb.toString());
		
		CarBuilder cb2 = CarBuilder.getInstance();
		System.out.println("cb2 object memory address = " + cb2.toString());
		
		CarBuilder cb3 = CarBuilder.getInstance();
		System.out.println("cb3 object memory address = " + cb3.toString());
	}

}
