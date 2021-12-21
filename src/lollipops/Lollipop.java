package lollipops;
import product.ShoppingPenguinBrand;
//type of product the customer can buy
public abstract class Lollipop extends ShoppingPenguinBrand {
	
	private LollipopType type;
	
	public abstract int calculateCost();
	
	public void setLollipopType(LollipopType l)
	{
		type = l;
	}
	public LollipopType getLollipopType()
	{
		return type;
	}
}
