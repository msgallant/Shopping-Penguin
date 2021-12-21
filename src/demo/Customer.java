package demo;
//This class keeps tracks of the customer's info and products they want to buy
//and what type of shipping they need.
import java.util.ArrayList;

import product.Product;

import shippingStrategies.ShippingContext;

public class Customer {

	private int customerID;
	private static ArrayList<Product> shoppingCart = new ArrayList<Product>();
	private static ShippingContext location;
	public Customer(int id, ShippingContext s)
	{
		customerID = id;
		location = s;
	}
	public void addItem(Product item)
	{
		shoppingCart.add(item);
	}
	
	public void removeItem(Product item)
	{
		shoppingCart.remove(item);
	}
	public ArrayList<Product> getAllItems()
	{
		return shoppingCart;
	}
	public ShippingContext getShippingContext()
	{
		return location;
	}
	public int getCustomerID()
	{
		return customerID;
	}
	
	//this method prints out what class the object belongs to
		//in the shopping cart, so, we can test what items
		//were purchased. It calculates them in batches,
		//so, if you bought multiple nemo lollipops,
		//then bought other things, then bought more nemo
		//then it would print them out separately.
		public static void printCheckOutList()
		{
			Class<? extends Product> c = shoppingCart.get(0).getClass();
			int amount = 0 ;
			for (int i =0; i < shoppingCart.size() ; i++)
			{
				if (c != shoppingCart.get(i).getClass())
				{
					System.out.println(amount + " " + c);
					amount = 1;
					c = shoppingCart.get(i).getClass();
				}
				else
				{
					amount += 1;
				}
				
			}
			//printing out last batch of items
			System.out.println(amount + " " + c);
		}
		
		//calculates how much money the customer should be charged
		public static int calculateTotalCost()
		{
			int totalPrice = 0;
			for (int i =0; i < shoppingCart.size(); i++)
			{
				totalPrice += shoppingCart.get(i).calculateCost(); //calculate cost of all items
			}
			
			totalPrice += location.calculateCost(); //calculate cost for shipping to a certain country
			//Antarctic costs $2 for shipping, Canada $3, Australia $4, France $5
			return totalPrice;
		}
}
