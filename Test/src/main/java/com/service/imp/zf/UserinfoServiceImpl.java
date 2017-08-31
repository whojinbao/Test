package com.service.imp.zf;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.UserinfoDao;
import com.entity.Userinfo;
import com.service.zf.UserinfoService;
/** 
* @author 作者郑飞: 
* @version 创建时间：2017年8月30日 上午9:03:22 
* 类说明
*  UserinfoServiceImpl ： 实现类
*/ 
 
//@Service
public class UserinfoServiceImpl implements UserinfoService{
	//@Autowired
    private UserinfoDao userinfodao; 
	@Override
	/**
	 * getUsers 从数据库查询所有的用户（注册时的用户，未完善个人信息）
	 * @return 一个用户的链表
	 */
	public List<Userinfo> getUsers() {
		// TODO Auto-generated method stub
		List<Userinfo> userinfos = userinfodao.getUsers();
		return userinfos;
	}
	@Override
	/**
	 * addUser 添加一个用户
	 * @param user 用户
	 * @return
	 */
	public int addUser(Userinfo user) {
		// TODO Auto-generated method stub
		int flag = userinfodao.addUser(user);
		return flag;
	}
	/**
	 * @param userId
	 */
	@Override
	public Userinfo queryUserinfo(String userId) {
		// TODO Auto-generated method stub
		Userinfo userinfo= userinfodao.queryUserinfo(userId);
		return userinfo;
	}
  
}
