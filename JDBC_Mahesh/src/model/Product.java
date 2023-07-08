package model;

public class Product {
	private int productId;
	private String productname;
	private int minSellQuantity;
	private int price;
	private int quantity;
	
	public int getProductId() 
	{
		return productId;
	}
	public void setProduct(int productId)
	{
		this.productId=productId;
	}
	public String getProductName() 
	{
		return productname;
	}
	public void setProductName(String productName)
	{
		this.productname=productName;
	}
	public int getMinsellQuantity()
	{
		return minSellQuantity;
	}
	public void setMinsellQuantity(int minSellQuantity)
	{
		this.minSellQuantity = minSellQuantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getQuantity( ) {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
}
