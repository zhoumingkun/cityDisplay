package com.toughguy.cityDisplay.persist.content.prototype;


import java.util.List;
import java.util.Map;

import com.toughguy.cityDisplay.model.content.DictBJFSDMB;
import com.toughguy.cityDisplay.model.content.DictJJLXDMB;
import com.toughguy.cityDisplay.model.content.DictXZQHB;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

/**
 * 字典表-接警类型代码表Dao接口类
 * @author zmk
 *
 */
public interface IDictJJLXDMBDao extends IGenericDao<DictJJLXDMB, Integer> {
	
	public List<DictJJLXDMB> findAll();
	
	
}
