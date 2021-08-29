package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String prodcutName;
	private int price;

	public Product(String prodcutName, int price) {
		this.prodcutName = prodcutName;
		this.price = price;
	}

	public String getProdcutName() {
		return prodcutName;
	}

	public void setProdcutName(String prodcutName) {
		this.prodcutName = prodcutName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<String> getProductList() {
		List<String> productList = new ArrayList<>();
		productList.add("Apple MacBook Pro");
		productList.add("Apple MacBook Air");
		productList.add("Apple iPhone 12");
		return productList;

	}

}
