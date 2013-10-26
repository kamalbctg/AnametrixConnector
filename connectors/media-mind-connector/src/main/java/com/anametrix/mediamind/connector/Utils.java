package com.anametrix.mediamind.connector;

import java.util.Calendar;
import java.util.Date;

public class Utils {
	public static Date initiateCurrentDateToZeroHour(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
}
