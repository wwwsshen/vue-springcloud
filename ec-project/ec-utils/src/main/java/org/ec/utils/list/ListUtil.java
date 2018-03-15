package org.ec.utils.list;

import java.util.List;


/**
 * list相关的工具
 * */
public class ListUtil {
	private ListUtil() {}
	
	/**
	 * 移除List<Object>中Objec[]的值
	 * */
	public static <T> void removeAll(List<T> list, T[] array) {
		for(T e : array) {
			list.remove(e);
		}
	}
}
