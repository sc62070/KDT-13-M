package mc.sn.day3;

public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아래 기본 달력 코드에서 중복과 고정을 제거한 코드를 작성하세요
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i=0;i<31;i++) {
			int day = i+1;
				System.out.print(day+"\t");
			if(day%7==0) {
				System.out.println();
			}
		}
	}
}
