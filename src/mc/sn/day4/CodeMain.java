package mc.sn.day4;

public class CodeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeCode pc = new PracticeCode(); //PracticeCode Ŭ������ �̿��Ͽ� ������pc ���� �Ҵ��ض�
		//2~10���� �Ҽ����θ� �Ǻ��Ͽ� ����ϴ� �ڵ� �ۼ��ϼ���
		//�׸��� �Ҽ��� ���� ����Ͻÿ�
		int sum = 0; //Ÿ���� sum �� int�� 0���� �����ߴ�.
		for(int i=0;i<9;i++) {//������ Ÿ���� ���� i�� �ʱⰪ�� 0���� �����ϰ� i�� 9 �̸��� �ɶ����� �ݺ��Ѵ�.
			int number =i+2; //�ݺ����� i��� ������ 2�� ���ؼ� number��� int�� �ο��Ѵ�.
			//System.out.println(number);
			boolean flag =pc.isPrimeNumber(number); //��Ÿ���� ���� flag�� �����ϰ� pc�� ����� �ν��Ͻ��� isPrimeNumber�޼ҵ忡 number �Ķ��Ÿ�� �־��.
			System.out.println(flag);
			
			if(flag) {//���� flag�� true�϶��� false�϶��� ������� ó���ض�.
				sum = sum + number;//sum�� ���� �������Ѷ�
				System.out.println(number+"�� �Ҽ�");
			} else {
				System.out.println(number+"�� �Ҽ��� �ƴ�");
			}
		}	
		System.out.println("sum is "+sum);
	}
}
