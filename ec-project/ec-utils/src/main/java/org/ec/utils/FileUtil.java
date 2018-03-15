package org.ec.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.ec.mh.entity.FileBasicInfo;


public class FileUtil {
	
	private static String escapedChars = "&quot;";
	private static String customaryChar = "\"";
	
	/**
	 * 将前台传过来的文件信息字符串转成文件数组
	 * */
	public static FileBasicInfo[] fileStrToFileArray(String files) {
		if (files.contains(escapedChars)) {
			files = files.replaceAll(escapedChars, customaryChar);
		}
		
		FileBasicInfo[] fileArray = null;
		try {
			JSONArray array = JSONArray.parseArray(files);
			int fileNum = array.size();
			fileArray = new FileBasicInfo[fileNum];
			for (int i = 0; i < fileNum; i++) {
				fileArray[i] = JSONObject.toJavaObject(array.getJSONObject(i), FileBasicInfo.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return fileArray;
	}
	
	public static FileBasicInfo fileStrToFileBasiceInfo(String file) {
		if (file.contains(escapedChars)) {
			file = file.replaceAll(escapedChars, customaryChar);
		}
		
		FileBasicInfo fileBasicInfo = null;
		try {
			fileBasicInfo = JSONObject.toJavaObject(JSONObject.parseObject(file), FileBasicInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return fileBasicInfo;
	}
	
	/**
	 * 流转字符串
	 * 
	 * @param is
	 * @return
	 */
	public static String inputStream2String(ServletInputStream is) {
		BufferedReader in = new BufferedReader(new InputStreamReader(is));
		StringBuffer buffer = new StringBuffer();
		String line = "";

		try {
			while ((line = in.readLine()) != null) {
				buffer.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}
}
