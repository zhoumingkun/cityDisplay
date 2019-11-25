package com.toughguy.cityDisplay.persist.content.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.DictJJLXDMB;
import com.toughguy.cityDisplay.persist.content.prototype.IDictJJLXDMBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;
/**
 * 字典表-接警类型代码表Dao实现类
 * @author zmk
 *
 */
@Repository
public class DictJJLXDMBImpl extends GenericDaoImpl<DictJJLXDMB, Integer> implements IDictJJLXDMBDao{
	
	@Override
	public List<DictJJLXDMB> findAll() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findAll");
	}

	
	
}
