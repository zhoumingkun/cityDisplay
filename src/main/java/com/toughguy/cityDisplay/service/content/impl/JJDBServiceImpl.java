package com.toughguy.cityDisplay.service.content.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.persist.content.prototype.IJJDBDao;
import com.toughguy.cityDisplay.service.content.prototype.IJJDBService;
import com.toughguy.cityDisplay.service.impl.GenericServiceImpl;


@Service
public class JJDBServiceImpl extends GenericServiceImpl<JJDB, Integer> implements IJJDBService {

	@Autowired
	IJJDBDao  JJDBDao;
	
	@Override
	public List<JJDB> findJQLXDMaj(String jqlxdm, String tjTime, String xzqhdm) {
		// TODO Auto-generated method stub
		Map<String ,String> map = new HashMap<String, String>();
		map.put("jqlxdm", jqlxdm);
		map.put("tjTime", tjTime);
		map.put("xzqhdm", xzqhdm);
		return JJDBDao.findJQLXDMaj(map);
	}

	@Override
	public List<JJDB> findALbyId(String jjdbh) {
		// TODO Auto-generated method stub
		Map<String ,String> map = new HashMap<String, String>();
		map.put("jjdbh", jjdbh);
		return JJDBDao.findALbyId(map);
	}

}
