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
		//�÷����� ���Ǵ� �����Դϱ�? -> �����͸� �������� �ٷ��.
		//--> �ϳ��� ������ �������� �����͸� CRUD�Ѵ�.
		// �ڹٿ��� �÷����� 3���� ������ �����Դϱ�?
		//--> 1. List--> ���� �ڼ� �ߺ��ִ�.
		//Map --> ��������,�ߺ��ִ�. --> key(�̸�)
		//Set -->��������, �ߺ�����. --> Iterator
		//3���� ������ �����ϼ���
		//1. ���� 2. �ߺ�
		
	}

}
