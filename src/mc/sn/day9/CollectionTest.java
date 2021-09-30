package mc.sn.day9;

import java.util.ArrayList;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest ct = new CollectionTest();
		ct.test1();
	}
	//see-know-understand-(   )-do it
	public void test2() {
		ArrayList list =new ArrayList();
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.set(1, 30);
		list.add("three");
		int size = list.size();
		System.out.println(size);
		list.remove(2);
		for(int i=0;i<list.size();i++) {
			Integer temp = (Integer)list.get(i);
			int val = temp.intValue();
			System.out.println(val);
		}
	}
	
	public void test1() {
		//컬렉션의 정의는 무엇입니까? -> 데이터를 집합으로 다룬다.
		//--> 하나의 변수로 여러개의 데이터를 CRUD한다.
		// 자바에서 컬렉션의 3가지 종류는 무엇입니까?
		//--> 1. List--> 순서 읶소 중복있다.
		//Map --> 순서없고,중복있다. --> key(이름)
		//Set -->순서없고, 중복없다. --> Iterator
		//3가지 종류를 설명하세요
		//1. 순서 2. 중복
		
	}

}
