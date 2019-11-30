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
		List<JJDB> list = JJDBDao.findJQLXDMaj(map);
		return list;
	}

	@Override
	public List<JJDB> findALbyId(String jjdbh) {
		// TODO Auto-generated method stub
		Map<String ,String> map = new HashMap<String, String>();
		map.put("jjdbh", jjdbh);
		List<JJDB> list = JJDBDao.findALbyId(map);
		for(int i=0;i<list.size();i++) {
			 if(list.get(i).getBJFSDM()!=null && list.get(i).getBJFSDM()!=" " && !list.get(i).getBJFSDM().equals(null)) {
				 JJDB jjdb = JJDBDao.findBJFSMC(list.get(i));
				 list.get(i).setBJFSDM(jjdb.getBJFSDM());
			 }
			 if(list.get(i).getLHLX()!=null && list.get(i).getLHLX()!=" " && !list.get(i).getLHLX().equals(null)) {
				 JJDB jjdb = JJDBDao.findLHLXMC(list.get(i));
				 list.get(i).setLHLX(jjdb.getLHLX());
			 }
			 if(list.get(i).getJJLX()!=null && list.get(i).getJJLX()!=" " && !list.get(i).getJJLX().equals(null)) {
				 JJDB jjdb = JJDBDao.findJJLXMC(list.get(i));
				 list.get(i).setJJLX(jjdb.getJJLX());
			 }
			 if(list.get(i).getJQLBDM()!=null && list.get(i).getJQLBDM()!=" " && !list.get(i).getJQLBDM().equals(null)) {
				 JJDB j = new JJDB();
				 j.setJQLBDM(list.get(i).getJQLBDM());
				 JJDB jjdb = JJDBDao.findDL(j);
				 list.get(i).setJQLBDM(jjdb.getJQLBDM());
			 }
			 if(list.get(i).getJQLXDM()!=null && list.get(i).getJQLXDM()!=" " && !list.get(i).getJQLXDM().equals(null)) {
				 JJDB j = new JJDB();
				 j.setJQLBDM(list.get(i).getJQLXDM());
				 JJDB jjdb = JJDBDao.findDL(j);
				 list.get(i).setJQLXDM(jjdb.getJQLBDM());
			 }	    
			 if(list.get(i).getJQXLDM()!=null && list.get(i).getJQXLDM()!=" " && !list.get(i).getJQXLDM().equals(null)) {
				 JJDB j = new JJDB();
				 j.setJQLBDM(list.get(i).getJQXLDM());
				 JJDB jjdb = JJDBDao.findDL(j);
				 list.get(i).setJQXLDM(jjdb.getJQLBDM());
			 }	    
		}
		return list ;
	}

}
