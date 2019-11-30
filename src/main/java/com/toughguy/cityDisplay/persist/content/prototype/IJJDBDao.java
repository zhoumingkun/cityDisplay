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
	
	//根据报警方式代码查询文字描述
	public JJDB findBJFSMC (JJDB jjdb);
	
	//根据来话类型代码查询文字描述
	public JJDB findLHLXMC (JJDB jjdb);
	
	//根据接警类型代码查询文字描述
	public JJDB findJJLXMC (JJDB jjdb);
	
	//根据大类分类细类代码查询文字描述
	public JJDB findDL (JJDB jjdb);
	
	

}
