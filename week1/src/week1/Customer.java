package week1;

public class Customer {

	//member variables
	int id;
	String name;
	
	//member methods
	public int getId(){
		return id;
	}
	public void setId(int temp){
		id = temp;
	}
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	
	
	//DRIVER
	public static void main(String[] args) {
		Customer mary = new Customer();
		mary.setId(101);
		mary.setName("Mary");
		System.out.println("Hello, I am " + mary.getName() + ". My ID is " + mary.getId());
		
	}

}
