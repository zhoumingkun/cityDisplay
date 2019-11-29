package com.toughguy.cityDisplay.controller.content;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.model.content.RecJQFLTJB;
import com.toughguy.cityDisplay.service.content.prototype.IJJDBService;
import com.toughguy.cityDisplay.service.content.prototype.IRecJQFLTJBService;

@RestController
@RequestMapping("/JJDB")
public class JJDBController {
	
	@Autowired
	private IJJDBService JJDBService;
	
	
	/**
	 * 查询某个类型的案件列表
	 * @param tjTime 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findJQLXDMaj")
//	@RequiresPermissions("dictXZQHB:getById")
	public List<JJDB> findJQLXDMaj(String jqlxdm, String tjTime, String xzqhdm) {
		return  JJDBService.findJQLXDMaj(jqlxdm,tjTime,xzqhdm);
	}
	
	
	/**
	 * 查询某个类型的案件详情
	 * @param tjTime 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findALbyId")
//	@RequiresPermissions("dictXZQHB:getById")
	public List<JJDB> findALbyId(String jjdbh) {
		return  JJDBService.findALbyId(jjdbh);
	}

}
