package com.toughguy.cityDisplay.persist.content.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.FKDB;
import com.toughguy.cityDisplay.persist.content.prototype.IFKDBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;

@Repository
public class FKDBImpl extends GenericDaoImpl<FKDB, Integer> implements IFKDBDao{

	@Override
	public List<FKDB> findALbyId(String jjdbh) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(typeNameSpace + ".findALbyId", jjdbh);
	}

	@Override
	public FKDB findDL(FKDB fkdb) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(typeNameSpace + ".findDL", fkdb);
	}

	@Override
	public FKDB findJQDJDM(FKDB fkdb) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(typeNameSpace + ".findJQDJDM", fkdb);
	}

	@Override
	public FKDB findCLJGDM(FKDB fkdb) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(typeNameSpace + ".findCLJGDM", fkdb);
	}

	@Override
	public FKDB findJQZTDM(FKDB fkdb) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(typeNameSpace + ".findJQZTDM", fkdb);
	}

	@Override
	public FKDB findXZQHDM(FKDB fkdb) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(typeNameSpace + ".findXZQHDM", fkdb);
	}

}
