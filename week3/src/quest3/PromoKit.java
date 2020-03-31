package quest3;

public class PromoKit {
	
	
	Video video;
	Book book;
	Garment garment;
	
	
	public String getPromoKitSpecs(){
		StringBuffer kitSpecs = new StringBuffer();
		kitSpecs.append(" Promo Kit: ");
		kitSpecs.append(this.video.getID() + ", ");
		kitSpecs.append(this.book.getID() + ", ");
		kitSpecs.append(this.garment.getID());
		return kitSpecs.toString();
	}
}
