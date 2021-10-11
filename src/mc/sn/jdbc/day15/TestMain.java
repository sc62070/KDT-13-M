package mc.sn.jdbc.day15;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMain tm = new TestMain();
		tm.test4();
	}
	
	public void test() {
		//학생테이블에 접속해서 모든 레코드(학생정보)를 조회해서 출력
		//DatabaseMgr객체 이용해서 위의 요구사항을 해결하시오
		DatabaseMgr mgr = new DatabaseMgr();
		try {
			mgr.readAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void test2() {
		// selectAll메소드를 만들고 해당 메소드에서 레코드의 데이터를 리턴한 것을
		// 받아 test2메소드에서 출력한다.
		DatabaseMgr mgr = new DatabaseMgr();
		try {
			ArrayList<StdData> list = mgr.searchAll();
			for(StdData data : list) {
				System.out.println(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void test3() {
		
		DatabaseMgr mgr = new DatabaseMgr();
		
		ArrayList<StdData> list = mgr.searchAllV2();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
				
	}
	
	public void test4() {
		DatabaseMgr mgr = new DatabaseMgr();
		try {
			ArrayList<StdData> list = mgr.readFromFile();
			for(StdData data : list) {
				System.out.println(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
