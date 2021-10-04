package mc.sn.baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class BaseballGame {
	//���� ���� ������ �Ǻ��ϴ� ��
	private ArrayList<String> hiddenNumber;
	
	public BaseballGame() {
		this.makeNumbers();
	}
	
	public String guessNumber(String gNumber) {
		String result = null;
		ArrayList<String> numbers = new ArrayList<String>();
		for(int i=0;i<gNumber.length();i++) {
			numbers.add(String.valueOf(gNumber.charAt(i)));
		}
		
		//gNumber�� �ߺ����� Ȯ���ϰ� �ߺ��̸� ���̻� �������� �ʰ� null����
		boolean flag = this.isSameNumber(numbers);
		if(!flag) {
		//�ߺ��� �ƴϸ� �Ǻ������� ���ؼ� ��Ʈ����ũ�� ���� �����ѵ� "3:2" �������� 
		//(��Ʈ����ũ):(��)�� �������� ���ڿ��� ����� ����
			int strike = 0;
			int ball = 0;
			
			for(int i=0;i<hiddenNumber.size();i++) {
				for(int j=0;j<numbers.size();j++) {
					//�ؾ� �� �� (�Ǻ�:--> ���� ������ Ȯ���ϰ� ������ �ε��� Ȯ��)
					if(hiddenNumber.get(i).equals(numbers.get(j))) {
						if(i==j) {
							//strike
							strike++;
						} else {
							//ball
							ball++;						
							}
					}
				}
			}
			result = strike+":"+ball;
		}
		return result;
	}
	
	public void makeNumbers() {
		//4�ڸ��� �ߺ����� ���� ���� ����Ʈ�� �Ҵ��ϱ�
		//1. 4�ڸ��� ������ �� �����
		// "2548"
		// 0123 --> �ε���
		boolean isCreateNumber = false;
		while(!isCreateNumber) {
			Random r = new Random();
			int temp = r.nextInt(9000)+1000;
			String tempNumber = String.valueOf(temp);
			ArrayList<String> numbers = new ArrayList<String>();
			for(int i=0;i<tempNumber.length();i++) {
				numbers.add(String.valueOf(tempNumber.charAt(i)));
			}
			//2. ������ ���� �ߺ����� ���� ���� Ȯ��
			boolean result = this.isSameNumber(numbers);
			//3. �ߺ������� ����Ʈ�� �Ҵ��ϱ�
			if(!result) {
				System.out.println(temp);
				this.hiddenNumber = numbers;
			}
			if (this.hiddenNumber!=null) {
				isCreateNumber = true;
			}
		}
	}
	
	private boolean isSameNumber(ArrayList<String> nums) {
		boolean result = false;
		// Set�� �̿��� -->
		HashSet<String> myset = new HashSet<String>();
		myset.addAll(nums);
		//2254
		if(nums.size()!=myset.size()) {
			result = true;
		}
		return result;
	}

}
