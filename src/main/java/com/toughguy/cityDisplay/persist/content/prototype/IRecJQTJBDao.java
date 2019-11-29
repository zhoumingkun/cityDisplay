package com.toughguy.cityDisplay.persist.content.prototype;
import java.util.List;
import java.util.Map;

import com.toughguy.cityDisplay.model.content.RecJQTJB;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

/**
 * 统计表表-警情统计表  Dao接口类
 * @author zmk
 *
 */
public interface IRecJQTJBDao extends IGenericDao<RecJQTJB, Integer> {
	
	//查询警情统计监测 （今日首页）
	public List<RecJQTJB>  findJQNum(String tjTime);
	
	//查询近七天警情统计（首页）
	public List<RecJQTJB>  findJQSevenDayShen(Map<String,String> map);
	
	//查询各行政区划警情数量（当日地图）
	public List<RecJQTJB>  findXZQHNum(String tjTime);
	
	
	//查询各行政区划警情数量环比
	public List<RecJQTJB>  findNumHB(String tjTime);
		
	//查询全省警情数量环比
	public List<RecJQTJB>  findXZQHNumHB(Map<String,String> map);
	
	//查询各行政区划警情数量
	public List<RecJQTJB>  findJQNumEveryXZQH(Map<String,String> map);
	
	
	
	// 查询市级行政区划总数警情数量（市级方法）左上方法1（首页）--------------------------市级方法--------------------------------------
	public List<RecJQTJB>  findJQNumSJ(Map<String,String> map);
	
	// 查询市级各地区警情数量（市级方法）左下
	public List<RecJQTJB>  findJQNumEverySJ(Map<String,String> map);
	
	
}
