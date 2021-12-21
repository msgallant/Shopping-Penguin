package musicalSlippers;
//types of product: musical slippers the customer can buy
public enum MusicalSlippersType {
	BOOGIE_WONDERLAND, SOMEBODY_TO_LOVE;
	
	  @Override
	  public String toString() {
	    return this.name().toLowerCase();
	  }
}
