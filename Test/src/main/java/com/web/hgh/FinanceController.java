package com.web.hgh;


import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.entity.Finance;
import com.service.hgh.FinanceService;
@Controller
@RequestMapping("/hehe")
public class FinanceController {
	@Autowired
	private FinanceService financeService;
	@RequestMapping("/addFinance")
	public void addFinance(@RequestBody String data,HttpServletResponse response){
		Finance fe=JSON.parseObject(data,Finance.class );
		financeService.addFinance(fe);
		try {
			response.getWriter().println("ok");
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@RequestMapping("/queryFinance")
	public void queryFinance(HttpServletResponse response){
		List<Finance>list=financeService.queryFinance();
		try {
			response.getWriter().println(JSON.toJSONString(list));
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
