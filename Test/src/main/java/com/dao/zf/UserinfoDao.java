package com.dao.zf;

import java.util.List;

import com.entity.Userinfo;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2017年8月30日 上午8:56:14 
 * 类说明 
 * UserinfoDao : 对登录的用户的操作
 */ 

public interface UserinfoDao {
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
	 * @param userId 用户编号
	 * @return
	 */
	public Userinfo queryUserinfo(String userId);
}
