package com.toughguy.cityDisplay.persist.content.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.CJDB;
import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.persist.content.prototype.ICJDBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;

@Repository
public class CJDBImpl extends GenericDaoImpl<CJDB, Integer> implements ICJDBDao{

	@Override
	public List<CJDB> findALbyId(String jjdbh) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findALbyId",jjdbh);
	}

	@Override
	public CJDB findJQZTDM(CJDB cjdb) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(typeNameSpace + ".findJQZTDM",cjdb);
	}

	@Override
	public CJDB findXZQHDM(CJDB cjdb) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(typeNameSpace + ".findXZQHDM",cjdb);
	}

}
