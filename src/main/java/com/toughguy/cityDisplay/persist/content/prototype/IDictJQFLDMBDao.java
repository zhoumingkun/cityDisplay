package com.toughguy.cityDisplay.persist.content.prototype;
import java.util.List;
import java.util.Map;

import com.toughguy.cityDisplay.model.content.DictJQFLDMB;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

/**
 * 字典表-警情分类代码表Dao接口类
 * @author zmk
 *
 */
public interface IDictJQFLDMBDao extends IGenericDao<DictJQFLDMB, Integer> {
	
	public List<DictJQFLDMB> findAll();
	
	
}
