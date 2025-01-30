package test6.sub07;

public class Clothes extends Product {
	
	private String size;
	

	public Clothes(String productId, String productName, int price, int quantity, String size) {
		super(productId, productName, price, quantity);
		this.size = size;
	}


	@Override
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("의류 사이즈 : " + size);
	}
	
	

}
