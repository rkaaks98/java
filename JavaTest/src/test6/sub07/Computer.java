package test6.sub07;

public class Computer extends Product {
	
	
	private String manufactor;
	

	public Computer(String productId, String productName, int price, int quantity, String manufactor) {
		super(productId, productName, price, quantity);
		this.manufactor = manufactor;
	}


	@Override
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("제조사 : " + manufactor);
	}
	
	
}
