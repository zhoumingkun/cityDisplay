package com.toughguy.cityDisplay.persist.content.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.RecJJLXTJB;
import com.toughguy.cityDisplay.persist.content.prototype.IRecJJLXTJBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;
/**
 * 统计表表-接警类型统计表 Dao实现类
 * @author zmk
 *
 */
@Repository
public class RecJJLXTJBImp extends GenericDaoImpl<RecJJLXTJB, Integer> implements IRecJJLXTJBDao{
	
	@Override
	public List<RecJJLXTJB> findJJLXShen(String tjTime) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findJJLXShen",tjTime);
	}

	@Override
	public List<RecJJLXTJB> findJJLXSevenDayShen(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findJJLXSevenDayShen",map);
	}
	
	@Override
	public List<RecJJLXTJB> findAlarmData(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findAlarmData", map);
	}

	@Override
	public List<RecJJLXTJB> findAlarmDataXZQH(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findAlarmDataXZQH", map);
	}

	@Override
	public List<RecJJLXTJB> findCityAlarmData(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findCityAlarmData", map);
	}

	
	
}
