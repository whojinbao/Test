package com.service.zf;

import java.util.List;

import com.entity.Userinfo;

/** 
* @author ���� ֣��: 
* @version ����ʱ�䣺2017��8��30�� ����9:02:11 
* ��˵�� 
* UserinfoService :���û������ݵ��߼�����
*/ 
 
public interface UserinfoService {
	/**
	 * getUsers �����ݿ��ѯ���е��û���ע��ʱ���û���δ���Ƹ�����Ϣ��
	 * @return һ���û�������
	 */
	public List<Userinfo> getUsers();
	/**
	 * addUser ���һ���û�
	 * @param user �û�
	 * @return
	 */
	public int addUser(Userinfo user);
	
	/**
	 * ��ѯָ���û�
	 * @param userId
	 * @return
	 */
	public Userinfo queryUserinfo(String userId);
}
