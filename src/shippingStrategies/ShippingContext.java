package shippingStrategies;
//this is apart of a design pattern, strategy.
//you can setShippingStrategy to a different one, in case a customer moves
public class ShippingContext {
	private Shipping location;
	
	public ShippingContext(Shipping s)
	{
		location = s;
	}
	public void executeShipping()
	{
		location.ship();
	}
	
	public void setShippingStrategy(Shipping s)
	{
		location = s;
	}
	
	public int calculateCost()
	{
		return location.calculateCost();
	}
}
