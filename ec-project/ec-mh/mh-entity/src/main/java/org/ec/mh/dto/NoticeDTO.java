package org.ec.mh.dto;

import javax.validation.constraints.Size;

import org.ec.utils.GroupForAdd;
import org.ec.utils.GroupForUpdate;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * 新增编辑所用
 * @author rantao
 * 修改人 tanyong
 */
public class NoticeDTO {
	
	//id
	@NotEmpty(message="{general.NotEmpty}", groups = {GroupForUpdate.class})
	private String id;

	//标题
	@NotEmpty(message="{general.NotEmpty}", groups = {GroupForAdd.class, GroupForUpdate.class})
	@Size(max=255)
	private String title;
	
	//内容
	@NotEmpty(message="{general.NotEmpty}", groups = {GroupForAdd.class, GroupForUpdate.class})
	@Size(max=1000)
	private String content;
	
	//通知类型
	@NotEmpty(message="{general.NotEmpty}", groups = {GroupForAdd.class, GroupForUpdate.class})
	private String noticeType;
	
	//接收人ids
	@NotEmpty(message = "{general.NotEmpty}", groups = GroupForAdd.class)
	private String[] receiverIds;
	
	//发布者
	@NotEmpty(message = "{general.NotEmpty}", groups = GroupForUpdate.class)
	private String publishUser;
	
	private String receiver;
	
	private String receiverType;
	
	//车辆id
	private String vehicleId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String[] getReceiverIds() {
		return receiverIds;
	}

	public void setReceiverIds(String[] receiverIds) {
		this.receiverIds = receiverIds;
	}

	public String getPublishUser() {
		return publishUser;
	}

	public void setPublishUser(String publishUser) {
		this.publishUser = publishUser;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getReceiverType() {
		return receiverType;
	}

	public void setReceiverType(String receiverType) {
		this.receiverType = receiverType;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

}
