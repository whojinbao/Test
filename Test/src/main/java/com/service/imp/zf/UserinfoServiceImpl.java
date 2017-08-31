package com.service.imp.zf;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.UserinfoDao;
import com.entity.Userinfo;
import com.service.zf.UserinfoService;
/** 
* @author ����֣��: 
* @version ����ʱ�䣺2017��8��30�� ����9:03:22 
* ��˵��
*  UserinfoServiceImpl �� ʵ����
*/ 
 
//@Service
public class UserinfoServiceImpl implements UserinfoService{
	//@Autowired
    private UserinfoDao userinfodao; 
	@Override
	/**
	 * getUsers �����ݿ��ѯ���е��û���ע��ʱ���û���δ���Ƹ�����Ϣ��
	 * @return һ���û�������
	 */
	public List<Userinfo> getUsers() {
		// TODO Auto-generated method stub
		List<Userinfo> userinfos = userinfodao.getUsers();
		return userinfos;
	}
	@Override
	/**
	 * addUser ���һ���û�
	 * @param user �û�
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
