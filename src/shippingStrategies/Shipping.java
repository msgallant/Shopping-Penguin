package shippingStrategies;
//Interface for shipping, this is apart of the strategy design pattern.
//I picked it because there must be different versions of the
//only difference between each subclass of shipping is their behaviour
//of the method ship() and calculateCost. All different places to ship to have their own
//subclass to keep the Single responsibility principle, so, each class
//has the responsibility of shipping to 1 place.
public interface Shipping {
	public void ship();
	public int calculateCost();
}
