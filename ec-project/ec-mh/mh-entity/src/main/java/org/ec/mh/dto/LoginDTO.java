package org.ec.mh.dto;


import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginDTO {
	
	@NotEmpty(message="{login.username.NotEmpty}")
	@Size(max=50)
	private String userid;
	
	@NotEmpty(message="{login.username.NotEmpty}")
	@Size(max=50)
	private String password;
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		
		// 先解密
		this.password = password;            
	}
}
