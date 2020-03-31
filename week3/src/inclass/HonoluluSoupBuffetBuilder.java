package inclass;
//Concrete builder
public class HonoluluSoupBuffetBuilder extends SoupBuffetBuilder {
	public void buildClamChowder() {soupBuffet.clamChowder = new HonoluluClamChowder();}
	public void buildFishChowder() {soupBuffet.fishChowder = new HonoluluFishChowder();}
	
	public void setSoupBuffetName() {soupBuffet.soupBuffetName = "Honolulu Soup Buffet";}
}
