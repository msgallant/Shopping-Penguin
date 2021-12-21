package lollipops;
//type of lollipop customers can buy
public class CleoLollipop extends Lollipop {
	public CleoLollipop()
	{
		super.setLollipopType(LollipopType.CLEO);
	}
	
	public int calculateCost() {
		// Random cost of buying Cleo lollipops is $1
		return 1;
	}
}
