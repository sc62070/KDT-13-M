package mc.sn.day2;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2���� ����Ͱ� �Ȱ��� 9�ܱ��� ����ÿ�.
		for (int j=0; j<8; j++) {
			int number = j+2;
		for (int i=0;i<9;i++) {
			int value = i+1;
			System.out.print(value+"X"+number+"="+value*number+"\t");
		}
		System.out.println();
	}
	}

}
//ó���� 2���� ���� �������� �������.
//for (int i=0;i<9;i++) {
//int value = i+1;
//System.out.print("2"+"X"+number+"="+value*2);

//�㳪 9�ܱ��� �Ȱ��� ����� ���ؼ��� ���� j �� ����־�ߵȴ�.
//���⼭ ���� j �� 2�� �ڸ��� �����Ѵ�.

//�׷��⿡ for�� �ȿ� for ���� �� ����������̴�.
//�׸��� ���� j������ �ٲ𶧸��� ĭ�� ������ ���ؼ��� "\t"�� �߰��Ѵ�. 
//�׸��� println ��� print�� �ְԵǸ� ���η� �� ���� ������ �ȴ�.