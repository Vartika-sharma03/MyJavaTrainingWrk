package CalculatorService;

public class ProductPojo {
      private String productname;
      private int quantity;
      private int price;
      public ProductPojo(String name,int a,int b)
      {
    	  this.price=a;
    	  this.productname=name;
    	  this.quantity=b;
      }
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
