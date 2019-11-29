package com.toughguy.cityDisplay.persist.content.impl;

import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.CJDB;
import com.toughguy.cityDisplay.persist.content.prototype.ICJDBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;

@Repository
public class CJDBImpl extends GenericDaoImpl<CJDB, Integer> implements ICJDBDao{

}
