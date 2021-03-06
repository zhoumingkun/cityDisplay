package com.toughguy.cityDisplay.persist.content.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.RecJQTJB;
import com.toughguy.cityDisplay.persist.content.prototype.IRecJQTJBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;
/**
 * 统计表表-警情统计表 Dao实现类
 * @author zmk
 *
 */
@Repository
public class RecJQTJBImp extends GenericDaoImpl<RecJQTJB, Integer> implements IRecJQTJBDao{
	
	@Override
	public List<RecJQTJB> findJQNum(String tjTime) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findJQNum", tjTime);
	}
	
	@Override
	public List<RecJQTJB> findJQSevenDayShen(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findJQSevenDayShen", map);
	}
	
	@Override
	public List<RecJQTJB> findXZQHNum(String tjTime) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findXZQHNum", tjTime);
	}
	
	@Override
	public List<RecJQTJB> findXZQHNumHB(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findXZQHNumHB", map);
	}
	
	@Override
	public List<RecJQTJB> findNumHB(String tjTime) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findNumHB", tjTime);
	}

	@Override
	public List<RecJQTJB> findJQNumEveryXZQH(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findJQNumEveryXZQH", map);
	}
//----------------------------------------市级方法-----------------------------------------------
	@Override
	public List<RecJQTJB> findJQNumSJ(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findJQNumSJ", map);
	}

	@Override
	public List<RecJQTJB> findJQNumEverySJ(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findJQNumEverySJ", map);
	}

	

	
	
}
