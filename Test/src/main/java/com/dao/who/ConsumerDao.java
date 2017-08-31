package com.dao.who;


import java.util.List;

import com.entity.Consumer;

/**  
* @Title: ConsumerDao.java  
* @Package com.dao.hu  
* @Description: 用户登录查询用户接口  
* @author who  
* @date 2017年8月30日  
*/  
public interface ConsumerDao {
	public List<Consumer> queryConsumer();	
}
