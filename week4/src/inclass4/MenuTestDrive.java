package inclass4;

public class MenuTestDrive {
	public static void main(String[] args){
		DinerMenu2 dinerMenu = new DinerMenu2();
		//other menus here
		PancakeHouseMenu2 pancakeHouseMenu = new PancakeHouseMenu2();
		//pass menus to the waitress
		Waitress2 alice = new Waitress2(pancakeHouseMenu, dinerMenu);
		alice.printMenu();
		

	}
}
