package mc.sn.code;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtils {
	public static final int FULL_DATE = 0;
	public static final int DATE_ONLY = 1;
	public static final int TIME_ONLY = 2;
	
	public String getDateInfo(int type) {
		String result  = null;
		String pattern = "yyyy-MM-dd HH:mm:ss";
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		result = sdf.format(new Date());
		String[] temp = result.split(" ");
		if(type==1) { // ?���? ?���?
			result = temp[0];
		} else if(type==2) { //?��간정�?
			result = temp[1];
		}
		// ?���? 모든 ?��?��?�� ?��체정�?
		return result;
	}
}
