package com.toughguy.cityDisplay.service.content.prototype;

import java.util.List;

import com.toughguy.cityDisplay.model.content.JJDB;
import com.toughguy.cityDisplay.model.content.RecJQTJB;
import com.toughguy.cityDisplay.service.prototype.IGenericService;

public interface IJJDBService extends IGenericService<JJDB, Integer>  {
	
	public List<JJDB>  findJQLXDMaj(String jqlxdm,String tjTime,String xzqhdm);
	
	public List<JJDB>  findALbyId(String jjdbh);

}
