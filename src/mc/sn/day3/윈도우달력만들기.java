package mc.sn.day3;

public class 윈도우달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastDay = 30;
		System.out.println("2021년 9월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.print("\t\t\t");
		for (int i=0;i<lastDay;i++) {
			int day = i+1;
				System.out.print(day+"\t");
			if((day+3)%7==0) { //day%7==0
				System.out.println();
				}
			}
		
		}
	}
