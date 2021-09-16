package mc.sn.day4;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Review pm = new Review();
		pm.test();
		pm.add(1,2);
	}
	
	public void test() {
		System.out.println("Hello");
	}
	
	public void add(int val1, int val2) {
		int a = val1;
		int b = val2;
		
		System.out.println(a+b);
	}

}
