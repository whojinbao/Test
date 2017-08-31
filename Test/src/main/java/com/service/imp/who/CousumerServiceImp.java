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
* @Description: ��̨��¼�������ӿھ���ʵ����
* @author who  
* @date 2017��8��30��  
*/  
@Controller
public class CousumerServiceImp implements ConsumerService {
	@Autowired
	private ConsumerDao conDao;//��¼dao�ӿ�
	
	//ִ�в�ѯ
	@Override
	public List<Consumer> queryConsumer() {
		// TODO Auto-generated method stub
		return conDao.queryConsumer();
	}

}
