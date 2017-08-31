package com.web.hgh;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.fastjson.JSON;
import com.entity.Combo;
import com.service.hgh.ComboService;

@Controller
@RequestMapping("/hehe")
public class ComboController {
	@Autowired
	private ComboService comboService;
	@RequestMapping("queryCombo")
	public void queryCombo(HttpServletResponse response){
		List<Combo>list=comboService.queryCombo();
		try {
			response.getWriter().print(JSON.toJSONString(list));
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
