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
		 * 1과 자신의 수로만 나누어 떨어지는 수 예) 5는 1과 5로만 나누어 떨어지므로 
		 * 소수 6은 1, 2, 3, 6으로 나누어 떨어지므로 소수가
		 * 아님
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
