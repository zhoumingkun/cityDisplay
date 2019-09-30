package com.toughguy.cityDisplay.model.content;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.toughguy.cityDisplay.model.AbstractModel;
import com.toughguy.cityDisplay.util.JsonUtil;

/**
 *字典表-用户代码表 实体类
 * @author ZMK
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL) //为空字段不返回
public class DictUsers  {
	private String user_name;    //身份证号
	private String nick_name;    //用户姓名
	private String dept_no;      //行政区划
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getDept_no() {
		return dept_no;
	}
	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}
	@Override
	public String toString() {
		return "DictUsers [user_name=" + user_name + ", nick_name=" + nick_name + ", dept_no=" + dept_no + "]";
	}
	
	
	
	

	
	

	
}
