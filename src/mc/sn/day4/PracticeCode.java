package mc.sn.day4;

public class PracticeCode {
	//소수(prime number)를 판별하는 코드를 작성하시오
	public boolean isPrimeNumber(int number) {
		//소수 여부 판단
		boolean result = false;
		
			if(number%1==0||number%number==0) {
				result = true;
			}
			int count = 0;
			for(int i=0;i<number;i++) {
				if(number%(i+1)==0) {
					count = count +1;
					//count++;
				}
			if(count==2) {
				result = true;
			}
			}
		return result;
	}
}	
