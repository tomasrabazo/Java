package com.test6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test1 {
	
	public Date expiry_date;
	
	public long getDaysLeftOnSub() {

		long millis1 = Calendar.getInstance().getTimeInMillis();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(expiry_date);
		long millis2 = cal2.getTimeInMillis();

		// Calculate difference in days
		return (millis2 - millis1) / (24 * 60 * 60 * 1000);
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "8-08-2016 10:20:56";
		Date date2 = sdf.parse(dateInString);
		System.out.println(date2); //Tue Aug 31 10:20:56 SGT 1982
		
		test1 test = new test1();
		test.expiry_date = date2;
		System.out.println(test.getDaysLeftOnSub());
	}

}
