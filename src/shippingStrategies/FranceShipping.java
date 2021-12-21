package shippingStrategies;
//this a apart of a design pattern, strategy.
//it is a concrete strategy.
//it ships to France and calculates to cost to ship there.
public class FranceShipping implements Shipping{
	@Override
	public void ship() {
		System.out.println("Shipped to France");
		
	}
	
	public int calculateCost()
	{
		return 5;
	}
}
