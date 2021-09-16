package mc.sn.day2;

public class 총합과나머지를구하는연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 123456; //653148,....
		//number를 구성하고 있는 수를 뒤에서 부터 한자리씩 분리해서 출력하세요
		//합계를 구하는 코드를 작성하시오
		int sum = 0;
		for (int i=0;i<6;i++) {
			//1.초기화(i=0) > 2.조건식 (i<6)> 3.실행문 > 4.증감식 (i++) >다시 2~4 반복
			int splitNumber = number % 10;
			System.out.println(splitNumber);
			number = number / 10;
			//System.out.println(number);
			sum = sum + splitNumber; //누적
//누적된다는 의미는 간단하다. splitNumber의 정의로 우리는 sum 이 0부터 시작된다는것을 알수 있으며, +6, +5, +4.... +1까지 순서대로 sum을 구한다는것을 알수있다.

		}
		System.out.println("\n\n");
		System.out.println(sum);

	}

}
