package quest3;

public class WomenPromoKitBuilder extends PromoKitBuilder {
	public PromoKit getPromoKit(){
		return promoKit;
	}
	
	public void buildVideoPart(){
		promoKit.video = new Video();
	}
	
	public void buildGarment(){
		promoKit.garment = new Garment();
	}
	
	public void buildBook(){
		promoKit.book = new Book();
	}
}
