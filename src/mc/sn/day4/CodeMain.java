package mc.sn.day4;

public class CodeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeCode pc = new PracticeCode(); //PracticeCode 클래스를 이용하여 변수인pc 한테 할당해라
		//2~10까지 소수여부를 판별하여 출력하는 코드 작성하세요
		//그리고 소수의 합을 출력하시오
		int sum = 0; //타입이 sum 인 int에 0으로 지정했다.
		for(int i=0;i<9;i++) {//정수형 타입의 변수 i의 초기값을 0으로 설정하고 i가 9 미만이 될때까지 반복한다.
			int number =i+2; //반복변수 i라는 변수에 2을 더해서 number라는 int에 부여한다.
			//System.out.println(number);
			boolean flag =pc.isPrimeNumber(number); //논리타입의 변수 flag를 선언하고 pc에 저장된 인스턴스의 isPrimeNumber메소드에 number 파라메타에 넣어라.
			System.out.println(flag);
			
			if(flag) {//만약 flag가 true일때와 false일때의 결과값을 처리해라.
				sum = sum + number;//sum의 값을 누적시켜라
				System.out.println(number+"는 소수");
			} else {
				System.out.println(number+"는 소수가 아님");
			}
		}	
		System.out.println("sum is "+sum);
	}
}
