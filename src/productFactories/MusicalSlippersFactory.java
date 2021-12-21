package productFactories;
//This is a design pattern, factory, it has the responsibility of
//creating all the different types of musical slippers.
import musicalSlippers.BoogieWonderlandMusicalSlippers;
import musicalSlippers.MusicalSlippers;
import musicalSlippers.MusicalSlippersType;
import musicalSlippers.SomebodyToLoveMusicalSlippers;

public class MusicalSlippersFactory implements ProductFactory {

	public MusicalSlippers createProduct(String type)
	{
		if (type.equals(MusicalSlippersType.BOOGIE_WONDERLAND.toString()))
		{
			return new BoogieWonderlandMusicalSlippers();
		}
		else if (type.equals(MusicalSlippersType.SOMEBODY_TO_LOVE.toString()))
		{
			return new SomebodyToLoveMusicalSlippers();
		}
		return null;
		
	}
}
