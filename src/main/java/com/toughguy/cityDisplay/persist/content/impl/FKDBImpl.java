package com.toughguy.cityDisplay.persist.content.impl;

import org.springframework.stereotype.Repository;

import com.toughguy.cityDisplay.model.content.FKDB;
import com.toughguy.cityDisplay.persist.content.prototype.IFKDBDao;
import com.toughguy.cityDisplay.persist.impl.GenericDaoImpl;

@Repository
public class FKDBImpl extends GenericDaoImpl<FKDB, Integer> implements IFKDBDao{

}
