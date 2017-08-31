package com.web.cq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.alibaba.fastjson.JSON;
import com.entity.Investitem;
import com.service.imp.cq.InvestitemService;

@Controller
public class InvestitemWeb {
	@Autowired
	private InvestitemService InvestitemService;
	public void addInvestitem(@RequestBody String json){
		Investitem ie=JSON.parseObject(json, Investitem.class);
		InvestitemService.addInvestitem(ie);
	}
}
