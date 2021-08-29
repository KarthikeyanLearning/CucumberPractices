package AmazonImplementation;

public class Search {
	public String displayProduct(Product product) {
		if (product.getProductList().contains(product.getProdcutName())) {
			return product.getProdcutName();
		}
		return null;
	}

}
