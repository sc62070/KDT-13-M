package mc.sn.day4;

public class CodeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PracticeCode Ÿ���� �ν��Ͻ��� ������ pc��� �̸��� ������ �Ҵ��Ѵ�.
		PracticeCode pc = new PracticeCode();
		pc.testArray2();
		
	}
		

	public void test() {
		// PracticeCode Ÿ���� �ν��Ͻ��� ������ pc��� �̸��� ������ �Ҵ��Ѵ�.
		PracticeCode pc = new PracticeCode();
		//2~10���� �Ҽ����θ� �Ǻ��Ͽ� ����ϴ� �ڵ� �ۼ��ϼ���
		//�׸��� �Ҽ��� ���� ����Ͻÿ�
		// �Ҽ� ���� ���� ���� �� �ʱ�ȭ
		int sum = 0;
		// ���� 2 ~ 10 ������ ������ �Ҽ��� �Ǻ��Ͽ� ����ϰ� �հ踦 ������Ų��.
		for(int i=0;i<9;i++) {
			//�ݺ����� �̿��Ͽ� 2~10������ ���� �ڵ����� �����ϱ�
			int number = i + 2; 
			//System.out.println(number);
			// �Ҽ��Ǻ� �޼ҵ带 �̿��Ͽ� �Ҽ����� Ȯ���ϱ�
			boolean flag = pc.isPrimeNumber(number);
			// �Ҽ� ���ο� ���� ���� �� �ش� ���� ����ϱ�
			if(flag) {
				sum = sum + number; //sum�� ���� number�� �����ض�
				System.out.println(number+"�� �Ҽ�");
			} else {
				System.out.println(number+"�� �Ҽ��� �ƴ�");
			}
		}
		// �Ҽ� ���� �հ踦 ����Ѵ�.
		System.out.println("sum is "+sum);
				
	}
}
