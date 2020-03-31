package MyPackage;

public class Monster {

	//variables
	String m_name;
	int m_age;
	
	//methods
	public String getName() {
		return m_name;
	}

	public void setName(String newName) {
		this.m_name = newName;
	}

	public int getAge() {
		return m_age;
	}

	public void setAge(int newAge) {
		this.m_age = newAge;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster leviathon = new Monster();
		leviathon.setAge(150);
		leviathon.setName("leviathon");
		System.out.println("The monster's name is " + leviathon.getName());
		System.out.println("The monster's age is " + leviathon.getAge());
		
	}

	

}
