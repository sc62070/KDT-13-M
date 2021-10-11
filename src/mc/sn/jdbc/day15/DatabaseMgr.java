package mc.sn.jdbc.day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseMgr {
	//데이터베이스에 관련된 작업을 함.
	// 컨넥션 생성하는 메소드 만들기
	private Connection makeConnection() {
		// 4개의 정보가 필요함 --> String형으로 정의(선언)해 보세요
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "HR";
		String pwd = "1234";
		//컨넥션 생성하는 2단계 작업
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	//전체조회 메소드 만들기
	public void readAll() throws SQLException {
		Connection con = this.makeConnection();
		//stdTBL에 접속
		String sql = "select * from stdTBL";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			String name = rs.getString(1);
			String addr = rs.getString(2);
			System.out.println(name+","+addr);
		}
		rs.close();
		stmt.close();
		con.close();
	}
	
	public ArrayList<StdData> searchAll() throws SQLException {
		ArrayList<StdData> list = null;
		Connection con = this.makeConnection();
		//stdTBL에 접속
		String sql = "select * from stdTBL";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		list = new ArrayList<StdData>();
		while(rs.next()) {
			String name = rs.getString(1);
			String addr = rs.getString(2);
			list.add(new StdData(name,addr));
		}
		rs.close();
		stmt.close();
		con.close();
		
		return list;
	}
	
	public ArrayList<StdData> searchAllV2() {
		ArrayList<StdData> list = null;
		/* 아래의 정보를 가지고 직접 5개의 데이터를 만들어 리스트에 저장하는 코드
		 *  김범수  ,경남
			성시경  ,서울
			조용필  ,경기
			은지원  ,경북
			바비킴  ,서울
		 */
		list = new ArrayList<StdData>();
		list.add(new StdData("김범수","경남"));
		list.add(new StdData("성시경","서울"));
		list.add(new StdData("조용필","경기"));
		list.add(new StdData("은지원","경북"));
		list.add(new StdData("바비킴","서울"));
		
		return list;
	}
	/*
	 *  File file = new File(filePath);
		FileReader fr = null;
		BufferedReader br = null;
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		String line = null;
		while((line=br.readLine())!=null) {
			String[] temp = line.split(",");
			int sno = Integer.parseInt(temp[0].trim());
			int kor = Integer.parseInt(temp[2].trim());
			int eng = Integer.parseInt(temp[3].trim());
			int math = Integer.parseInt(temp[4].trim());
			int total = Integer.parseInt(temp[7].trim());
			String acc = temp[9];
			String local = temp[10];
			list.add(new ScoreData(sno,kor,eng,math,total,acc,local));	
		}
	 */
	public ArrayList<StdData> readFromFile() throws IOException{
		ArrayList<StdData> list = null;
		//crtl+shfit+O
		// 파일에 연결
		File file = new File("./data/std.csv");
		// 파일 컨텐츠 연결(스트림 연결)
		FileReader fr = null;
		BufferedReader br = null;
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		// 한줄씩 처리
		String line = null;
		list = new ArrayList<StdData>();
		while((line=br.readLine())!=null) {
			String[] temp = line.split(",");
			String name = temp[0];
			String addr = temp[1];
			list.add(new StdData(name,addr));	
		}
		// 파일 컨텐츠 연결 종료(스트림 종료)
		br.close();
		fr.close();
		return list;
	}
	
}
