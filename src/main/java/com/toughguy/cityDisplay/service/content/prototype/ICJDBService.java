package com.toughguy.cityDisplay.service.content.prototype;

import java.util.List;

import com.toughguy.cityDisplay.model.content.CJDB;
import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.service.prototype.IGenericService;

public interface ICJDBService extends IGenericService<CJDB, Integer> {

	//查询某个类型的案件详情
	public List<CJDB> findALbyId(String jjdbh);
	

}
