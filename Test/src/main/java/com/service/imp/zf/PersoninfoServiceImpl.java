package com.service.imp.zf;

import com.dao.zf.PersoninfoDao;
import com.entity.Personinfo;
import com.service.zf.PersoninfoService;

/** 
* @author ���� :֣�� 
* @version ����ʱ�䣺2017��8��31�� ����11:31:48 
* ��˵�� 
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
