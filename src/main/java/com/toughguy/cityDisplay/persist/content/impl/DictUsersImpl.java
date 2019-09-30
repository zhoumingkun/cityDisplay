package com.toughguy.cityDisplay.persist.content.impl;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.DictUsers;
import com.toughguy.cityDisplay.model.content.DictXZQHB;
import com.toughguy.cityDisplay.model.content.RecGrade;
import com.toughguy.cityDisplay.persist.content.prototype.IDictUsersDao;
import com.toughguy.cityDisplay.persist.content.prototype.IDictXZQHBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;
/**
 * 字典表-用户表Dao实现类
 * @author zmk
 *
 */
@Repository
public class DictUsersImpl extends GenericDaoImpl<DictUsers, Integer> implements IDictUsersDao{
	
	@Override
	public List<DictUsers> findUsers(String userName) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findUsers",userName);
	}


	
	
}
