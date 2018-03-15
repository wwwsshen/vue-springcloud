package org.ec.utils.map;

import java.util.*;

public class MapUtil {
	private MapUtil() {}
	
	/**
	 * 将map中的值按键值的顺序取出
	 * */
	public static <K,V> List<V> getValuesInMapAndReturnList(Map<K, V> map, K[] keys) {
		List<V> values = new ArrayList<V>();
		
		for(K key : keys)
			if(map.containsKey(key))
				values.add(map.get(key));
		
		return values;
	}
	
	/**
	 * 将map中的值按键值的顺序取出
	 * */
	public static <K,V> V[] getValuesInMapAndReturnArray(Map<K, V> map, K[] keys) {
		
		@SuppressWarnings("unchecked")
		V[] v = (V[]) new Object[1];
		return getValuesInMapAndReturnList(map, keys).toArray(v);
	}
	
	/**
	 * 将ListMap中的值取出，放入List<List>
	 * */
	public static <K,V> List<List<V>> getValuesInListAndReturnListMap(List<Map<K, V>> list, K[] keys) {
		List<List<V>> rs = new ArrayList<List<V>>();
		
		for(Map<K, V> map : list) {
			rs.add(getValuesInMapAndReturnList(map, keys));
		}
		
		return rs;
	}
	
	
	/**
	 * 将ListMap中的值取出，放入List<V[]>
	 * */
	public static <K,V> List<V[]> getValuesInListAndReturnListArray(List<Map<K, V>> list, K[] keys) {
		List<V[]> rs = new ArrayList<V[]>();
		
		for(Map<K, V> map : list) {
			rs.add(getValuesInMapAndReturnArray(map, keys));
		}
		
		return rs;
	}
	
	/**
	 * 从ListMap中取出某个键值，放入List
	 * */
	public static <K, V> List<V> getValuesByKey(List<Map<K, V>> list, K key) {
		List<V> rs = new ArrayList<V>();
		
		for(Map<K, V> map : list) {
			if(map.containsKey(key))
				rs.add(map.get(key));
		}
		
		return rs;
	}
	
	/**
	 * 从map取出String型的value，如果为null返回null
	 * */
	public static String getStringFromMap(Map<? extends Object, Object> map, Object key) {
		if(!map.containsKey(key))
			return null;
		
		Object value = map.get(key);
		return  value == null ? null : value.toString();
		
	}
	
	/**
	 * 从List<map>取出String型的value，返回List<String>
	 * */
	public static List<String> getStringsFromListMap(List<Map<String, Object>> list, String key) {
		List<String> values = new ArrayList<String>();
		
		for(Map<String, Object> map : list) {
			String value = getStringFromMap(map, key);
			if(value != null)
				values.add(value);
		}
		
		return values;
		
	}
}
















