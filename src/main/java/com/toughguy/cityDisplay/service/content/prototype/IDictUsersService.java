package com.toughguy.cityDisplay.service.content.prototype;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.toughguy.cityDisplay.model.content.DictUsers;
import com.toughguy.cityDisplay.model.content.DictXZQHB;
import com.toughguy.cityDisplay.model.content.RecGrade;
import com.toughguy.cityDisplay.service.prototype.IGenericService;

/**
 * 字典表-用户表 Service层接口类
 * @author zmk
 *
 */
public interface IDictUsersService extends IGenericService<DictUsers, Integer>{
	
	public List<DictUsers> findUsers(String userName);
	
	
}
