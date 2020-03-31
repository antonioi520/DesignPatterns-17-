package part2;

public class GameCalculateDriver {
	public static void main (String[] args){
		Game hp = new HarryPotter();
		hp.setTaxBehavior(new Alabama());
		hp.calculate();
		hp.setTaxBehavior(new Alaska());
		hp.calculate();
		hp.setTaxBehavior(new Arizona());
		hp.calculate();
		hp.setTaxBehavior(new Arkansas());
		hp.calculate();
		hp.setTaxBehavior(new California());
		hp.calculate();
		hp.setTaxBehavior(new Colorado());
		hp.calculate();
		hp.setTaxBehavior(new Connecticut());
		hp.calculate();
		
		System.out.println("Total Revenue: $" + hp.getRevenue());
		
	}
}
