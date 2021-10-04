package mc.sn.baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class BaseballGame {
	//게임 숫자 생성과 판별하는 곳
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
		
		//gNumber가 중복인지 확인하고 중복이면 더이상 진행하지 않고 null리턴
		boolean flag = this.isSameNumber(numbers);
		if(!flag) {
		//중복이 아니면 판별로직을 통해서 스트라이크와 볼을 판정한뒤 "3:2" 형식으로 
		//(스트라이크):(볼)의 형식으로 문자열을 만들어 리턴
			int strike = 0;
			int ball = 0;
			
			for(int i=0;i<hiddenNumber.size();i++) {
				for(int j=0;j<numbers.size();j++) {
					//해야 할 일 (판별:--> 숫자 같은지 확인하고 같으면 인덱스 확인)
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
		//4자리의 중복없는 수를 만들어서 리스트로 할당하기
		//1. 4자리의 임의의 수 만들기
		// "2548"
		// 0123 --> 인덱스
		boolean isCreateNumber = false;
		while(!isCreateNumber) {
			Random r = new Random();
			int temp = r.nextInt(9000)+1000;
			String tempNumber = String.valueOf(temp);
			ArrayList<String> numbers = new ArrayList<String>();
			for(int i=0;i<tempNumber.length();i++) {
				numbers.add(String.valueOf(tempNumber.charAt(i)));
			}
			//2. 임의의 수중 중복수자 포함 여부 확인
			boolean result = this.isSameNumber(numbers);
			//3. 중복없으면 리스트로 할당하기
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
		// Set을 이용함 -->
		HashSet<String> myset = new HashSet<String>();
		myset.addAll(nums);
		//2254
		if(nums.size()!=myset.size()) {
			result = true;
		}
		return result;
	}

}
