package com.web.cq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Itemarea;
import com.entity.Itemtype;
import com.service.imp.cq.ItemareaService;
import com.service.imp.cq.ItemtypeService;

@Controller
public class Itemtypeweb {
	/*
	 *查询每个项目类型有哪些项目
	 *查询每个地区有哪些项目
	 */
	@Autowired
	private ItemtypeService ItemtypeService;
	@Autowired
	private ItemareaService ItemareaService;
	@RequestMapping(value="/item")
	public String queryItemtype(Model mm){
		List<Itemtype> lItemtype=ItemtypeService.queryItemtype();
		List<Itemarea> lItemarea=ItemareaService.queryItemarea();
		mm.addAttribute("lItemtype", lItemtype);
		mm.addAttribute("lItemarea", lItemarea);
		return "Cq/item";
	}
	
}
