package com.service.hgh;

import java.util.List;

import com.entity.Finance;
public interface FinanceService {
	public void addFinance(Finance fe);
	public List<Finance>queryFinance();
}
