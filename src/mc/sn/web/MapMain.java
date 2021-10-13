package mc.sn.web;

import java.util.HashMap;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1() 호출 코드 작성
		MapMain map = new MapMain();
		map.test1();

	}
	
	public void test1() {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", new Integer(1));
		map.put("two", 20); //
		map.put("three", 3);
		int size = map.size();
		System.out.println(size);
		Integer val = map.get("two");
		System.out.println(val);
	}

}
