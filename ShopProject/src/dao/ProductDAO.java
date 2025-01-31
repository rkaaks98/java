package dao;

import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import entity.Product;

public class ProductDAO extends DBHelper {
	
	private static final ProductDAO INSTANCE = new ProductDAO();
	public static ProductDAO getInstance() {
		return INSTANCE;
	}
	private ProductDAO() {}
	
	public void insertProduct(Product product) {
		
	}
	
	public Product selectProduct(int prodNo) {
		return null;
		
	}
	
	public List<Product> selectProducts() {
		List<Product> products = new ArrayList<Product>();
		return products;
	}
	
	public void updateProduct(Product product) {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void deleteProduct(int prodNo) {
		
	}
	
	
	

}












