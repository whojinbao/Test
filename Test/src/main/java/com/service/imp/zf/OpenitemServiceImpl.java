package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.OpenitemDao;
import com.entity.Openitem;
import com.service.zf.OpenitemService;

/** 
* @author 作者 郑飞: 
* @version 创建时间：2017年8月30日 上午9:23:11 
* 类说明 
* OpenitemServiceImpl : OpenitemService 的实现类
*/ 
//@Service
public class OpenitemServiceImpl implements OpenitemService {
    //@Autowired
	private OpenitemDao openitemDao;
    /**
	 * getOpenitems ：查询所有已发布的项目
	 * @return
	 */
	@Override
	public List<Openitem> getOpenitems() {
		// TODO Auto-generated method stub
		List<Openitem> openitems = openitemDao.getOpenitems();
		return openitems;
	}
	 /**
     * addOpenitem ： 添加一个要发布的项目
     * @param openitem ：要发布的项目
     * @return
     */  
	@Override
	public int addOpenitem(Openitem openitem) {
		// TODO Auto-generated method stub
		int flag = openitemDao.addOpenitem(openitem);
		return flag;
	}

}
