package shippingStrategies;
//this a apart of a design pattern, strategy.
//it is a concrete strategy.
//it ships to Canada and calculates to cost to ship there.
public class CanadaShipping implements Shipping {

	@Override
	public void ship() {
		System.out.println("Shipped to Canada");
		
	}

	public int calculateCost()
	{
		return 3;
	}
}
