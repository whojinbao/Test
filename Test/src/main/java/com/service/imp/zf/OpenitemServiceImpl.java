package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.OpenitemDao;
import com.entity.Openitem;
import com.service.zf.OpenitemService;

/** 
* @author ���� ֣��: 
* @version ����ʱ�䣺2017��8��30�� ����9:23:11 
* ��˵�� 
* OpenitemServiceImpl : OpenitemService ��ʵ����
*/ 
//@Service
public class OpenitemServiceImpl implements OpenitemService {
    //@Autowired
	private OpenitemDao openitemDao;
    /**
	 * getOpenitems ����ѯ�����ѷ�������Ŀ
	 * @return
	 */
	@Override
	public List<Openitem> getOpenitems() {
		// TODO Auto-generated method stub
		List<Openitem> openitems = openitemDao.getOpenitems();
		return openitems;
	}
	 /**
     * addOpenitem �� ���һ��Ҫ��������Ŀ
     * @param openitem ��Ҫ��������Ŀ
     * @return
     */  
	@Override
	public int addOpenitem(Openitem openitem) {
		// TODO Auto-generated method stub
		int flag = openitemDao.addOpenitem(openitem);
		return flag;
	}

}
