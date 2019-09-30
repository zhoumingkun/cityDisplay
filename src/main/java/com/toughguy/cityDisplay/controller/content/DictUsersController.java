package com.toughguy.cityDisplay.controller.content;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toughguy.cityDisplay.model.content.DictUsers;
import com.toughguy.cityDisplay.model.content.DictXZQHB;
import com.toughguy.cityDisplay.model.content.RecGrade;
import com.toughguy.cityDisplay.model.content.RecJQTJB;
import com.toughguy.cityDisplay.pagination.PagerModel;
import com.toughguy.cityDisplay.persist.content.prototype.IDictXZQHBDao;
import com.toughguy.cityDisplay.service.content.prototype.IDictUsersService;
import com.toughguy.cityDisplay.service.content.prototype.IDictXZQHBService;

@RestController
@RequestMapping(value = "/dictUsers")
public class DictUsersController {
	@Autowired
	private IDictUsersService dictUsersService;
	
	
	/**
	 * 查询全部用户信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findUsers")
//	@RequiresPermissions("dictXZQHB:getById")
	public Map<String,Object> findUsers(String userName) {
		List<DictUsers> findUsers = dictUsersService.findUsers(userName);
		Map<String,Object> fmap = new HashMap<>();
		for(int i=0;i<findUsers.size();i++) {
			fmap.put("用户名字", findUsers.get(i).getNick_name()+"");
			String xzqhdm=findUsers.get(i).getDept_no()+"";
			xzqhdm.substring(0, 4);
			fmap.put("行政区划", xzqhdm.substring(0, 4)+"");	
		}
		return fmap;
	}
	
	
}
