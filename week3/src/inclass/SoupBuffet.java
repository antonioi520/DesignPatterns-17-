package inclass;
//The product - this is what will be built
public class SoupBuffet {
	String soupBuffetName;
	
	ChickenSoup chickenSoup;
	ClamChowder clamChowder;
	FishChowder fishChowder;
	Minnestrone minnestrone;
	Pastafazul pastafazul;
	TofuSoup tofuSoup;
	VegetableSoup vegetableSoup;
	
	public String getSoupBuffetName(){
		return soupBuffetName;
	}
	
	public String getTodaysSoups(){
		StringBuffer stringofSoups = new StringBuffer();
		stringofSoups.append(" Today's Soups! ");
		stringofSoups.append(" Chicken Soup: ");
		stringofSoups.append(this.chickenSoup.getSoupName());
		stringofSoups.append(" Clam Chowder: ");
		stringofSoups.append(this.clamChowder.getSoupName());
		stringofSoups.append(" Fish Chowder: ");
		stringofSoups.append(this.fishChowder.getSoupName());
		stringofSoups.append(" Minnestrone: ");
		stringofSoups.append(this.minnestrone.getSoupName());
		stringofSoups.append(" Pasta fazul: ");
		stringofSoups.append(this.pastafazul.getSoupName());
		stringofSoups.append(" Tofu Soup: ");
		stringofSoups.append(this.tofuSoup.getSoupName());
		stringofSoups.append(" Vegetable Soup: ");
		stringofSoups.append(this.vegetableSoup.getSoupName());
		return stringofSoups.toString();
	}
}
