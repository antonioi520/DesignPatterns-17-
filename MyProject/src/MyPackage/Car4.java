package MyPackage;

public class Car4 {
	
	String color;
	Tire firestone = new Tire();
	
	public String getColor(){
		return color;
	}
	public void setColor(String newColor){
		color = newColor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 nsx = new Car4();
		nsx.setColor("pink");
		nsx.firestone.setDiameter(17);
		System.out.println("Color = " + nsx.getColor());
		System.out.println("Diameter = " + nsx.firestone.getDiameter());
	}

}
