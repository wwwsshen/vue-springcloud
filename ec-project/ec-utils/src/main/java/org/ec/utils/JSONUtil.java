package org.ec.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.ec.mh.dto.LoginDTO;
import org.ec.mh.dto.NoticeDTO;

public class JSONUtil {
	
	public static String getErrorJSON(){
		return "{error:\"参数不匹配\"}";
	}
	
	public static String getTokenJSON(String token){
		return "token:\""+ token + "\"";
	}
	
	public static LoginDTO getLoginDtoByJSON(String text){
		return JSONObject.parseObject(text, LoginDTO.class);
	}
	
	public static String getSuccessJSON(){
		return "{success:\"success\"}";
	}
	
	/**
	 * 将List<Map<String,Object>> 放入JSONArray
	 * */
	public static JSONArray toJSONArray(List<Map<String, Object>> datas) {
		JSONArray ja = new JSONArray();
		
		if (datas != null) {
			for(Map<String, Object> data : datas)
				ja.add(new JSONObject(data));
		}
		
		return ja;
	}
	
	public static JSONArray toJSONArrayForJavaObject(List<?> datas) {
		JSONArray ja = new JSONArray();
		
		for(Object data : datas)
			ja.add(JSONObject.toJSON(data));
		
		return ja;
	}
	
	/**
	 * 将JSON转为Map
	 * */
	public static Map<String, Object> toMap(JSONObject json) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		Set<String> keys = json.keySet();
		
		for(String key : keys)
			map.put(key, json.get(key));
		
		return map;
	}
	
	/**
	 * 将JSONString字符串转化为DTO
	 */
	@SuppressWarnings("unchecked")
	public static <E> E toDTO(String jsonString) {
		JSONObject jsonObject = JSONObject.parseObject(jsonString);
		E  dto = (E)JSONObject.toJavaObject(jsonObject, NoticeDTO.class);
		return dto;
	}
	
	/**
	 * 解析前台传过来的jsonArray字符串
	 * */
	public static JSONArray parseForegroundJSONArrayStr(String str) {
		return JSONObject.parseArray(str.replaceAll("&quot;", "\""));
	}
}
