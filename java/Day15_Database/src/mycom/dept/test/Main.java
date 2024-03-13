package mycom.dept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			// ojdbc6.jar(꼭 추가 해야함! ) -> oracle.jdbc.driver.OracleDriver
			
			// 1. dirver연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 계정 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. query 준비
			String sql = " SELECT * FROM EMP ";
			stmt = conn.createStatement();
			
			// 4. query 실행 및 리턴
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.printf("%5d %11s %9s %5d %10s %8.2f %8.2f %2d \n",
						rs.getInt(1), rs.getString(2), rs.getString("JOB"), rs.getInt(4), 
						rs.getDate(5), rs.getDouble("SAL"), rs.getDouble(7), rs.getInt(8));
			}
			
			System.out.println("--DB종료--");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 5. db종료
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
		
	}//main
}
