package com.toughguy.cityDisplay.service.content.prototype;

import java.util.List;
import java.util.Map;

import com.toughguy.cityDisplay.model.content.ProcessCase;
import com.toughguy.cityDisplay.service.prototype.IGenericService;

public interface IProcessCaseService extends IGenericService<ProcessCase, Integer> {

	//查询全流程执法的数据
	public Map<String,Object> findProcessCase();

	//查询启邦首页立案总数环比百分比
	public Map<String, Object> findProcessCaseHB(String tjTime);
	
	//查询太原市的立案数
	public List<ProcessCase> findTYCaseNum(String lasj);
	
	//查询地级市的立案数（市级）
	public List<ProcessCase> findEveryCityCaseNum(String lasj, String xzqhdm);
}
