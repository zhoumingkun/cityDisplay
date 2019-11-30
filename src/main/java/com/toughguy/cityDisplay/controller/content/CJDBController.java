package com.toughguy.cityDisplay.controller.content;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.toughguy.cityDisplay.model.content.CJDB;
import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.service.content.prototype.ICJDBService;

@RestController
@RequestMapping("/CJDB")
public class CJDBController {
	@Autowired
	private ICJDBService cjdbServiceImpl;
	
	/**
	 * 查询某个类型的案件详情
	 * @param tjTime 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findALbyId")
//	@RequiresPermissions("dictXZQHB:getById")
	public List<CJDB> findALbyId(String jjdbh) {
		return  cjdbServiceImpl.findALbyId(jjdbh);
	}
	
}
