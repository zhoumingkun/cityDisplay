package com.toughguy.cityDisplay.service.content.prototype;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.toughguy.cityDisplay.model.content.RecJQTJB;
import com.toughguy.cityDisplay.service.prototype.IGenericService;

/**
 * 统计表表-警情统计表 Service层接口类
 * @author zmk
 *
 */
public interface IRecJQTJBService extends IGenericService<RecJQTJB, Integer>{
	
	    //查询警情统计监测 （今日首页）
		public List<RecJQTJB>  findJQNum(String tjTime);
		
		//查询近七天警情统计（首页）
		public List<RecJQTJB>  findJQSevenDayShen(String startTime,String endTime);
		
		//查询各行政区划警情数量（当日地图）
		public List<RecJQTJB>  findXZQHNum(String tjTime);
		
		//查询各行政区划警情数量环比
		public List<RecJQTJB>  findNumHB(String tjTime);
			
		//查询全省警情数量环比
		public List<RecJQTJB>  findXZQHNumHB(String tjTime,String xzqhdm);
		
		//查询行政区划警情数量环比
		public List<RecJQTJB>  findJQNumEveryXZQH(String tjTime,String xzqhdm);
		
		
		//查询市级行政区划总数警情数量（市级方法）左上方法1（首页）----------------------市级方法-----------------------------------------
		public List<RecJQTJB>  findJQNumSJ(String tjTime,String xzqhdm);
				
	    //查询市级各地区警情数量（市级方法）左下
		public List<RecJQTJB>  findJQNumEverySJ(String tjTime,String xzqhdm);
		
}
