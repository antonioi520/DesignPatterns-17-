package inclass4;

import java.util.ArrayList;

public class Waitress2 {
	PancakeHouseMenu2 pancakeHouseMenu;	
	DinerMenu2 dinerMenu;
	
	public Waitress2(PancakeHouseMenu2 pancakeHouseMenu, DinerMenu2 dinerMenu){
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	void printMenu(){
		//print menu now creates the iterator for each menu
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("MENU\n----\nLUNCH");
		printMenu(dinerIterator);
	}
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + " ");
			System.out.print(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
}
