package com.entity;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年8月30日 上午8:50:02 
* 类说明 
* Userinfo :登录时的用户表
*/ 
 
public class Userinfo {
	private String userId;//账号
	private String userName ;//用户名(电话)
	private String userPassword ;//密码
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
