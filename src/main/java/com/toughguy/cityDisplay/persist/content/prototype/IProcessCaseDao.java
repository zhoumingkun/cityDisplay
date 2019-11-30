package com.toughguy.cityDisplay.persist.content.prototype;


import java.util.List;
import java.util.Map;

import com.toughguy.cityDisplay.model.content.ProcessCase;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

public interface IProcessCaseDao extends IGenericDao<ProcessCase, Integer> {
	
	//查询当天立案总数
	public ProcessCase findTotal(String lasj);

	//查询案件类别
	public List<ProcessCase> findCaseCategory(String lasj);
	
	//查询地级市的立案数
	public List<ProcessCase> findCityCaseNum(String lasj);
	
	//查询启邦首页
	public List<ProcessCase> findProcessCaseHB(String tjTime);
	
	//查询地级市的立案数（市级）
	public List<ProcessCase> findEveryCityCaseNum(Map<String,String> map);

}
