package com.service.imp.who;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dao.who.ConsumerDao;
import com.entity.Consumer;
import com.service.who.ConsumerService;
/**  
* @Title: CousumerServiceImp.java  
* @Package com.service.imp  
* @Description: 后台登录控制器接口具体实现类
* @author who  
* @date 2017年8月30日  
*/  
@Controller
public class CousumerServiceImp implements ConsumerService {
	@Autowired
	private ConsumerDao conDao;//登录dao接口
	
	//执行查询
	@Override
	public List<Consumer> queryConsumer() {
		// TODO Auto-generated method stub
		return conDao.queryConsumer();
	}

}
