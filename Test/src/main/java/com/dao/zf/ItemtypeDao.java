package com.dao.zf;

import java.util.List;

import com.entity.Itemtype;

/** 
 * @author ���� :֣�� 
 * @version ����ʱ�䣺2017��8��31�� ����10:49:20 
 * ��˵��  ����Ŀ���͵Ĳ���
 */ 

public interface ItemtypeDao {
	/**
	 * ��ѯ���е���Ŀ����
	 * @return ��Ŀ���͵�����
	 */
	public List<Itemtype> getItemtypes();

	/**
	 * ���һ���µ���Ŀ����
	 * @param itemtype��Ŀ����
	 * @return
	 */
	public int addItemtype(Itemtype itemtype);
}
