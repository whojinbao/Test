package com.dao.zf;

import com.entity.Personinfo;

/** 
* @author ���� E-mail: 
* @version ����ʱ�䣺2017��8��30�� ����10:01:28 
* ��˵�� 
* PersoninfoDao: �����ݿ������Ϣ��Ĳ���
*/ 
 
public interface PersoninfoDao {
	/**
	 * addPersoninfo : ���һ���˵ĸ�����Ϣ
	 * @param personinfo
	 * @return
	 */
    public int addPersoninfo(Personinfo personinfo);
    /**
     * selectPerson : ��ѯ�����˵ĸ�����Ϣ
     * @param userId �˺�
     * @return ������Ϣ
     */
    public Personinfo selectPerson(String userId);
}
