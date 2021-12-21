package musicalSlippers;
//type of musical slippers customers can buy

public class SomebodyToLoveMusicalSlippers extends MusicalSlippers
{

	public SomebodyToLoveMusicalSlippers()
	{
		super.setMusicalSlippersType(MusicalSlippersType.SOMEBODY_TO_LOVE);
	}
	@Override
	public int calculateCost() {
		//random choosen cost
		return 65;
	}

}
