package com.toughguy.cityDisplay.service.content.prototype;

import java.util.List;

import com.toughguy.cityDisplay.model.content.RecGrade;
import com.toughguy.cityDisplay.service.prototype.IGenericService;

public interface IRecGradeService extends IGenericService<RecGrade, Integer> {
	
	//修改地图等级
	public String alterGrade(List<RecGrade> list);

	public List<RecGrade> selectAll();
	
	public void alterGrade(RecGrade grade);
	
	public void updateGrade(RecGrade grade);
}
