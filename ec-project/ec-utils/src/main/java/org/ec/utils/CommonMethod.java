package org.ec.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonMethod {
	public static final String INIT_SERIAL_NUM = "00001";
	
    /**
     * 公共分页
     * @param resultData 要进行分页的数组
     * @param start  每页的开始条数
     * @param limit  每页显示条数
     * @return 返回每页的数据
     * @author songxingguo
     */
	public static <E> List<E> comPaging(List<E> resultData,
			int start, int limit) {
		List<E> result = new ArrayList<E>();
		
		if (start < 0 || limit < 0) {
			return resultData;
		}
		
		int size = resultData.size();
		
		int nomalEnd = start + limit; //正常结束下标
		
		int end = nomalEnd > size ? size : nomalEnd;
		
		for (int i = start; i < end; i++) {
			result.add(resultData.get(i));
		}
		
		return result;
	}
	
	/**
	 * 根据日期+序号生成号码
	 * @param maxSerialNumber 当天最大的序号
	 * */
	public static String createAccount(String dateStr, String maxSerialNumber) {
		StringBuffer sb = new StringBuffer();
		sb.append(dateStr);
		
		if (StringUtil.isNullOrEmpty(maxSerialNumber))
			sb.append(INIT_SERIAL_NUM);
		else {
			int serialNumber = Integer.parseInt(maxSerialNumber);
			serialNumber++;
			sb.append(maxSerialNumber.substring(0, maxSerialNumber.length() - serialNumber / 10 - 1));
			sb.append(serialNumber);
		}
		
		return sb.toString();
	}
	
	/**
	 * 将查询得到的数据转换成一定的格式
	 * */
	public static List<Map<String, Object>> convert(List<Map<String, Object>> list) {
		List<Map<String, Object>> test = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		
		if (list != null) {
			int initialLength = ((String) list.get(0).get("module_code")).length();
			int i = 0;
			for (i = 0; i < list.size(); i++) {
				String parent = (String) list.get(i).get("module_code");
				Map<String, Object> map = new HashMap<String, Object>();
				List<Map<String, Object>> children = new ArrayList<Map<String, Object>>();

				if (parent.length() == initialLength) {
					map = list.get(i);
					for (int j = i + 1; j < list.size(); j++) {
						if (((String) list.get(j).get("module_code")).length() == initialLength) {
							i = j - 1;
							break;
						}
						if(((String) list.get(j).get("module_code")).length()==(SystemConstants.PM_ORG_CODE.length()*2)){
							children.add(list.get(j));
						}
						
					}

					map.put("children", children);
					test.add(map);
					
					result.add(map);
				}

			}
		}
		
		for(int j=0;j<test.size()-1;j++){
			for(int l=0;l<test.size()-1-j;l++){
				Map<String, Object> map = test.get(l);
				int line=Integer.parseInt(map.get("show_order").toString());
				
				Map<String, Object> secondMap = test.get(l+1);
				int secondLine=Integer.parseInt(secondMap.get("show_order").toString());
					
				if (line > secondLine){
					test.set(l+1, map);
					test.set(l, secondMap);
                 }
			}
		}
		
		for (int j = 0; j < test.size(); j++) {
			Map<String, Object> map = test.get(j);
			int line=Integer.parseInt(map.get("show_order").toString());
			
			List<Map<String, Object>> temp=new ArrayList<Map<String, Object>>();
			temp=(List<Map<String, Object>>) map.get("children");
			
			//冒泡排序
			for (int i = 0; i < temp.size()-1; i++)
            {
                for (int k = 0; k < temp.size()- i - 1; k++)
                {
                	Map<String, Object> map1=temp.get(k);
    				int line1=Integer.parseInt(map1.get("show_order").toString());
                	
                	Map<String, Object> map2=temp.get(k+1);
                	int line2=Integer.parseInt(map2.get("show_order").toString());
                	
                    if (line1 > line2){
                       temp.set(k+1, map1);
                       temp.set(k, map2);
                    }
                }
            }
			
			
		}
		
	
		return test;
	}
	
	/**
	 * 生成随机验证码
	 * @return 返回四位数字的验证码（String）
	 */
	public static String generatingRandomVerificationCode(){
		String identifyingCode = new String();
		identifyingCode += (int) (Math.random() * 9000 + 1000);
		
		return identifyingCode;
	}
}
