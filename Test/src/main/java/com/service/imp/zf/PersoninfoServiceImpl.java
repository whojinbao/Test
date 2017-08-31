package com.service.imp.zf;

import com.dao.zf.PersoninfoDao;
import com.entity.Personinfo;
import com.service.zf.PersoninfoService;

/** 
* @author 作者 :郑飞 
* @version 创建时间：2017年8月31日 上午11:31:48 
* 类说明 
*/ 
 
public class PersoninfoServiceImpl implements PersoninfoService{
   
	private PersoninfoDao personinfodao;
	@Override
	public int addPersoninfo(Personinfo personinfo) {
		// TODO Auto-generated method stub
		int flag = personinfodao.addPersoninfo(personinfo);
		return flag;
	}

	@Override
	public Personinfo selectPerson(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
