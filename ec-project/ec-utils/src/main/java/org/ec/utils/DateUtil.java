package org.ec.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	private DateUtil() {}
	
	private static ThreadLocal<SimpleDateFormat> sdfPool = new ThreadLocal<SimpleDateFormat>() {

		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat();
		}
		
	};
	
	public static Date parseDate(String pattern, String date) {
		if (StringUtil.isNullOrEmpty(date))
			return null;
		
		SimpleDateFormat sdf = sdfPool.get();
		
		sdf.applyPattern(pattern);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Date parseDate(String date) {
		return parseDate(StringUtil.DATE_FORMAT, date);
	}
	
	public static Date parseDateTime(String date) {
		return parseDate(StringUtil.DATETIME_FORMAT, date);
	}

	public static String formatDate(String pattern, Date date) {
		SimpleDateFormat sdf = sdfPool.get();
		
		sdf.applyPattern(pattern);
		return sdf.format(date);
	}
	
	public static String formatDate(Date date) {
		return formatDate(StringUtil.DATE_FORMAT, date);
	}
	
	/**
	 * 计算两个字符串日期之间相差的天数  
	 * @param smDate
	 * @param bDate
	 * @return
	 */
	public static int daysBetween(String smDate, String bDate) {
		int daysBetween = 0;
		
		try {
			daysBetween =  daysBetween(DateUtil.parseDate(smDate), 
					DateUtil.parseDate(bDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		return daysBetween;
	}
	
	/**  
     * 计算两个日期之间相差的天数  
     * @param smDate 较小的时间 
     * @param bDate  较大的时间 
     * @return 相差天数 
     * @throws ParseException  
     */    
    public static int daysBetween(Date smDate,Date bDate) throws ParseException {  
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        smDate=sdf.parse(sdf.format(smDate));  
        bDate=sdf.parse(sdf.format(bDate));  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(smDate);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(bDate);    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(between_days));           
    }  
    
    /**
     * 获取当前日期
     * @return
     */
    public static Date getCurrentDate() {
    	return DateUtil.parseDate(StringUtil.getCurrentDate());
    }
    
    /**
     * 获取当前日期时间
     * @return
     */
    public static Date getCurrentDateTime() {
    	return DateUtil.parseDate(StringUtil.DATETIME_FORMAT, 
    			StringUtil.getCurrentDateTime());
    }
    
    /**
     * 判断当前时间是否在某时间段内
     * @param startTime 起始时间
     * @param endTime 结束时间
     * @return 
     */
    public static Boolean judgeTimeSlot(String startTime,String endTime){
    	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	String currentTime = format.format(new Date());
    	if(judgeDateSize(currentTime,startTime)>0&&judgeDateSize(currentTime,endTime)<0){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    /**
     * 判断两个时间大小
     * @param FTime first time
     * @param STime second time
     * @return first >= second 1 ; first < second -1
     */
    public static int judgeDateSize(String FTime,String STime){
    	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	try {
			Date FDate = format.parse(FTime);
			Date SDate = format.parse(STime);
	    	if(FDate.getTime() >= SDate.getTime()){
	    		return 1;
	    	}else{
	    		return -1;
	    	}
		} catch (ParseException e) {
			e.printStackTrace();
			return -1;
		}
    }
}
