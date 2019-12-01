package com.toughguy.cityDisplay.service.content.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toughguy.cityDisplay.model.content.FKDB;
import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.persist.content.prototype.IFKDBDao;
import com.toughguy.cityDisplay.service.content.prototype.IFKDBService;
import com.toughguy.cityDisplay.service.impl.GenericServiceImpl;

@Service
public class FKDBServiceImpl extends GenericServiceImpl<FKDB, Integer> implements IFKDBService{
	@Autowired
	private IFKDBDao fkdbDaoImpl;

	@Override
	public List<FKDB> findALbyId(String jjdbh) {
		// TODO Auto-generated method stub
		List<FKDB> list = fkdbDaoImpl.findALbyId(jjdbh);
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getJQLBDM()!=null && list.get(i).getJQLBDM()!=" " && !list.get(i).getJQLBDM().equals(null)) {
				 FKDB j = new FKDB();
				 j.setJQLBDM(list.get(i).getJQLBDM());
				 FKDB fkdb = fkdbDaoImpl.findDL(j);
				 list.get(i).setJQLBDM(fkdb.getJQLBDM());
			 }
			 if(list.get(i).getJQLXDM()!=null && list.get(i).getJQLXDM()!=" " && !list.get(i).getJQLXDM().equals(null)) {
				 FKDB j = new FKDB();
				 j.setJQLBDM(list.get(i).getJQLXDM());
				 FKDB fkdb = fkdbDaoImpl.findDL(j);
				 list.get(i).setJQLXDM(fkdb.getJQLBDM());
			 }	    
			 if(list.get(i).getJQXLDM()!=null && list.get(i).getJQXLDM()!=" " && !list.get(i).getJQXLDM().equals(null)) {
				 FKDB j = new FKDB();
				 j.setJQLBDM(list.get(i).getJQXLDM());
				 FKDB fkdb = fkdbDaoImpl.findDL(j);
				 list.get(i).setJQXLDM(fkdb.getJQLBDM());
			 }	  
			 
			 
			 if(list.get(i).getJQDJDM()!=null && list.get(i).getJQDJDM()!=" " && !list.get(i).getJQDJDM().equals(null)) {
				 FKDB j = new FKDB();
				 j.setJQDJDM(list.get(i).getJQDJDM());
				 FKDB fkdb = fkdbDaoImpl.findJQDJDM(j);
				 list.get(i).setJQDJDM(fkdb.getJQDJDM());
			 }	
			 if(list.get(i).getCLJGDM()!=null && list.get(i).getCLJGDM()!=" " && !list.get(i).getCLJGDM().equals(null)) {
				 FKDB j = new FKDB();
				 j.setCLJGDM(list.get(i).getCLJGDM());
				 FKDB fkdb = fkdbDaoImpl.findCLJGDM(j);
				 list.get(i).setCLJGDM(fkdb.getCLJGDM());
			 }	
			 if(list.get(i).getJQZTDM()!=null && list.get(i).getJQZTDM()!=" " && !list.get(i).getJQZTDM().equals(null)) {
				 FKDB j = new FKDB();
				 j.setJQZTDM(list.get(i).getJQZTDM());
				 FKDB fkdb = fkdbDaoImpl.findJQZTDM(j);
				 list.get(i).setJQZTDM(fkdb.getJQZTDM());
			 }	
			 if(list.get(i).getXZQHDM()!=null && list.get(i).getXZQHDM()!=" " && !list.get(i).getXZQHDM().equals(null)) {
				 FKDB j = new FKDB();
				 j.setXZQHDM(list.get(i).getXZQHDM());
				 FKDB fkdb = fkdbDaoImpl.findXZQHDM(j);
				 list.get(i).setXZQHDM(fkdb.getXZQHDM());
			 }	
			 
		}
		return list;
	}
	

}
