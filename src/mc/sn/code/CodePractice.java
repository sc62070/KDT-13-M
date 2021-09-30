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
		//test2()ë¥? ?˜¸ì¶œí•˜?—¬ ì¶œë ¥?œ ë¬¸ì?—´?„ ë¦¬í„´ë°›ì•„?„œ ì¶œë ¥?•˜?‹œ?˜¤
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
		//?˜„?¬ ?‚ ì§œì? ?‹œê°„ì„ ì¶œë ¥?•˜?Š” ì½”ë“œë¥? ?‘?„±?•˜?‹œ?˜¤
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
