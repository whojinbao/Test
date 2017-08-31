package com.service.imp.hgh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.hgh.ComboDao;
import com.entity.Combo;
import com.service.hgh.ComboService;
@Service
public class ComboServiceImpl implements ComboService {
	@Autowired
	private ComboDao combodao;
	@Override
	public List<Combo> queryCombo() {
		// TODO Auto-generated method stub
		return combodao.queryCombo();
	}

}
