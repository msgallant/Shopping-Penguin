package musicalSlippers;
//type of product the customer can buy
import product.ShoppingPenguinBrand;

public abstract class MusicalSlippers extends ShoppingPenguinBrand{
	/*MusicalSlippers() {
		super();
	}*/
	private MusicalSlippersType type;
	
	public abstract int calculateCost();
	
	public void setMusicalSlippersType(MusicalSlippersType m)
	{
		type = m;
	}
	public MusicalSlippersType getMusicalSlippersType()
	{
		return type;
	}
}
