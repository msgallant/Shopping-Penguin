package shippingStrategies;
//this a apart of a design pattern, strategy.
//it is a concrete strategy.
//it ships to Australia and calculates to cost to ship there.
public class AustraliaShipping implements Shipping {
	@Override
	public void ship() 
	{
		System.out.println("Shipped to Australia");
		
	}
	
	public int calculateCost()
	{
		return 4;
	}
}
