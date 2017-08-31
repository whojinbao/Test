package com.service.zf;

import java.util.List;

import com.entity.Openitem;



/** 
* @author ���� :֣�� 
* @version ����ʱ�䣺2017��8��30�� ����7:13:19 
* ��˵�� 
* OpenitemService : �Է�������Ŀ�����ݵ��߼�����
*/ 
 
public interface OpenitemService {
	/**
	 * getOpenitems ����ѯ�����ѷ�������Ŀ
	 * @return
	 */
    public List<Openitem> getOpenitems();
    /**
     * addOpenitem �� ���һ��Ҫ��������Ŀ
     * @param openitem ��Ҫ��������Ŀ
     * @return
     */
    public int addOpenitem(Openitem openitem);
}
