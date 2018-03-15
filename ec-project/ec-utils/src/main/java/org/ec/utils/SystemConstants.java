package org.ec.utils;

import java.util.HashMap;
import java.util.Map;


/**
 * 系统常量
 * @author zx
 * */
public class SystemConstants {
	
	/**
	 * 平台管理基础角色id
	 * */
	public static final String PM_ROLE_ID = "0001";
	
	/**
	 * 运营商基础角色id
	 * */
	public static final String OM_ROLE_ID = "0002";
	
	/**
	 * 集团用户基础角色id
	 * */
	public static final String BLOC_ROLE_ID = "0003";
	
	/**
	 * 驾驶员基础角色id
	 * */
	public static final String DRIVER_ROLE_ID = "0004";
	
	/**
	 * 代理商基础角色id
	 * */
	public static final String AGENT_ROLE_ID = "0005";
	
	/**
	 * 以角色id为键，角色类型为值的map
	 * */
	public static final Map<String, String> ROLE_TYPES = new HashMap<String, String>();
	
	/**
	 * 平台角色类型
	 * */
	public static final String PM_ROLE_TYPE = "PM";
	
	/**
	 * 平台角色类型(运营商)
	 * */
	public static final String OM_ROLE_TYPE = "OM";
	
	/**
	 * 平台角色类型(租赁用户)
	 * */
	public static final String BLOC_ROLE_TYPE = "BLOC";
	
	/**
	 * 平台角色类型(驾驶员)
	 * */
	public static final String DRIVER_ROLE_TYPE = "DRIVER";
	
	/**
	 * 平台角色类型(代理商)
	 * */
	public static final String AGENT_ROLE_TYPE = "AGENT";
	
	/**
	 * 标注为基础角色
	 * */
	public static final Byte BASE_ROLE_TYPE = 0;
	
	/**
	 * 标注为用户新增的额外角色
	 * */
	public static final Byte EXTRA_ROLE_TYPE = 1;
	
	/**
	 * 以角色类型为键，角色id为值的map
	 * */
	public static final Map<String, String> ROLE_IDS = new HashMap<String, String>();
	
	
	// 初始化roleids与roletypes
	static {
		ROLE_TYPES.put(PM_ROLE_ID, PM_ROLE_TYPE);
		ROLE_IDS.put(PM_ROLE_TYPE, PM_ROLE_ID);
		
		ROLE_TYPES.put(OM_ROLE_ID, OM_ROLE_TYPE);
		ROLE_IDS.put(OM_ROLE_TYPE, OM_ROLE_ID);
		
		ROLE_TYPES.put(BLOC_ROLE_ID, BLOC_ROLE_TYPE);
		ROLE_IDS.put(BLOC_ROLE_TYPE, BLOC_ROLE_ID);
		
		ROLE_TYPES.put(DRIVER_ROLE_ID, DRIVER_ROLE_TYPE);
		ROLE_IDS.put(DRIVER_ROLE_TYPE, DRIVER_ROLE_ID);
	}
	
	/**
	 * 根据角色类型获取角色id
	 * */
	public static String getRoleId(String roleType) {
		return ROLE_IDS.get(roleType);
	}
	
	/**
	 * 根据角色id获取角色类型
	 * */
	public static String getRoleType(String roleId) {
		return ROLE_TYPES.get(roleId);
	}
	
	
	/**
	 * 当前用户id的键
	 * */
	public static final String CUR_USER_ID_KEY = "curUserid";
	
	
	/**
	 * 当前用户类型的键
	 * */
	public static final String CUR_ROLE_TYPE_KEY = "curRoleType";
	
	/**
	 * 当前用户所属组织结构的键
	 * */
	public static final String CUR_ORG_ID_KEY = "curOrgId";
	
	/**
	 * 当前用户所属组织结构的code
	 * */
	public static final String CUR_ORG_CODE_KEY = "curOrgCode";
	
	/**
	 * 标注权限分配中，拥有者类型为角色
	 * */
	public static final String OWNER_TYPE_IN_PA_IS_ROLE = "123";
	
	/**
	 * 标注权限分配中，拥有者类型为组织结构
	 * */
	public static final String OWNER_TYPE_IN_PA_IS_ORG = "456";
	
	/**
	 * 用于区分数据库中值为0或1的字段，包括是否有下级、是否有效等等
	 * */
	public static final Byte FALSE_0 = 0;
	
	public static final Byte TRUE_1 = 1;
	
	/**
	 * 四个顶层结构的code值
	 * */
	/**
	 * 平台管理
	 * */
	public static final String PM_ORG_CODE = "00000001";
	
	/**
	 * 运营商
	 * */
	public static final String OM_ORG_CODE = "00000002";
	
	/**
	 * 集团用户
	 * */
	public static final String BLOC_ORG_CODE = "00000003";
	
	
	/**
	 * 驾驶员
	 * */
	public static final String DRIVER_ORG_CODE = "00000004";
	
	/**
	 * 平台管理员的组织结构
	 * */
	public static final String PM_PEOPLE_ORG_CODE = "0000000100000001";
	
	/**
	 * 初始密码
	 * */
	public static final String INIT_PASSWORD = "123456";
	
	
	/**
	 * 标注操作类型为新增
	 * */
	public static final byte ADD_OP_TYPE = 0;
	
	/**
	 * 标注操作类型为更新
	 * */
	public static final byte UPDATE_OP_TYPE = 1;
	
	/**
	 * 车辆状态值
	 * */
	
	/**
	 * 可用状态
	 * */
	public static final String AVAILABLE_STATE_FOR_VEHICLE = "0000000400000001";
	
	public static final String LEASEUSER_ORGCODE = "00000003";
	
	public static final int LEVEL0 = 2;
	
	/**
	 * 通知类型
	 * */
	
	/**
	 * 一般通知类型
	 * */
	public static final String COMMON_NOTICE_TYPE = "0000000100000001";
	
	/**
	 * 紧急通知类型
	 * */
	public static final String URGENCY_NOTICE_TYPE = "0000000100000002";
	
	/**
	 * 往来单位类型
	 **/
	/**
	 * 维修站
	 * */
	public static final String UNIT_TYPE = "0000000600000002";
	
	
	/**
	 * 超级管理员的uid
	 * */
	public static final String ADMIN_UID = "2623502869319762";

	public static final Byte INIT_STATE = 1;
	
	/**
	 * 保险公司对应的码表的名称
	 * */
	public static final String INSURANCE_CODE_NAME = "保险公司";
	
	/**
	 * 车辆实时信息数据来源对应的码表的code值
	 * */
	public static final String REAL_TIME_DATA_SOURCE_PARAM_CODE = "00000008";
	
	/**
	 * 
	 * */
	public static final String TOTAL_ITEMS_KEY = "totalItems";
	
	/**
	 * comet常量
	 */
    public static long EXPIRE_AFTER_ONE_HOUR = 30; //cache过期时间
    public static String CHANNEL_MSGCOUNT= "msgCount";
    public static String CHANNEL_MSG_DATA= "msgData";
}

















