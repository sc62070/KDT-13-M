package mc.sn.code;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CodePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CodePractice cp = new CodePractice();
		//cp.test3();
		MyUtils my = new MyUtils();
		String now = my.getDateInfo(MyUtils.FULL_DATE);
		System.out.println(now);
	}
	
	public void test3() {
		//test2()�? ?��출하?�� 출력?�� 문자?��?�� 리턴받아?�� 출력?��?��?��
		String now = this.test2();
		System.out.println("test3 "+now);
	}
	
	public String test2() {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(new Date());
		//System.out.println(now);
		return now;
	}
	public void test() {
		//?��?�� ?��짜�? ?��간을 출력?��?�� 코드�? ?��?��?��?��?��
		// java.util.Date, java.util.Calendar
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day);
		System.out.println(hour+":"+min+":"+sec);
	}

}
