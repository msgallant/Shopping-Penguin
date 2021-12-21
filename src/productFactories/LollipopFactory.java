package productFactories;
//This is a design pattern, factory, it has the responsibility of
//creating all the different types of lollipops.
import lollipops.BlinkyLollipop;
import lollipops.CleoLollipop;
import lollipops.Lollipop;
import lollipops.LollipopType;
import lollipops.NemoLollipop;

public class LollipopFactory implements ProductFactory{

	public Lollipop createProduct(String type)
	{
		if (type.equals(LollipopType.NEMO.toString()) )
		{
			return new NemoLollipop();
		}
		else if (type.equals(LollipopType.BLINKY.toString()))
		{
			return new BlinkyLollipop();
		}
		else if (type.equals(LollipopType.CLEO.toString()))
		{
			return new CleoLollipop();
		}
		return null;
	}
}
