package mc.sn.day3;

public class 메소드윤년체크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드(method) 제어 
		메소드윤년체크 pm = new 메소드윤년체크();
		pm.viewMonth(2);
	}
	
	public void viewMonth(int month) {
		int year = 2021;
		int space = 0;
		int lastDay = 0;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			lastDay = 31;
		} else if(month==2) {
			lastDay = 28;
			//윤년체크 로직
			//1. 년도를 400으로 나누어 떨어지거나
			// 2. 년도를 4로 나누어 떨어지고 100으로 나누어 떨어지지 않는 년도이어야 한다.
			//(현재연도)/400 와 ((현재연도)/4)/100 을 거쳐서 둘다 true, 28 혹은 29가 나오는식으로.
			//그럼 if(monthday==28) if else(monthday==29)로 설정.
			if(year%400==0||year%4==0&&year%100!=0) {
				lastDay = 29;
			}
			
		} else {
			lastDay = 30;
		}
		
		if(month==2||month==3||month==11) {
			//금,월,월,목,토,화,목,일,수,금,월,수
			//1,2,3,4,5,6,7,8,9,10,11,12
			space = 1;
		} else if(month==6) {
			space = 2;
		} else if(month==10||month==12) {
			space = 3;
		} else if(month==4||month==7) {
			space = 4;
		} else if(month==1||month==10) {
			space = 5;
		} else if(month==5) {
			space = 6;
		} else if(month==8) {
			space = 0; //생략가능, 기본값으로 초기화되어 있음.
		}
		
		
		System.out.println("2021년"+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for (int i=0;i<lastDay;i++) {
			int day = i+1;
				System.out.print(day+"\t");
			if((day+space)%7==0) {
				System.out.println();
				}
			}
	}
}
