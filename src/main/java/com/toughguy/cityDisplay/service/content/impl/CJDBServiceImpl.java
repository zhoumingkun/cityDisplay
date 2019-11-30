package com.toughguy.cityDisplay.service.content.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toughguy.cityDisplay.model.content.CJDB;
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
		}
		if(list==null || list.equals(null)) {
			List<CJDB> c = new ArrayList<CJDB>();
			return c;
		}
		return list;
	}
}
