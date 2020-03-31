package quest3;


abstract class PromoKitBuilder {
	PromoKit promoKit;
	
	public PromoKit getPromoKit(){
		return promoKit;
	}
	
	public void buildPromoKit(){
		promoKit = new PromoKit();
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
