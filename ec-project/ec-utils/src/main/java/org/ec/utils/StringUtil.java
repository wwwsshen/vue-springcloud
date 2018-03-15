package org.ec.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

public class StringUtil {
	private static final String unknown = "unknown"; 
	private static Random random = new Random();
	private static final int DEFAULT_MAX_NUM = 100;
	
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	public static boolean isNullOrEmpty(String str) {
		if (str == null || str.equals(""))
			return true;
		return false;
	}
	
	/**
	 * 只要有一个为null或空时就返回true
	 * */
	public static boolean isNullOrEmptyForMultiStr(String... strs) {
		for(String str : strs)
			if(isNullOrEmpty(str))
				return true;
		
		return false;
	}

	public static String getIpAddress(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || unknown.equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || unknown.equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || unknown.equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || unknown.equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || unknown.equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	/**
	 * 获取字符串包含某个字符的次数
	 * */
	public static int getCountOfCharInString(String str, char targetCh) {
		int count = 0;
		
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == targetCh)
				count++;
		
		return count;
	}
	
	/**
	 * 生成当前纳秒值的字符串
	 * */
	public static String createTimestamp() {
	    return String.valueOf(System.nanoTime())
	    		.concat(String.valueOf(random.nextInt(DEFAULT_MAX_NUM)));
	}
	
	
	/**
	 * 比较yyyy-MM-dd 时间格式类型的字符串的大小
	 * */
	public static int compareDateString(String date1, String date2) {
		if(date1 == null && date2 == null)
			return 0;
		
		if(date1 == null)
			return -1;
			
		if(date2 == null)
			return 1;
		
		return date1.compareTo(date2);
	}
	
	/**
	 * 拼接字符串
	 * */
	public static String concatStrs(String startStr, String... strs) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(startStr);
		
		for(String str : strs)
			sb.append(str);
		
		return sb.toString();
	}
	
	
	/**
	 * 使用StringTokenizer分割字符串，不包含界符
	 * */
	public static String[] splitString(String str, String delim) {
		if(isNullOrEmpty(str))
			return null;
		
		StringTokenizer tokens = new StringTokenizer(str, delim);
		
		String[] rs = new String[tokens.countTokens()];
		
		int i = 0;
		while(tokens.hasMoreTokens())
			rs[i++] = tokens.nextToken();
		
		return rs;
	}
	
    /**
     * 获得当前时间
     * @param pattern
     * @return
     */
	private static String getCurrentDate(String pattern) {
		return DateUtil.formatDate(pattern, new Date());
	}
	
	/**
	 * 获得当前日期
	 * @return
	 */
	public static String getCurrentDate() {
		return getCurrentDate(DATE_FORMAT);
	}
	
    /**
     * 获取当前日期时间
     * @return
     */
	public static String getCurrentDateTime() {
		return getCurrentDate(DATETIME_FORMAT);
	}
	
	/**
	 * 获取ip地址
	 * @return
	 */
	public static String getIpAddress() {
		String ipAddress = null;
		
		try {
			ipAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		return ipAddress;
	}
	
	/** 
	 * 方法名称:transMapToString 
	 * 传入参数:map 
	*/  
	@SuppressWarnings("rawtypes")
	public static String transMapToString(Map map, String delimiter){  
	  Entry entry;  
	  StringBuffer sb = new StringBuffer();  
	  for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext();)  
	  {  
	    entry = (Entry)iterator.next();  
	      sb.append(entry.getKey().toString()).append(delimiter).append(null==entry.getValue()?"":  
	      entry.getValue().toString()).append (iterator.hasNext() ? delimiter : "");  
	  }  
	  return sb.toString();  
	} 
	
	/** 
	 * 方法名称:transMapToString 
	 * 传入参数:map 
	 * 返回值:String 形如 username%chenziwen%password%1234 
	*/ 
	@SuppressWarnings("rawtypes")
	public static String transMapToString(Map map){  
	  Entry entry;  
	  StringBuffer sb = new StringBuffer();  
	  for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext();)  
	  {  
	    entry = (Entry)iterator.next();  
	      sb.append(entry.getKey().toString()).append("%").append(null==entry.getValue()?"":  
	      entry.getValue().toString()).append (iterator.hasNext() ? "%" : "");  
	  }  
	  return sb.toString();  
	} 
	
	/** 
	 * 方法名称:transMapToString 
	 * 传入参数:map 
	 * 返回值:String 形如 username'chenziwen^password'1234 
	*/  
	@SuppressWarnings("rawtypes")
	public static String transMapToStringOther(Map map){  
	  Entry entry;
	  StringBuffer sb = new StringBuffer();  
	  for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext();)  
	  {  
	    entry = (Entry)iterator.next();
	      sb.append(entry.getKey().toString()).append( "'" ).append(null==entry.getValue()?"":  
	      entry.getValue().toString()).append (iterator.hasNext() ? "^" : "");  
	  }  
	  return sb.toString();  
	}
	
	/** 
	 * 方法名称:transStringToMap 
	 * 传入参数:mapString 形如 username'chenziwen^password'1234 
	 * 返回值:Map 
	*/  
	@SuppressWarnings("rawtypes")
	public static Map transStringToMap(String mapString){  
	  Map<String, Object> map = new HashMap<String, Object>();  
	  StringTokenizer items;
	  for(StringTokenizer entrys = new StringTokenizer(mapString, "^");entrys.hasMoreTokens();   
	    map.put(items.nextToken(), items.hasMoreTokens() ? ((Object) (items.nextToken())) : null))  
	      items = new StringTokenizer(entrys.nextToken(), "'");  
	  return map;  
	}
	
	public static String getLocalAddress(){
		String ip = "";
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return ip;
	}
}













