package shippingStrategies;
//this a apart of a design pattern, strategy.
//it is a concrete strategy.
//it ships to antarctic and calculates to cost to ship there.
public class AntarcticShipping implements Shipping {
	@Override
	public void ship() 
	{
		System.out.println("Shipped to Antarctic");
		
	}
	
	public int calculateCost()
	{
		return 2;
	}

}
