package com.toughguy.cityDisplay.controller.content;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toughguy.cityDisplay.model.content.ProcessCase;
import com.toughguy.cityDisplay.model.content.RecJQTJB;
import com.toughguy.cityDisplay.service.content.prototype.IProcessCaseService;

@RestController
@RequestMapping("/processHandling")
public class ProcessCaseController {
	
	@Autowired
	private IProcessCaseService processCaseService;
	
	@RequestMapping("/findProcessCase")
	public Map<String,Object> findProcessCase(){
		return processCaseService.findProcessCase();
	}
	
	@RequestMapping("/findProcessCaseHB")
	public Map<String,Object> findProcessCaseHB(String tjTime){
		return processCaseService.findProcessCaseHB(tjTime);
	}
	
	/**--------------------------市级方法------------------------------------------------------
	 * 
	 * 查询立案数环比(各地市)
	 * @param tjTime
	 * @return
	 */
	@RequestMapping("/findEveryCityCaseNum")
	
	public Map<String,Object> findEveryCityCaseNum(String lasj,String qtTime,String xzqhdm){
		Map<String,Object> map = new HashMap<>();
		Map<String,String> fmap = new HashMap<>();
		List<ProcessCase> findCityCaseNum = processCaseService.findEveryCityCaseNum(lasj,xzqhdm);
		for(int i=0;i<findCityCaseNum.size();i++) {
			fmap.put("昨日案件总数", findCityCaseNum.get(i).getAjsl()+"");
		}
		List<ProcessCase> findCityCaseNum2 = processCaseService.findEveryCityCaseNum(qtTime,xzqhdm);
		for(int i=0;i<findCityCaseNum2.size();i++) {
			fmap.put("前日案件总数", findCityCaseNum2.get(i).getAjsl()+"");
		}
		String zraj=fmap.get("昨日案件总数");
		int zrajsl=Integer.parseInt(zraj);
		String qraj=fmap.get("前日案件总数");
		int qrajsl=Integer.parseInt(qraj);
		DecimalFormat df = new DecimalFormat("0.000");
		String num = df.format((float) (zrajsl-qrajsl)/qrajsl);
		double d = Double.valueOf(num);
		fmap.put("案件总数环比", d+"");
		
		map.put("ajzshb", fmap);
		return map;
	}
	
}
