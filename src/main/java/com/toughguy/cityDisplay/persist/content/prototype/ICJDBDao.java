package com.toughguy.cityDisplay.persist.content.prototype;

import java.util.List;

import com.toughguy.cityDisplay.model.content.CJDB;
import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

public interface ICJDBDao extends IGenericDao<CJDB, Integer> {

	//查询某个类型的案件详情
	public List<CJDB> findALbyId(String jjdbh);
	
	//根据警情状态代码查询对应汉字
	public CJDB findJQZTDM(CJDB cjdb);

	public CJDB findXZQHDM(CJDB j);
	
}
