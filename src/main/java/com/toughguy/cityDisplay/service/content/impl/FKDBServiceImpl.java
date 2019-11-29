package com.toughguy.cityDisplay.service.content.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toughguy.cityDisplay.model.content.FKDB;
import com.toughguy.cityDisplay.persist.content.prototype.IFKDBDao;
import com.toughguy.cityDisplay.service.content.prototype.IFKDBService;
import com.toughguy.cityDisplay.service.impl.GenericServiceImpl;

@Service
public class FKDBServiceImpl extends GenericServiceImpl<FKDB, Integer> implements IFKDBService{
	@Autowired
	private IFKDBDao fkdbDaoImpl;

}
