package com.web.zf;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.entity.Openitem;
import com.service.zf.OpenitemService;

/** 
* @author ���� E-mail: 
* @version ����ʱ�䣺2017��8��30�� ����9:30:24 
* ��˵�� 
*/ 
 
//@Controller
//@RequestMapping("/")
public class OpenitemController {
    // @Autowired
	 public OpenitemService openitemservice;
     
     //@RequestMapping("/")
     public void getlist(@RequestBody String username,HttpServletResponse response){
     	try {
     		List<Openitem> list = openitemservice.getOpenitems();
     		
     			response.getWriter().print(JSON.toJSONString(list));
     			
     		response.getWriter().flush();
     		response.getWriter().close();
 		} catch (Exception e) {
 			// TODO: handle exception
 		}
     }
     //@RequestMapping("/")
   	public void additem(@RequestBody String str,HttpServletResponse response){
 		System.out.println(str);
 		Openitem openitem =  JSON.parseObject(str, Openitem.class);

 		int flag1 = openitemservice.addOpenitem(openitem);

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
