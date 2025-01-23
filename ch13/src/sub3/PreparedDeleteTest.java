package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDeleteTest {
	
	public static void main(String[] args) {
		
		//DB 정보
		
		String host = "jdbc:mysql://localhost:3306/studydb";
		String user = "root";
		String pass = "1234";
				
		try {
					
					
			//1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
					
			//2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
					
			//3단계
			String sql = "DELETE FROM `user1` where `uid` = ?";
					
				 	
				 	   
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			System.out.println(psmt);
					
			//4단계 - SQL 실행
			psmt.executeUpdate();
					
			//5단계
			//6단계
					
			conn.close();
			psmt.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("Update 완료...");
	}

}
