package com.web.zf;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.alibaba.fastjson.JSON;
import com.entity.Userinfo;
import com.service.zf.UserinfoService;

/** 
 * @author 作者 :郑飞 
 * @version 创建时间：2017年8月31日 上午8:52:01 
 * 类说明 
 *  对用户表操作，从页面接受数据，传给service层
 */ 
//@Controller 
public class UserinfoController {
	//@Autowired
	public UserinfoService userinfoservice;

	public String getlist(HttpServletResponse response){
		List<Userinfo> list = userinfoservice.getUsers();
		try {
			response.getWriter().print(JSON.toJSONString(list));
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public void addUserinfo(@RequestBody String str,HttpServletResponse response){
		System.out.println(str);
		Userinfo userinfo =  JSON.parseObject(str, Userinfo.class);

		int flag1 = userinfoservice.addUser(userinfo);

		try {
			if(flag1 == 1){
				response.getWriter().write("succes");
			}else{
				response.getWriter().write("error");
			}
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
