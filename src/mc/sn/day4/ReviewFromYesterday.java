package mc.sn.day4;

public class ReviewFromYesterday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewFromYesterday pm = new ReviewFromYesterday();
		pm.test();
		int result = pm.add(1,2);
		System.out.println(result);
	}
	
	public void test() {
		System.out.println("Hello");
	}
	
	//my work
	//public void add(int val1, int val2) {
		//int a = val1;
		//int b = val2;
		//System.out.println(a+b);
		
	public int add(int val1, int val2) {	
		int result = 0; //�������� ���
		result = val1 +val2;
		return result;
		//return 0;//��ü������ ���α׷����� �Ҷ� �ߺ�����, �������Ŵ� �ʼ�.
	}

}
