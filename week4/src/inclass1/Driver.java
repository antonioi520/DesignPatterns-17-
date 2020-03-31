package inclass1;

public class Driver {
	public static void main(String[] args){
		//Don't need an instance of ClassA to call a static method
		//Call it by the class name because the method is owned by the class and not an object of the class
		ClassA.aStaticMethod();
		
		ClassA objClassA = new ClassA();
		//can now call a non static method off of an object
		objClassA.aNonStaticMethod();
		//can call a static method from an object as well
		objClassA.aStaticMethod();
	}
}
