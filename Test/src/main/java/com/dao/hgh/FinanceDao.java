package com.dao.hgh;

import java.util.List;

import com.entity.Finance;

public interface FinanceDao {
	public void addFinance(Finance fe);
	public List<Finance>queryFinance();
}
