package com.dao.zf;

import java.util.List;

import com.entity.Openitem;

/** 
* @author ���� E-mail: 
* @version ����ʱ�䣺2017��8��30�� ����9:08:56 
* ��˵�� 
* openitemDao : �Է�������Ŀ�����ݿ����
*/ 
 
public interface OpenitemDao {
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
    /**
     * quertOpenitem : ��ѯָ����Ŀ
     * @param itemId  ��Ҫ��ѯ��Ŀ���
     * @return ����Ŀ
     */
    public Openitem quertOpenitem(String itemId);
}
