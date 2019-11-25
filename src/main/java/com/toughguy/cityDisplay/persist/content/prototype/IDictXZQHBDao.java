package com.toughguy.cityDisplay.persist.content.prototype;


import java.util.List;
import java.util.Map;

import com.toughguy.cityDisplay.model.content.DictXZQHB;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

/**
 * 字典表-行政区划表Dao接口类
 * @author zmk
 *
 */
public interface IDictXZQHBDao extends IGenericDao<DictXZQHB, Integer> {
	//查询行政区划全部数据
	public List<DictXZQHB> findAll();
	
	//修改行政区划表地图峰值的数据
	public void save(DictXZQHB xzqh);
	
	//修改行政区划表地图峰值的数据
	public void updateXZQH(DictXZQHB xzqh);
	
}
