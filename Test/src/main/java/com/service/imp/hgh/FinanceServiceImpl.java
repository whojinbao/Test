package com.service.imp.hgh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.hgh.FinanceDao;
import com.entity.Finance;
import com.service.hgh.FinanceService;
@Service
public class FinanceServiceImpl implements FinanceService {
	@Autowired
	private FinanceDao financedao;
	public void addFinance(Finance fe) {
		// TODO Auto-generated method stub
		financedao.addFinance(fe);
	}

	@Override
	public List<Finance> queryFinance() {
		// TODO Auto-generated method stub
		return financedao.queryFinance();
	}

}
