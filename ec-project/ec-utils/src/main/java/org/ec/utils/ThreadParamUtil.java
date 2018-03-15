package org.ec.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 将参数存入当前线程，也可以从当前线程中取出之前保存的参数
 * */
public class ThreadParamUtil {
	private ThreadParamUtil() {};
	
    private static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String, Object>>() {

		@Override
		protected Map<String, Object> initialValue() {
			
			return new HashMap<String, Object>();
		}
    	
    };
    
    /**
     * 存入参数
     * */
    public static void put(String key, Object value) {
    	threadLocal.get().put(key, value);
    }

    /**
     * 获取值
     * */
    public static Object get(String key) {
    	return threadLocal.get().get(key);
    }
}
