package com.toughguy.cityDisplay.persist.content.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.DictLHLXDMB;
import com.toughguy.cityDisplay.persist.content.prototype.IDictLHLXDMBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;
/**
 * 字典表 来话类型代码表 Dao实现类
 * @author zmk
 *
 */
@Repository
public class DictLHLXDMBImpl extends GenericDaoImpl<DictLHLXDMB, Integer> implements IDictLHLXDMBDao{
	
	@Override
	public List<DictLHLXDMB> findAll() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findAll");
	}

	
	
}
