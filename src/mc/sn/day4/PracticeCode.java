package mc.sn.day4;

public class PracticeCode {
	//�Ҽ�(prime number)�� �Ǻ��ϴ� �ڵ带 �ۼ��Ͻÿ�
	public boolean isPrimeNumber(int number) {
		//�Ҽ� ���� �Ǵ�
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
