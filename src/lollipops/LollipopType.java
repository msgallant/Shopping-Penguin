package lollipops;
//list of types of the product: lollipop customer can buy
public enum LollipopType {
	NEMO, BLINKY, CLEO;
	
	  @Override
	  public String toString() {
	    return this.name().toLowerCase();
	  }
}
