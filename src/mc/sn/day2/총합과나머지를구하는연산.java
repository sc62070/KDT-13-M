package mc.sn.day2;

public class ���հ������������ϴ¿��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 123456; //653148,....
		//number�� �����ϰ� �ִ� ���� �ڿ��� ���� ���ڸ��� �и��ؼ� ����ϼ���
		//�հ踦 ���ϴ� �ڵ带 �ۼ��Ͻÿ�
		int sum = 0;
		for (int i=0;i<6;i++) {
			//1.�ʱ�ȭ(i=0) > 2.���ǽ� (i<6)> 3.���๮ > 4.������ (i++) >�ٽ� 2~4 �ݺ�
			int splitNumber = number % 10;
			System.out.println(splitNumber);
			number = number / 10;
			//System.out.println(number);
			sum = sum + splitNumber; //����
//�����ȴٴ� �ǹ̴� �����ϴ�. splitNumber�� ���Ƿ� �츮�� sum �� 0���� ���۵ȴٴ°��� �˼� ������, +6, +5, +4.... +1���� ������� sum�� ���Ѵٴ°��� �˼��ִ�.

		}
		System.out.println("\n\n");
		System.out.println(sum);

	}

}
