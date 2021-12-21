package lollipops;
//type of lollipop customers can buy
public class BlinkyLollipop extends Lollipop {
	
	public BlinkyLollipop()
	{
		super.setLollipopType(LollipopType.BLINKY);
	}
	
	public int calculateCost() {
		// Random choosen cost of buying blinky lollipops is $2
		return 2;
	}
}
