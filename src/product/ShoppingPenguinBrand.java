package product;
//shopping penguin can have has own brand, just in case he wants to allow other brands to sell on his cite
//or if he wants to make a different brand and if he needs to extend the program in the future
//to see how many sales each brand is making, or if he is selling another person's
//brand on his site and he needs to give most of the money to the person who owns the brand
//this feature will be usefull to keep track of how much money each brand is earning
public abstract class ShoppingPenguinBrand implements Product {
	
	private BrandType brand;
	protected ShoppingPenguinBrand()
	{
		brand = BrandType.SHOPPING_PENGUIN;
	}
	
	public abstract int calculateCost();
	
	public BrandType getBrand()
	{
		return brand;
	}
}
