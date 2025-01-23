package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1;

public class PrepareSelectTest {
	
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/studydb";
		String name = "root";
		String pass = "1234";
		
		List<User1> users = new ArrayList<User1>();
		
		
		try {
			
			//1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2
			Connection conn = DriverManager.getConnection(host, name, pass);
			
			//3
			String sql =  "SELECT * FROM `user1`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			
			
			//4
			ResultSet rs = psmt.executeQuery();
			
			//5
			while(rs.next()) {
				
				User1 user1 = new User1();
				user1.setUid(rs.getString(1));
				user1.setName(rs.getString(2));
				user1.setHp(rs.getString(3));
				user1.setAge(rs.getInt(4));
				users.add(user1);
			}
			
			//6
			psmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
		for(User1 user : users) {
			System.out.println(user);
		}
		
		System.out.println("SELECT 완료...");
	}

}
