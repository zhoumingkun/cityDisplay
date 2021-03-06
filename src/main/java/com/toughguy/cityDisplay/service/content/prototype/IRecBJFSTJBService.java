package com.toughguy.cityDisplay.service.content.prototype;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.toughguy.cityDisplay.model.content.RecBJFSTJB;
import com.toughguy.cityDisplay.model.content.RecJJLXTJB;
import com.toughguy.cityDisplay.service.prototype.IGenericService;

/**
 * 统计表表-报警方式统计表 Service层接口类
 * @author zmk
 *
 */
public interface IRecBJFSTJBService extends IGenericService<RecBJFSTJB, Integer>{
	
	//查询今日报警方式 （首页）
	public List<RecBJFSTJB>  findBJFSShen(String tjTime);
	
	//查询报警方式七天全省 （首页）
	public Map<String, Object>  findBJFSSevenDayShen(String startTime,String endTime);
	

	//查询报警方式省页面全部数据
	public Map<String, Object> findSAlarmMode(String startTime, String endTime);
	
	//查询地级市报警方式页面全部数据
	public Map<String, Object> findCityAlarmMode(String startTime, String endTime,String xzqhdm);
}
