package part2;

public class California implements TaxBehavior {

	@Override
	public double tax() {
		double tax = 7.25;
		return tax;
	}

}
