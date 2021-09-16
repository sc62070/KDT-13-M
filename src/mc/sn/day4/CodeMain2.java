package mc.sn.day4;

public class CodeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PracticeCode 타입의 인스턴스를 생성해 pc라는 이름의 변수에 할당한다.
		PracticeCode pc = new PracticeCode();
		pc.testArray2();
		
	}
		

	public void test() {
		// PracticeCode 타입의 인스턴스를 생성해 pc라는 이름의 변수에 할당한다.
		PracticeCode pc = new PracticeCode();
		//2~10까지 소수여부를 판별하여 출력하는 코드 작성하세요
		//그리고 소수의 합을 출력하시오
		// 소수 누적 변수 선언 및 초기화
		int sum = 0;
		// 정수 2 ~ 10 사이의 숫자중 소수를 판별하여 출력하고 합계를 누적시킨다.
		for(int i=0;i<9;i++) {
			//반복문을 이용하여 2~10사이의 정수 자동으로 생성하기
			int number = i + 2; 
			//System.out.println(number);
			// 소수판별 메소드를 이용하여 소수여부 확인하기
			boolean flag = pc.isPrimeNumber(number);
			// 소수 여부에 따라 누적 및 해당 정수 출력하기
			if(flag) {
				sum = sum + number; //sum의 값으 number로 누적해라
				System.out.println(number+"는 소수");
			} else {
				System.out.println(number+"는 소수가 아님");
			}
		}
		// 소수 누적 합계를 출력한다.
		System.out.println("sum is "+sum);
				
	}
}
