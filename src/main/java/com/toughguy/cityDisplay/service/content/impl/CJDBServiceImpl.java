package com.toughguy.cityDisplay.service.content.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toughguy.cityDisplay.model.content.CJDB;
import com.toughguy.cityDisplay.persist.content.prototype.ICJDBDao;
import com.toughguy.cityDisplay.service.content.prototype.ICJDBService;
import com.toughguy.cityDisplay.service.impl.GenericServiceImpl;

@Service
public class CJDBServiceImpl extends GenericServiceImpl<CJDB, Integer> implements ICJDBService {
	@Autowired
	private ICJDBDao cjdbDaoImpl;
}
