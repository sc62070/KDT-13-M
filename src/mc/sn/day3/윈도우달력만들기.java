package mc.sn.day3;

public class ������޷¸���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastDay = 30;
		System.out.println("2021�� 9��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.print("\t\t\t");
		for (int i=0;i<lastDay;i++) {
			int day = i+1;
				System.out.print(day+"\t");
			if((day+3)%7==0) { //day%7==0
				System.out.println();
				}
			}
		
		}
	}
