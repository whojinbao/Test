package com.service.zf;

import java.util.List;

import com.entity.Userinfo;

/** 
* @author 作者 郑飞: 
* @version 创建时间：2017年8月30日 上午9:02:11 
* 类说明 
* UserinfoService :对用户的数据的逻辑处理
*/ 
 
public interface UserinfoService {
	/**
	 * getUsers 从数据库查询所有的用户（注册时的用户，未完善个人信息）
	 * @return 一个用户的链表
	 */
	public List<Userinfo> getUsers();
	/**
	 * addUser 添加一个用户
	 * @param user 用户
	 * @return
	 */
	public int addUser(Userinfo user);
	
	/**
	 * 查询指定用户
	 * @param userId
	 * @return
	 */
	public Userinfo queryUserinfo(String userId);
}
