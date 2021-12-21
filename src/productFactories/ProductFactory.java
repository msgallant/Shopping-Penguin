package productFactories;
//all factories are creating a product, so, they all must have this method
import product.Product;

public interface ProductFactory {

	public Product createProduct(String type);
}
