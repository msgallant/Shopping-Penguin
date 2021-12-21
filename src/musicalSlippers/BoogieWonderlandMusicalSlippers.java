package musicalSlippers;
//type of musical slippers customers can buy
public class BoogieWonderlandMusicalSlippers extends MusicalSlippers{

	public BoogieWonderlandMusicalSlippers()
	{
		super.setMusicalSlippersType(MusicalSlippersType.BOOGIE_WONDERLAND);
	}
	@Override
	public int calculateCost() {
		//random choosen cost
		return 55;
	}

}
