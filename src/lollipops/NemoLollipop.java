package lollipops;
//type of lollipop customers can buy

public class NemoLollipop extends Lollipop{

	public NemoLollipop()
	{
		super.setLollipopType(LollipopType.NEMO);
	}
	
	public int calculateCost() {
		// Random choosen cost of buying nemo lollipops is $3
		return 3;
	}



}
