package com.toughguy.cityDisplay.service.content.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toughguy.cityDisplay.model.content.CJDB;
import com.toughguy.cityDisplay.model.content.FKDB;
import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.persist.content.prototype.ICJDBDao;
import com.toughguy.cityDisplay.service.content.prototype.ICJDBService;
import com.toughguy.cityDisplay.service.impl.GenericServiceImpl;

@Service
public class CJDBServiceImpl extends GenericServiceImpl<CJDB, Integer> implements ICJDBService {
	@Autowired
	private ICJDBDao cjdbDaoImpl;

	@Override
	public List<CJDB> findALbyId(String jjdbh) {
		// TODO Auto-generated method stub
		List<CJDB> list = cjdbDaoImpl.findALbyId(jjdbh);
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getJQZTDM()!=null && list.get(i).getJQZTDM()!=" " && !list.get(i).getJQZTDM().equals(null)) {
				 CJDB cjdb = cjdbDaoImpl.findJQZTDM(list.get(i));
				 list.get(i).setJQZTDM(cjdb.getJQZTDM());
			 }
			if(list.get(i).getXZQHDM()!=null && list.get(i).getXZQHDM()!=" " && !list.get(i).getXZQHDM().equals(null)) {
				 CJDB j = new CJDB();
				 j.setXZQHDM(list.get(i).getXZQHDM());
				 CJDB cjdb = cjdbDaoImpl.findXZQHDM(j);
				 list.get(i).setXZQHDM(cjdb.getXZQHDM());
			 }	
		}
		return list;
	}
}
