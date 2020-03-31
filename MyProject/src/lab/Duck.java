package lab;

import java.util.Scanner;

public class Duck {
	
	//variables
	int legs;
	int eyes;
	int wingspan;
	String color;

	//getters and setters
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//methods
	public void fly(){
		System.out.println("the duck is flying with a wingspan of " + this.getWingspan() + " feet");
	}
	
	public void display(){
		System.out.println("the duck is " + this.getColor());
		System.out.println("the duck has " + this.getEyes() + " eyes");
		System.out.println("the duck has " + this.getLegs() + " legs");
		System.out.println("the duck's wingspan is " + this.getWingspan() + " feet");
	}
	
	public void quack(){
		System.out.println("quack quack");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new Duck();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("how many eyes does the duck have?");
		int inputEyes = keyboard.nextInt();
		System.out.println("how many legs does the duck have?");
		int inputLegs = keyboard.nextInt();
		System.out.println("what color is the duck?");
		String inputColor = keyboard.next();
		System.out.println("what is the duck's wingspan in feet?");
		int inputWingspan = keyboard.nextInt();
		
		duck.setEyes(inputEyes);
		duck.setLegs(inputLegs);
		duck.setColor(inputColor);
		duck.setWingspan(inputWingspan);
		
		duck.display();
		duck.quack();
		duck.fly();
	}

}
