package com.service.imp.cq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.InvestitemDao;
import com.entity.Investitem;
import com.entity.Openitem;
import com.entity.Userinfo;
@Service
public class InvestitemImpl implements InvestitemService{
	@Autowired
	private InvestitemDao InvestitemDao;
	@Autowired
	private Openitem om;
	@Autowired
	private Userinfo uf;
	public int addInvestitem(Investitem ie){
		//添加投资人，投资项目，投资金额
		if(om.getItemId()==ie.getItemId() && uf.getUserId()==ie.getUserId()){
				return InvestitemDao.addInvestitem(ie);
		}
		else{
			return  0;
		}
	}

}
