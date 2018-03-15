package org.ec.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author zx
 * 
 * 对象相关工具
 * */
public class ObjectUtil {
	private ObjectUtil() {}
	
	/**
	 * 序列化对象
	 * @param obj
	 * @return 如果对象为null或者序列化失败时返回null，成功返回byte[]
	 * */
	public static byte[] object2Bytes(Serializable obj) {
		if(obj == null)
			return null;
		
		try(
				ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
				ObjectOutputStream objOut = new ObjectOutputStream(byteOut);) {
			
			objOut.writeObject(obj);
			return byteOut.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	/**
	 * 恢复对象
	 * @param bytes
	 * @return 如果bytes为null或者恢复失败时返回null，成功返回对象
	 * */
	public static Object bytes2Object(byte[] bytes) {
		if(bytes == null)
			return null;
		
		try(
				ByteArrayInputStream byteInput = new ByteArrayInputStream(bytes);
				ObjectInputStream objInput = new ObjectInputStream(byteInput); ) {
			
			return objInput.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
