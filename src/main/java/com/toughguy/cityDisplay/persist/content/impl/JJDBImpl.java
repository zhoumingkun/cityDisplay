package com.toughguy.cityDisplay.persist.content.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.model.content.RecJQTJB;
import com.toughguy.cityDisplay.persist.content.prototype.IJJDBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;


@Repository
public class JJDBImpl extends GenericDaoImpl<JJDB, Integer> implements IJJDBDao{
	
	//----------------------------------------市级方法-----------------------------------------------
		@Override
		public List<JJDB> findJQLXDMaj(Map<String, String> map) {
			// TODO Auto-generated method stub
			return sqlSessionTemplate.selectList(typeNameSpace + ".findJQLXDMaj", map);
		}

		@Override
		public List<JJDB> findALbyId(Map<String, String> map) {
			// TODO Auto-generated method stub
			return sqlSessionTemplate.selectList(typeNameSpace + ".findALbyId", map);
		}

}
