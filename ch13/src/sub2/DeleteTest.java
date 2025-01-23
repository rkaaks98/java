package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/01/23
 * 이름 : 김준서
 * 내용 : Java Delete 실습하기
 */

public class DeleteTest {
	
	public static void main(String[] args) {
		
		//DB정보
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		
		try {
			
			// 1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3단계
			Statement stmt = conn. createStatement();
			
			// 4단계
			String sql = "DELETE FROM `user1` WHERE `uid` = 'j101'";
						stmt.executeUpdate(sql);
			
			// 5단계
			
			// 6단계
			conn.close();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료...");
	}

}
