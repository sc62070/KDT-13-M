package mc.sn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//makeConnection 호출
		DatabaseTest dt = new DatabaseTest();
		try {
			dt.insertData();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void testConnection() {
		Connection con = null;
		try {
			con = this.makeConnection();
			if(con!=null) {
				System.out.println("connected");
			} else {
				System.out.println("not connected");
			}
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void insertDataFromFile() {
			//1.파일에서 한라인 읽어서 데이터베이스에 삽입 --> 반복
			
			//2.파일에서모든 라인을 읽어서 정리하고 한번에 데이터베이스 삽입 --> 좋은 방법
		}
	}
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "HR";
		String pwd = "1234";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pwd);
		return con;
	}
	
	public void insertData() throws ClassNotFoundException, SQLException {
		//StudentTBL에 Abc1115.csv파일안의 데이터를 삽입
		String sql = "INSERT INTO studentTBL "
				+ "VALUES(990001,'addx', 17, 29, 16, 49, 43,154,'C','A','C')";
		Connection con = this.makeConnection();
		Statement stmt = con.createStatement();
		int affectedCount = stmt.executeUpdate(sql);
		if(affectedCount>0) {
			System.out.println("삽입 작업이 완료되었습니다.");
		}
		stmt.close();
		con.close();
	}

}





