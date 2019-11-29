package com.toughguy.cityDisplay.persist.content.prototype;

import java.util.List;
import java.util.Map;

import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.model.content.RecJQTJB;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

public interface IJJDBDao extends IGenericDao<JJDB, Integer> {
	
	//查询某个类型的案件列表
	public List<JJDB>  findJQLXDMaj(Map<String,String> map);
	
	
	//查询某个类型的案件列表
	public List<JJDB>  findALbyId(Map<String,String> map);

}
