package mc.sn.day6;

import java.util.Scanner;

public class ReviewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewMain rm = new ReviewMain();
		rm.test();
	}
	
	public void test2() {
		MyCalendar mc = new MyCalendar();
		mc.testCalendar();
	}
	
	public void test() {
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		while(!flag) {
			System.out.print("\n\nPlease Write Month >>> ");
			
			String line = scan.nextLine();
			System.out.println(line);
			if(line.equals("q")) {
				flag = true;
			} else {
				int month = Integer.parseInt(line);
				MyCalendar mc = new MyCalendar();
				mc.viewMonth(month);
			}
		}
		scan.close();
	}

}
