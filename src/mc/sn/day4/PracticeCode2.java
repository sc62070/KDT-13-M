package mc.sn.day4;

public class PracticeCode2 {
	
	public void testArray() {
		int[] season = new int[4];
		season[0] = 10;
		season[1] = 20;
		season[2] = 30;
		season[3] = 40;
		System.out.println(season);
		for(int i=0;i<season.length;i++) {
			System.out.println(season[i]);
		}
	}
	
	public void testArray2() {
		int[] month = {1,2,3,4};
		for(int i=0;i<month.length;i++) {
			System.out.println(month[i]);
		}
	}
	
	
	public boolean isPrimeNumber(int number) {
		boolean result = false;
		/*
		 * 1�� �ڽ��� ���θ� ������ �������� �� ��) 5�� 1�� 5�θ� ������ �������Ƿ� 
		 * �Ҽ� 6�� 1, 2, 3, 6���� ������ �������Ƿ� �Ҽ���
		 * �ƴ�
		 */
		//crtl+shift+/
		int count = 0;
		for(int i=0;i<number;i++) {
			if(number%(i+1)==0) {
				count = count + 1;
				//count++;
			}
		}
		
		if(count==2) {
			result = true;
		}
		
		return result;
	}
	
}
