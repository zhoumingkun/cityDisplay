package com.toughguy.cityDisplay.persist.content.prototype;


import java.util.List;
import java.util.Map;

import com.toughguy.cityDisplay.model.content.DictBJFSDMB;
import com.toughguy.cityDisplay.model.content.DictUsers;
import com.toughguy.cityDisplay.model.content.DictXZQHB;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

/**
 * 字典表-用户代码表Dao接口类
 * @author zmk
 *
 */
public interface IDictUsersDao extends IGenericDao<DictUsers, Integer> {
	
	public List<DictUsers> findUsers(String userName);
	
	
}
