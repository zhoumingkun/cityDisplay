package com.toughguy.cityDisplay.service.content.prototype;

import java.util.List;

import com.toughguy.cityDisplay.model.content.FKDB;
import com.toughguy.cityDisplay.service.prototype.IGenericService;

public interface IFKDBService extends IGenericService<FKDB, Integer> {

	//查询某个类型的案件详情
	 public List<FKDB> findALbyId(String jjdbh);
	

}
