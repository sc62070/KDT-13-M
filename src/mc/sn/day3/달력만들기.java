package mc.sn.day3;

public class �޷¸���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ʒ� �⺻ �޷� �ڵ忡�� �ߺ��� ������ ������ �ڵ带 �ۼ��ϼ���
		
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (int i=0;i<31;i++) {
			int day = i+1;
				System.out.print(day+"\t");
			if(day%7==0) {
				System.out.println();
			}
		}
	}
}
