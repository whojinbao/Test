package com.dao.zf;

import java.util.List;

import com.entity.Userinfo;

/** 
 * @author ���� E-mail: 
 * @version ����ʱ�䣺2017��8��30�� ����8:56:14 
 * ��˵�� 
 * UserinfoDao : �Ե�¼���û��Ĳ���
 */ 

public interface UserinfoDao {
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
	 * @param userId �û����
	 * @return
	 */
	public Userinfo queryUserinfo(String userId);
}
