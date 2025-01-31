package dao;

import java.util.List;

import db.DBHelper;
import entity.Order;

public class OrderDAO extends DBHelper {

	private static final OrderDAO INSTANCE = new OrderDAO();
	public static OrderDAO getInstance() {
		return INSTANCE;
	}
	
	private OrderDAO() {}

	public void insertOrder(Order order) {
		
		
	}
	
	public Order selectOrder(int orderNo) {
		return null;
	}

	public List<Order> selectOrders() {
		return null;
	}
	
	public void updateOrder(Order order) {
		
	}
	
	public void deleteOrder(int orderNo) {
		
	}
	
	

}
