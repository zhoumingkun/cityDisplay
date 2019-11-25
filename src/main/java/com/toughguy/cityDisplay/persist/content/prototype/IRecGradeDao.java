package com.toughguy.cityDisplay.persist.content.prototype;

import java.util.List;

import com.toughguy.cityDisplay.model.content.RecGrade;
import com.toughguy.cityDisplay.persist.prototype.IGenericDao;

public interface IRecGradeDao extends IGenericDao<RecGrade, Integer>  {

	
	//修改地图等级
	public void alterGrade(RecGrade grade);

	public List<RecGrade> selectAll();
	
	public void updateGrade(RecGrade grade);
}
