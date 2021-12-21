//Marcia Gallant
//This class tests my program. It does so buy adding some products to a customers shopping cart. 
//You can also set what shipping the customer needs
package demo;


import lollipops.LollipopType;
import musicalSlippers.MusicalSlippersType;
import product.Product;
import productFactories.LollipopFactory;
import productFactories.MusicalSlippersFactory;
import productFactories.ProductFactory;
import shippingStrategies.AntarcticShipping;
import shippingStrategies.ShippingContext;


public class Demo 
{
	
	public static void main(String[] args)
	{
		//test #1, tests random positive numbers
		int numNemoLol = 4;
		int numBlinkyLol = 7;
		int numCleoLol = 6;
		int numBoogie = 1;
		int numSomebodyToLove = 2;
		
		//test #2, tests a negative number for lollipops
		/*
		int numNemoLol = 4;
		int numBlinkyLol = 7;
		int numCleoLol = -6;
		int numBoogie = 1;
		int numSomebodyToLove = 2;*/
		
		//test #3, tests negative number for slippers
		/*int numNemoLol = 2;
		int numBlinkyLol = 2;
		int numCleoLol = 3;
		int numBoogie = -1;
		int numSomebodyToLove = -2;*/

		//test #4, tests only slippers
		/*int numNemoLol = 0;
		int numBlinkyLol = 0;
		int numCleoLol = 0;
		int numBoogie = 4;
		int numSomebodyToLove = 1;*/
		
		//test #5, tests only lollipops
		/*int numNemoLol = 3;
		int numBlinkyLol = 16;
		int numCleoLol = 30;
		int numBoogie = 0;
		int numSomebodyToLove = 0;*/
		

		//test shipping to different places
		//each shipping location has a different cost
		//Antarctic costs $2 for shipping, Canada $3, Australia $4, France $5
		ShippingContext context;
		context = new ShippingContext(new AntarcticShipping());
		//context = new ShippingContext(new AustraliaShipping());
		//context = new ShippingContext(new CanadaShipping());
		//context = new ShippingContext(new FranceShipping());
		Customer c = new Customer(143, context);
		
		int expectedCost = 0;
		
		expectedCost = checkCost(expectedCost, numNemoLol*3);
		expectedCost = checkCost(expectedCost,numBlinkyLol*2);
		expectedCost = checkCost(expectedCost,numCleoLol*1);
		expectedCost = checkCost(expectedCost,numBoogie*55);
		expectedCost = checkCost(expectedCost,numSomebodyToLove*65);
		
		

		
		
		addLollipops(LollipopType.NEMO, numNemoLol, c); //Nemo lollipops cost $3
		addLollipops(LollipopType.BLINKY, numBlinkyLol, c); //Blinky costs $2
		addLollipops(LollipopType.CLEO, numCleoLol, c); //Cleo costs $1
		
		
		addMusicalSlippers(MusicalSlippersType.BOOGIE_WONDERLAND, numBoogie, c); //boogie slippers cost $55
		
		addMusicalSlippers(MusicalSlippersType.SOMEBODY_TO_LOVE, numSomebodyToLove, c); //somebody to love slippers cost 65
		ShippingContext location = c.getShippingContext();
		
		
		expectedCost += location.calculateCost(); 
		
		System.out.println("customer ID: " + c.getCustomerID());
		System.out.println("shipping cost: " + location.calculateCost());
		
		System.out.println("expected total cost was: " + expectedCost + "; actual total price: " + c.calculateTotalCost());
		//System.out.println("");
		System.out.println("items in cart: ");
		
		c.printCheckOutList();
		location.executeShipping();
		
	}
	
	//this is a helper method for my tests, if someone enters a negative number of lollipops
	//then the expected cost shouldn't increase or be multiplied by negative numbers.
	public static int checkCost(int oldCost, int newCost)
	{
		if (newCost > 0)
		{
			return oldCost + newCost;
		}
		return oldCost;
	}
	//add lollipops to shopping cart
	public static void addLollipops(LollipopType t, int amount, Customer c)
	{
		LollipopFactory lollipopFact = new LollipopFactory();
		addProduct(lollipopFact, t.toString(), amount, c);

	}
	//add musical slippers to shopping cart
	public static void addMusicalSlippers(MusicalSlippersType t, int amount, Customer c)
	{
		MusicalSlippersFactory msFact = new MusicalSlippersFactory();
		addProduct(msFact, t.toString(), amount, c);

	}
	
	//add product to cart
	public static void addProduct(ProductFactory fact, String productName, int amount, Customer c)
	{
		Product p = fact.createProduct(productName);
		addToShoppingCart(p, productName, amount, c);
		
	}
	//adds the product(s) to the customer's shopping cart
	public static void addToShoppingCart(Product p, String productName, int amount, Customer c)
	{
		for (int i =0; i< amount; i++)
		{
			if (p != null)
			{
				c.addItem(p);
			}
			else
			{
				System.out.println("Error: Invalid product: " + productName);
			}
		}
	}

}
