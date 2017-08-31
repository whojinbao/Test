package com.service.zf;

import com.entity.Personinfo;

/** 
* @author ���� :֣�� 
* @version ����ʱ�䣺2017��8��31�� ����11:12:34 
* ��˵��  ������Ϣ��Ĳ���
*/ 
 
public interface PersoninfoService {
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
