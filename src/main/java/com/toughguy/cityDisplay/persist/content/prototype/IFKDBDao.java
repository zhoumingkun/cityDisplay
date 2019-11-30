package com.toughguy.cityDisplay.persist.content.prototype;

import java.util.List;

import com.toughguy.cityDisplay.model.content.FKDB;
import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

public interface IFKDBDao extends IGenericDao<FKDB, Integer>{

	//查询某个类型的案件详情
	public List<FKDB> findALbyId(String jjdbh);
	
	//根据大类分类细类代码查询文字描述
	public FKDB findDL (FKDB fkdb);
	
	//根据警情等级代码查询名称
	public FKDB findJQDJDM(FKDB fkdb);
	
	//根据处理结果代码查询名称
	public FKDB findCLJGDM(FKDB fkdb);
	
	//根据警情状态代码查询名称
	public FKDB findJQZTDM(FKDB fkdb);
}
