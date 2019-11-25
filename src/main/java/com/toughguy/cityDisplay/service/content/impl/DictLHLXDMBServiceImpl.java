package com.toughguy.cityDisplay.service.content.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.toughguy.cityDisplay.model.content.DictLHLXDMB;
import com.toughguy.cityDisplay.persist.content.prototype.IDictLHLXDMBDao;
import com.toughguy.cityDisplay.service.content.prototype.IDictLHLXDMBService;
import com.toughguy.cityDisplay.service.impl.GenericServiceImpl;
import com.toughguy.cityDisplay.util.POIUtils;


/**
 * 字典表 来话类型代码表 Service实现类
 * @author zmk
 *
 */
@Service
public class DictLHLXDMBServiceImpl extends GenericServiceImpl<DictLHLXDMB, Integer> implements IDictLHLXDMBService{
	
	
	@Autowired
	IDictLHLXDMBDao  dictLHLXDMBDao;
	
	@Override
	public List<DictLHLXDMB> findAll(){
		// TODO Auto-generated method stub
		return dictLHLXDMBDao.findAll();
	}

	
			            
			           
				            
				            

}
