package com.toughguy.cityDisplay.controller.content;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toughguy.cityDisplay.model.content.RecJJLXTJB;
import com.toughguy.cityDisplay.model.content.RecJQFLTJB;
import com.toughguy.cityDisplay.pagination.PagerModel;
import com.toughguy.cityDisplay.service.content.prototype.IRecJQFLTJBService;

@RestController
@RequestMapping(value = "/recJQFLTJB")
public class RecJQFLTJBController {
	@Autowired
	private IRecJQFLTJBService recJQFLTJBService;
	/**
	 * 查询接警类型七天全省 （首页）
	 * @param tjTime 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findJQFLNum")
//	@RequiresPermissions("dictXZQHB:getById")
	public List<RecJQFLTJB> findJQFLNum(String tjTime) {
		return  recJQFLTJBService.findJQFLNum(tjTime);
	}
	
	/**
	 * 查询接警类型七天全省总量 （首页）
	 * @param tjTime 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findJQFLNumHJ")
//	@RequiresPermissions("dictXZQHB:getById")
	public Map<String,Object> findJQFLNumHJ(String tjTime) {
		int jjslzs=recJQFLTJBService.findJQFLNumHJ(tjTime);
		List<RecJQFLTJB> list = recJQFLTJBService.findJQFLNum(tjTime);
		Map<String, Object> map = new HashMap<>();
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		Set<String> set3 = new HashSet<>();
		Set<String> set4 = new HashSet<>();
		Set<String> set5 = new HashSet<>();
		Set<String> set6 = new HashSet<>();
		Set<String> set7 = new HashSet<>();
		Set<String> set8 = new HashSet<>();
		Set<String> set9 = new HashSet<>();
		Set<String> set10 = new HashSet<>();
		for(int i =0 ;i<list.size();i++) {
			System.out.println("aaaaaa"+list.get(i).getFldmmc());
			if(list.get(i).getFldmmc()==null&&list.get(i).getFldmmc()==" "&& list.get(i).getFldmmc().equals("")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set10.add("其他警情");
				set10.add(jjsl);
				set10.add(zb);
			}else {
				
			if(list.get(i).getFldmmc().equals("交通类警情")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set1.add("交通类警情");
				set1.add(jjsl);
				set1.add(zb);
			}else if(list.get(i).getFldmmc().equals("行政(治安)警情")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set2.add("行政(治安)警情");
				set2.add(jjsl);
				set2.add(zb);
			}else if(list.get(i).getFldmmc().equals("刑事警情")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set3.add("刑事警情");
				set3.add(jjsl);
				set3.add(zb);
			}else if(list.get(i).getFldmmc().equals("纠纷")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set4.add("纠纷");
				set4.add(jjsl);
				set4.add(zb);
			}else if(list.get(i).getFldmmc().equals("群众求助")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set5.add("群众求助");
				set5.add(jjsl);
				set5.add(zb);
			}else if(list.get(i).getFldmmc().equals("消防救援")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set6.add("消防救援");
				set6.add(jjsl);
				set6.add(zb);
			}else if(list.get(i).getFldmmc().equals("应急联动事件")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set7.add("应急联动事件");
				set7.add(jjsl);
				set7.add(zb);
			}else if(list.get(i).getFldmmc().equals("灾害事故")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set8.add("灾害事故");
				set8.add(jjsl);
				set8.add(zb);
			}else if(list.get(i).getFldmmc().equals("群体事件")){
				DecimalFormat df = new DecimalFormat("0.0000");
				DecimalFormat dft = new DecimalFormat("0.00");
				int one = list.get(i).getJjsl();
				String format = df.format((float) one/jjslzs);
				Double aa = Double.parseDouble(format);
				String zb=dft.format(aa*100)+"";
				String jjsl=one+"";
				set9.add("群体事件");
				set9.add(jjsl);
				set9.add(zb);
			}
			}
			
		}
		map.put("交通类警情", set1);
		map.put("行政(治安)警情", set2);
		map.put("刑事警情", set3);
		map.put("纠纷", set4);
		map.put("群众求助", set5);
		map.put("消防救援", set6);
		map.put("应急联动事件", set7);
		map.put("灾害事故", set8);
		map.put("群体事件", set9);
		map.put("其他警情", set10);
		return map;
		
		
	}
	
	/**
	 * 查询各第二类的警情分类数量（首页今日、昨日、前日）
	 * @param tjTime
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findJQFLsecondNum")
//	@RequiresPermissions("dictXZQHB:getById")
	public List<RecJQFLTJB> findJQFLsecondNum(String tjTime) {
		return  recJQFLTJBService.findJQFLsecondNum(tjTime);
	}
	
	/**
	 * 查询各大类的警情分类数量（二级页面各行政区划今日、昨日、前日）
	 * @param tjTime xzqhdm
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findJQFLNumXZQHHJ")
//	@RequiresPermissions("dictXZQHB:getById")
	public int findJQFLNumXZQHHJ(String tjTime,String xzqhdm) {
		return  recJQFLTJBService.findJQFLNumXZQHHJ(tjTime,xzqhdm);
	}
	
	
	/**
	 * 
	 * 查询各第二类的警情分类数量（二级页面各行政区划今日、昨日、前日）
	 * @param tjTime xzqhdm
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findJQFLsecondNumXZQH")
//	@RequiresPermissions("dictXZQHB:getById")
	public List<RecJQFLTJB> findJQFLsecondNumXZQH(String tjTime,String xzqhdm) {
		return  recJQFLTJBService.findJQFLsecondNumXZQH(tjTime,xzqhdm);
	}
	
	
	
	/**---------------------------------------市级系统-----------------------------------------
	 * 查询各大类的警情分类数量（二级页面各行政区划今日、昨日、前日）
	 * @param tjTime xzqhdm
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findJQFLNumXZQH")
//	@RequiresPermissions("dictXZQHB:getById")
	public List<RecJQFLTJB> findJQFLNumXZQH(String tjTime,String xzqhdm) {
		return  recJQFLTJBService.findJQFLNumXZQH(tjTime,xzqhdm);
	}
	
	
	
	/**
	 * 查询各行政区划各警情分类数量环比（首页右边上+下）
	 * @param tjTime
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findJQFLNumXZQHHB")
//	@RequiresPermissions("dictXZQHB:getById")
	public Map<String,Object> findJQFLNumXZQHHB(String tjTime,String qtTime,String xzqhdm) {
		Map<String,Object> map = new HashMap<>();
		Map<String,String> fmap = new HashMap<>();
		
		List<RecJQFLTJB> findJQFLNumXZQH1 = recJQFLTJBService.findJQFLNumXZQH(tjTime,xzqhdm);			//昨日
		List<RecJQFLTJB> findJQFLNumXZQH2 = recJQFLTJBService.findJQFLNumXZQH(qtTime,xzqhdm);			//前日
		Map<String,String> aa= new HashMap<>();//昨天的
		Map<String,String> bb= new HashMap<>();//前天的
		Map<String,String> cc= new HashMap<>();//昨天环比的
		Map<String,String> dd= new HashMap<>();//昨天环比的
		for(int i=0;i<findJQFLNumXZQH1.size();i++) {
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="刑事警情" || findJQFLNumXZQH1.get(i).getFldmmc().equals("刑事警情")) {
				aa.put("刑事警情", findJQFLNumXZQH1.get(i).getJjsl()+"");
				cc.put("刑事警情环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("刑事警情", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="行政(治安)警情" || findJQFLNumXZQH1.get(i).getFldmmc().equals("行政(治安)警情")) {
				aa.put("行政(治安)警情", findJQFLNumXZQH1.get(i).getJjsl()+"");	
				cc.put("行政(治安)警情环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("行政(治安)警情", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="交通类警情" || findJQFLNumXZQH1.get(i).getFldmmc().equals("交通类警情")) {
				aa.put("交通类警情", findJQFLNumXZQH1.get(i).getJjsl()+"");
				cc.put("交通类警情环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("交通类警情", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="消防救援" || findJQFLNumXZQH1.get(i).getFldmmc().equals("消防救援")) {
				aa.put("消防救援", findJQFLNumXZQH1.get(i).getJjsl()+"");
				cc.put("消防救援环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("消防救援", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="群众求助" || findJQFLNumXZQH1.get(i).getFldmmc().equals("群众求助")) {
				aa.put("群众求助", findJQFLNumXZQH1.get(i).getJjsl()+"");
				cc.put("群众求助环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("群众求助", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="应急联动事件" || findJQFLNumXZQH1.get(i).getFldmmc().equals("应急联动事件")) {
				aa.put("应急联动事件", findJQFLNumXZQH1.get(i).getJjsl()+"");	
				cc.put("应急联动事件环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("应急联动事件", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="群体事件" || findJQFLNumXZQH1.get(i).getFldmmc().equals("群体事件")) {
				aa.put("群体事件", findJQFLNumXZQH1.get(i).getJjsl()+"");
				cc.put("群体事件环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("群体事件", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="纠纷" || findJQFLNumXZQH1.get(i).getFldmmc().equals("纠纷")) {
				aa.put("纠纷", findJQFLNumXZQH1.get(i).getJjsl()+"");	
				cc.put("纠纷环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("纠纷", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="举报" || findJQFLNumXZQH1.get(i).getFldmmc().equals("举报")) {
				aa.put("举报", findJQFLNumXZQH1.get(i).getJjsl()+"");	
				cc.put("举报环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("举报", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
			if(findJQFLNumXZQH1.get(i).getFldmmc()=="投诉监督" || findJQFLNumXZQH1.get(i).getFldmmc().equals("投诉监督")) {
				aa.put("投诉监督", findJQFLNumXZQH1.get(i).getJjsl()+"");
				cc.put("投诉监督环比", findJQFLNumXZQH1.get(i).getHb()+"");
				dd.put("投诉监督", findJQFLNumXZQH1.get(i).getFldm()+"");
			}
		}
		fmap.put("ZT", aa+"");
		fmap.put("ZTHB", cc+"");
		fmap.put("ZTDM", dd+"");
		
		for(int i=0;i<findJQFLNumXZQH2.size();i++) {
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="刑事警情" || findJQFLNumXZQH2.get(i).getFldmmc().equals("刑事警情")) {
				bb.put("刑事警情", findJQFLNumXZQH2.get(i).getJjsl()+"");
			}
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="行政(治安)警情" || findJQFLNumXZQH2.get(i).getFldmmc().equals("行政(治安)警情")) {
				bb.put("行政(治安)警情", findJQFLNumXZQH2.get(i).getJjsl()+"");	
			}
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="交通类警情" || findJQFLNumXZQH2.get(i).getFldmmc().equals("交通类警情")) {
				bb.put("交通类警情", findJQFLNumXZQH2.get(i).getJjsl()+"");	
			}
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="消防救援" || findJQFLNumXZQH2.get(i).getFldmmc().equals("消防救援")) {
				bb.put("消防救援", findJQFLNumXZQH2.get(i).getJjsl()+"");	
			}
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="群众求助" || findJQFLNumXZQH2.get(i).getFldmmc().equals("群众求助")) {
				bb.put("群众求助", findJQFLNumXZQH2.get(i).getJjsl()+"");	
			}
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="应急联动事件" || findJQFLNumXZQH2.get(i).getFldmmc().equals("应急联动事件")) {
				bb.put("应急联动事件", findJQFLNumXZQH2.get(i).getJjsl()+"");	
			}
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="群体事件" || findJQFLNumXZQH2.get(i).getFldmmc().equals("群体事件")) {
				bb.put("群体事件", findJQFLNumXZQH2.get(i).getJjsl()+"");	
			}
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="纠纷" || findJQFLNumXZQH2.get(i).getFldmmc().equals("纠纷")) {
				bb.put("纠纷", findJQFLNumXZQH2.get(i).getJjsl()+"");	
			}
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="举报" || findJQFLNumXZQH2.get(i).getFldmmc().equals("举报")) {
				bb.put("举报", findJQFLNumXZQH2.get(i).getJjsl()+"");	
			}
			if(findJQFLNumXZQH2.get(i).getFldmmc()=="投诉监督" || findJQFLNumXZQH2.get(i).getFldmmc().equals("投诉监督")) {
				bb.put("投诉监督", findJQFLNumXZQH2.get(i).getJjsl()+"");	
			}
		}
		fmap.put("QT", bb+"");
		map.put("jqflsyhb", fmap);//警情分类首页环比
		return map;
	}
	
	
	
	/**
	 * 选择大类进二类页面    二类数量及环比
	 * @param tjTime
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findJQFLsecondNumHB")
//	@RequiresPermissions("dictXZQHB:getById")
	public Map<String,Object> findJQFLsecondNumHB(String tjTime,String qtTime,String xzqhdm,String fldm) {
		Map<String,Object> map = new HashMap<>();
		Map<String,String> fmap = new HashMap<>();
		
		List<RecJQFLTJB> findJQFLsecondNumHB1 = recJQFLTJBService.findJQFLsecondNumHB(tjTime,xzqhdm,fldm);			//昨日
		List<RecJQFLTJB> findJQFLsecondNumHB2 = recJQFLTJBService.findJQFLsecondNumHB(qtTime,xzqhdm,fldm);			//前日
		Map<String,String> aa= new HashMap<>();//昨天的
		Map<String,String> bb= new HashMap<>();//前天的
		Map<String,String> cc= new HashMap<>();//昨天环比的
		Map<String,String> dd= new HashMap<>();//昨天环比的
		if(fldm.equals("010000")){
			for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="危害国家安全" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("危害国家安全")) {
					aa.put("危害国家安全", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("危害国家安全", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("危害国家安全", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="危害公共安全" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("危害公共安全")) {
					aa.put("危害公共安全", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
					cc.put("危害公共安全", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("危害国家安全", findJQFLsecondNumHB1.get(i).getFldm()+"");
					
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="放火" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("放火")) {
					aa.put("放火", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("放火", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("放火", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="爆炸" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("爆炸")) {
					aa.put("爆炸", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("爆炸", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("爆炸", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="劫持" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("劫持")) {
					aa.put("劫持", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("劫持", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("危害国家安全", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="侵犯人身、民主权利" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("侵犯人身、民主权利")) {
					aa.put("侵犯人身、民主权利", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
					cc.put("侵犯人身、民主权利", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("侵犯人身、民主权利", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="杀人" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("杀人")) {
					aa.put("杀人", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("杀人", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("杀人", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="伤害" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("纠纷")) {
					aa.put("伤害", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
					cc.put("伤害", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("伤害", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="强奸" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("强奸")) {
					aa.put("强奸", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
					cc.put("强奸", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("强奸", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="绑架" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("绑架")) {
					aa.put("绑架", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("绑架", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("绑架", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="抢劫" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("抢劫")) {
					aa.put("抢劫", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("抢劫", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("抢劫", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="盗窃" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("盗窃")) {
					aa.put("盗窃", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("盗窃", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("盗窃", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="诈骗" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("诈骗")) {
					aa.put("诈骗", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("诈骗", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("诈骗", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="抢夺" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("抢夺")) {
					aa.put("抢夺", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("抢夺", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("抢夺", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="妨害社会管理秩序" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("妨害社会管理秩序")) {
					aa.put("妨害社会管理秩序", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("妨害社会管理秩序", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("妨害社会管理秩序", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="破坏市场经济秩序" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("破坏市场经济秩序")) {
					aa.put("破坏市场经济秩序", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("破坏市场经济秩序", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("破坏市场经济秩序", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="破坏金融管理秩序" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("破坏金融管理秩序")) {
					aa.put("破坏金融管理秩序", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("破坏金融管理秩序", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("危害国家安全", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="金融诈骗" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("金融诈骗")) {
					aa.put("金融诈骗", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("金融诈骗", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("金融诈骗", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="侵犯财产" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("侵犯财产")) {
					aa.put("侵犯财产", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("侵犯财产", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("侵犯财产", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="破坏环境资源保护" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("破坏环境资源保护")) {
					aa.put("破坏环境资源保护", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("破坏环境资源保护", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("破坏环境资源保护", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他刑事警情" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他刑事警情")) {
					aa.put("其他刑事警情", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("其他刑事警情", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("其他刑事警情", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
		}
		}else if(fldm.equals("020000")){
			for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="扰乱公共秩序" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("危害国家安全")) {
					aa.put("扰乱公共秩序", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("扰乱公共秩序", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("扰乱公共秩序", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="妨害公共安全" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("妨害公共安全")) {
					aa.put("妨害公共安全", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
					cc.put("妨害公共安全", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("妨害公共安全", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="盗窃" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("盗窃")) {
					aa.put("盗窃", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("盗窃", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("盗窃", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="诈骗" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("诈骗")) {
					aa.put("诈骗", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("诈骗", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("诈骗", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="抢夺" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("抢夺")) {
					aa.put("抢夺", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("抢夺", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("危害国家安全", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="侵犯财产权利" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("侵犯财产权利")) {
					aa.put("侵犯财产权利", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
					cc.put("侵犯财产权利", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("侵犯财产权利", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="侵犯人身权利" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("侵犯人身权利")) {
					aa.put("侵犯人身权利", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("侵犯人身权利", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("侵犯人身权利", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="卖淫嫖娼淫秽活动" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("卖淫嫖娼淫秽活动")) {
					aa.put("卖淫嫖娼淫秽活动", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
					cc.put("卖淫嫖娼淫秽活动", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("卖淫嫖娼淫秽活动", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="赌博" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("赌博")) {
					aa.put("赌博", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
					cc.put("赌博", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("赌博", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="毒品" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("毒品")) {
					aa.put("毒品", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("毒品", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("毒品", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="违反出入境管理" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("违反出入境管理")) {
					aa.put("违反出入境管理", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("违反出入境管理", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("违反出入境管理", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="妨害社会管理" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("妨害社会管理")) {
					aa.put("妨害社会管理", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("妨害社会管理", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("妨害社会管理", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
				if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他行政治安警情" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他行政治安警情")) {
					aa.put("其他行政治安警情", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					cc.put("其他行政治安警情", findJQFLsecondNumHB1.get(i).getHb()+"");
					dd.put("其他行政治安警情", findJQFLsecondNumHB1.get(i).getFldm()+"");
				}
		}
			}else if(fldm.equals("030000")){
				for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="交通事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("交通事故")) {
						aa.put("交通事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("交通事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("交通事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="交通违法" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("交通违法")) {
						aa.put("交通违法", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
						cc.put("交通违法", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("交通违法", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="交通设施" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("交通设施")) {
						aa.put("交通设施", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("交通设施", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("交通设施", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="交通秩序" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("交通秩序")) {
						aa.put("交通秩序", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("交通秩序", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("交通秩序", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他交通警情" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他交通警情")) {
						aa.put("其他交通警情", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("其他交通警情", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("其他交通警情", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
			}
				
			}else if(fldm.equals("040000")){
				for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="火灾扑救" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("火灾扑救")) {
						aa.put("火灾扑救", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("火灾扑救", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("火灾扑救", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="灾害事故抢险救援" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("灾害事故抢险救援")) {
						aa.put("灾害事故抢险救援", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
						cc.put("灾害事故抢险救援", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("灾害事故抢险救援", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="社会救援" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("社会救援")) {
						aa.put("社会救援", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("社会救援", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("社会救援", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他消防救援" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他消防救援")) {
						aa.put("其他消防救援", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("其他消防救援", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("其他消防救援", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
			}
			}else if(fldm.equals("050000")){
				for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="人员走失、招领" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("人员走失、招领")) {
						aa.put("人员走失、招领", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("人员走失、招领", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("人员走失、招领", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="人员遇险遇困" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("人员遇险遇困")) {
						aa.put("人员遇险遇困", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
						cc.put("人员遇险遇困", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("人员遇险遇困", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="意外伤亡" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("意外伤亡")) {
						aa.put("意外伤亡", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("意外伤亡", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("意外伤亡", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="开锁" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("开锁")) {
						aa.put("开锁", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("开锁", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("开锁", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="遗失物品" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("遗失物品")) {
						aa.put("遗失物品", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("遗失物品", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("遗失物品", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="水、电、气、热险情" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("水、电、气、热险情")) {
						aa.put("水、电、气、热险情", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("水、电、气、热险情", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("水、电、气、热险情", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="危机病人" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("危机病人")) {
						aa.put("危机病人", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("危机病人", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("危机病人", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="自杀" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("自杀")) {
						aa.put("自杀", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("自杀", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("自杀", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="噪音扰民" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("噪音扰民")) {
						aa.put("噪音扰民", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("噪音扰民", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("噪音扰民", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他群众求助" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他群众求助")) {
						aa.put("其他群众求助", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("其他群众求助", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("其他群众求助", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
			}
			}else if(fldm.equals("060000")){
				for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="卫生医疗" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("卫生医疗")) {
						aa.put("卫生医疗", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("卫生医疗", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("卫生医疗", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="电力抢修" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("电力抢修")) {
						aa.put("电力抢修", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
						cc.put("电力抢修", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("电力抢修", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="劳动保障" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("劳动保障")) {
						aa.put("劳动保障", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("劳动保障", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("劳动保障", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="林水管理" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("林水管理")) {
						aa.put("林水管理", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("林水管理", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("林水管理", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="工商管理" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("工商管理")) {
						aa.put("工商管理", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("工商管理", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("工商管理", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="城管执法" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("城管执法")) {
						aa.put("城管执法", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("城管执法", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("城管执法", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="通信抢修" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("通信抢修")) {
						aa.put("通信抢修", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("通信抢修", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("通信抢修", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="文广管理" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("文广管理")) {
						aa.put("文广管理", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("文广管理", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("文广管理", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="环保执法" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("环保执法")) {
						aa.put("环保执法", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("环保执法", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("环保执法", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="质量监督" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("质量监督")) {
						aa.put("质量监督", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("质量监督", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("质量监督", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="烟草案件" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("烟草案件")) {
						aa.put("烟草案件", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("烟草案件", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("烟草案件", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="民政求助" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("民政求助")) {
						aa.put("民政求助", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("民政求助", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("民政求助", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="水气热抢修" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("水气热抢修")) {
						aa.put("水气热抢修", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("水气热抢修", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("水气热抢修", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="食品药品管理" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("食品药品管理")) {
						aa.put("食品药品管理", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("食品药品管理", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("食品药品管理", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="安全生产监督" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("安全生产监督")) {
						aa.put("安全生产监督", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("安全生产监督", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("安全生产监督", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="园文旅游管理" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("园文旅游管理")) {
						aa.put("园文旅游管理", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("园文旅游管理", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("园文旅游管理", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="市民热线" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("市民热线")) {
						aa.put("市民热线", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("市民热线", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("市民热线", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="协助联动单位" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("协助联动单位")) {
						aa.put("协助联动单位", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("协助联动单位", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("协助联动单位", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他应急联动" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他应急联动")) {
						aa.put("其他应急联动", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("其他应急联动", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("其他应急联动", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
			}
			}else if(fldm.equals("070000")){
				for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="聚众上访" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("聚众上访")) {
						aa.put("聚众上访", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("聚众上访", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("聚众上访", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="聚众械斗" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("聚众械斗")) {
						aa.put("聚众械斗", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
						cc.put("聚众械斗", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("聚众械斗", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="聚众滋事" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("聚众滋事")) {
						aa.put("聚众滋事", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("聚众滋事", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("聚众滋事", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="罢工罢课罢市" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("罢工罢课罢市")) {
						aa.put("罢工罢课罢市", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("罢工罢课罢市", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("罢工罢课罢市", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="工商管理" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("工商管理")) {
						aa.put("工商管理", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("工商管理", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("工商管理", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="请愿静坐" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("请愿静坐")) {
						aa.put("请愿静坐", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("请愿静坐", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("请愿静坐", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="聚众阻塞交通" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("聚众阻塞交通")) {
						aa.put("聚众阻塞交通", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("聚众阻塞交通", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("聚众阻塞交通", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="聚众围堵冲击" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("聚众围堵冲击")) {
						aa.put("聚众围堵冲击", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("聚众围堵冲击", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("聚众围堵冲击", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="非法集会游行示威" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("非法集会游行示威")) {
						aa.put("非法集会游行示威", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("非法集会游行示威", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("非法集会游行示威", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他群体事件" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他群体事件")) {
						aa.put("其他群体事件", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("其他群体事件", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("其他群体事件", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					
			}
			}else if(fldm.equals("080000")){
				for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="交通纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("交通纠纷")) {
						aa.put("交通纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("交通纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("交通纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="家庭婚恋纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("家庭婚恋纠纷")) {
						aa.put("家庭婚恋纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
						cc.put("家庭婚恋纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("家庭婚恋纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="邻里纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("邻里纠纷")) {
						aa.put("邻里纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("邻里纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("邻里纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="消费纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("消费纠纷")) {
						aa.put("消费纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("消费纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("消费纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="劳务、劳资纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("劳务、劳资纠纷")) {
						aa.put("劳务、劳资纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("劳务、劳资纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("劳务、劳资纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="请愿静坐" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("请愿静坐")) {
						aa.put("请愿静坐", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("请愿静坐", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("请愿静坐", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="经济纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("经济纠纷")) {
						aa.put("经济纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("经济纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("经济纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="医疗纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("医疗纠纷")) {
						aa.put("医疗纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("医疗纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("医疗纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="征地拆迁纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("征地拆迁纠纷")) {
						aa.put("征地拆迁纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("征地拆迁纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("征地拆迁纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="租赁纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("租赁纠纷")) {
						aa.put("租赁纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("租赁纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("租赁纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="陆上水域权属纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("陆上水域权属纠纷")) {
						aa.put("陆上水域权属纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("陆上水域权属纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("陆上水域权属纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="执法纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("执法纠纷")) {
						aa.put("执法纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("执法纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("执法纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他纠纷" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他纠纷")) {
						aa.put("其他纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("其他纠纷", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("其他纠纷", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					
			}
			}else if(fldm.equals("090000")){
				for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="劳动生产事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("劳动生产事故")) {
						aa.put("劳动生产事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("劳动生产事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("劳动生产事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="危化物品事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("危化物品事故")) {
						aa.put("危化物品事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
						cc.put("危化物品事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("危化物品事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="中毒事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("中毒事故")) {
						aa.put("中毒事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("中毒事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("中毒事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="爆炸事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("爆炸事故")) {
						aa.put("爆炸事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("爆炸事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("爆炸事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="沉船事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("沉船事故")) {
						aa.put("沉船事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("沉船事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("沉船事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="挤压踩踏事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("挤压踩踏事故")) {
						aa.put("挤压踩踏事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("挤压踩踏事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("挤压踩踏事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="建筑坍塌事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("建筑坍塌事故")) {
						aa.put("建筑坍塌事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("建筑坍塌事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("建筑坍塌事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="自然灾害事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("自然灾害事故")) {
						aa.put("自然灾害事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("自然灾害事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("自然灾害事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="疫情事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("疫情事故")) {
						aa.put("疫情事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("疫情事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("疫情事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他灾害事故" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他灾害事故")) {
						aa.put("其他灾害事故", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("其他灾害事故", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("其他灾害事故", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					
			}
			}else if(fldm.equals("100000")){
				System.out.println("哈哈哈哈"+fldm);
				System.out.println("AAAA"+findJQFLsecondNumHB1);
				for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="涉赌线索" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("涉赌线索")) {
						aa.put("涉赌线索", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("涉赌线索", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("涉赌线索", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
				
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="涉黄线索" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("涉黄线索")) {
						aa.put("涉黄线索", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
						cc.put("涉黄线索", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("涉黄线索", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="涉毒线索" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("涉毒线索")) {
						aa.put("涉毒线索", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("涉毒线索", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("涉毒线索", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="涉枪涉爆线索" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("涉枪涉爆线索")) {
						aa.put("涉枪涉爆线索", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("涉枪涉爆线索", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("涉枪涉爆线索", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="涉境外人员违法线索" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("涉境外人员违法线索")) {
						aa.put("涉境外人员违法线索", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("涉境外人员违法线索", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("涉境外人员违法线索", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="涉恐线索" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("涉恐线索")) {
						aa.put("涉恐线索", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("涉恐线索", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("涉恐线索", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="法轮功等邪教、非法宗教活动" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("法轮功等邪教、非法宗教活动")) {
						aa.put("法轮功等邪教、非法宗教活动", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("法轮功等邪教、非法宗教活动", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("法轮功等邪教、非法宗教活动", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="违反治安管理的经营活动" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("违反治安管理的经营活动")) {
						aa.put("违反治安管理的经营活动", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("违反治安管理的经营活动", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("违反治安管理的经营活动", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="可疑物品" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("可疑物品")) {
						aa.put("可疑物品", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("可疑物品", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("可疑物品", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="嫌疑、可疑人员或违法活动" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("嫌疑、可疑人员或违法活动")) {
						aa.put("嫌疑、可疑人员或违法活动", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("嫌疑、可疑人员或违法活动", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("嫌疑、可疑人员或违法活动", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="无名尸体" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("无名尸体")) {
						aa.put("无名尸体", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("无名尸体", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("无名尸体", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="传销活动" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("传销活动")) {
						aa.put("传销活动", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("传销活动", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("传销活动", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="举报反动宣传" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("举报反动宣传")) {
						aa.put("举报反动宣传", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("举报反动宣传", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("举报反动宣传", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="举报诈骗信息" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("举报诈骗信息")) {
						aa.put("举报诈骗信息", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("举报诈骗信息", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("举报诈骗信息", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他举报线索" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他举报线索")) {
						aa.put("其他举报线索", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("其他举报线索", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("其他举报线索", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
				}
			}else if(fldm.equals("110000")){
				for(int i=0;i<findJQFLsecondNumHB1.size();i++) {
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="违法违纪" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("违法违纪")) {
						aa.put("违法违纪", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("违法违纪", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("违法违纪", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="执法不当" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("执法不当")) {
						aa.put("执法不当", findJQFLsecondNumHB1.get(i).getJjsl()+"");	
						cc.put("执法不当", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("执法不当", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="不作为" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("不作为")) {
						aa.put("不作为", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("不作为", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("不作为", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="工作作风" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("工作作风")) {
						aa.put("工作作风", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("工作作风", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("工作作风", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="出警缓慢" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("出警缓慢")) {
						aa.put("出警缓慢", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("出警缓慢", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("出警缓慢", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
					if(findJQFLsecondNumHB1.get(i).getFldmmc()=="其他投诉监督" || findJQFLsecondNumHB1.get(i).getFldmmc().equals("其他投诉监督")) {
						aa.put("其他投诉监督", findJQFLsecondNumHB1.get(i).getJjsl()+"");
						cc.put("其他投诉监督", findJQFLsecondNumHB1.get(i).getHb()+"");
						dd.put("其他投诉监督", findJQFLsecondNumHB1.get(i).getFldm()+"");
					}
				}
			}
		fmap.put("ZT", aa+"");
		fmap.put("ZTHB", cc+"");
		fmap.put("ZTDM", dd+"");
		if(fldm.equals("010000")){
			for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="危害国家安全" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("危害国家安全")) {
					bb.put("危害国家安全", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="危害公共安全" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("危害公共安全")) {
					bb.put("危害公共安全", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="放火" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("放火")) {
					bb.put("放火", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="爆炸" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("爆炸")) {
					bb.put("爆炸", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="劫持" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("劫持")) {
					bb.put("劫持", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="侵犯人身、民主权利" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("侵犯人身、民主权利")) {
					bb.put("侵犯人身、民主权利", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="杀人" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("杀人")) {
					bb.put("杀人", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="伤害" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("纠纷")) {
					bb.put("伤害", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="强奸" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("强奸")) {
					bb.put("强奸", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="绑架" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("绑架")) {
					bb.put("绑架", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="抢劫" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("抢劫")) {
					bb.put("抢劫", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="盗窃" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("盗窃")) {
					bb.put("盗窃", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="诈骗" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("诈骗")) {
					bb.put("诈骗", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="抢夺" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("抢夺")) {
					bb.put("抢夺", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="妨害社会管理秩序" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("妨害社会管理秩序")) {
					bb.put("妨害社会管理秩序", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="破坏市场经济秩序" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("破坏市场经济秩序")) {
					bb.put("破坏市场经济秩序", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="破坏金融管理秩序" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("破坏金融管理秩序")) {
					bb.put("破坏金融管理秩序", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="金融诈骗" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("金融诈骗")) {
					bb.put("金融诈骗", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="侵犯财产" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("侵犯财产")) {
					bb.put("侵犯财产", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="破坏环境资源保护" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("破坏环境资源保护")) {
					bb.put("破坏环境资源保护", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他刑事警情" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他刑事警情")) {
					bb.put("其他刑事警情", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
		}
		}else if(fldm.equals("020000")){
			for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="扰乱公共秩序" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("危害国家安全")) {
					bb.put("扰乱公共秩序", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="妨害公共安全" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("妨害公共安全")) {
					bb.put("妨害公共安全", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="盗窃" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("盗窃")) {
					bb.put("盗窃", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="诈骗" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("诈骗")) {
					bb.put("诈骗", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="抢夺" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("抢夺")) {
					bb.put("抢夺", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="侵犯财产权利" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("侵犯财产权利")) {
					bb.put("侵犯财产权利", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="侵犯人身权利" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("侵犯人身权利")) {
					bb.put("侵犯人身权利", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="卖淫嫖娼淫秽活动" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("卖淫嫖娼淫秽活动")) {
					bb.put("卖淫嫖娼淫秽活动", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="赌博" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("赌博")) {
					bb.put("赌博", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="毒品" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("毒品")) {
					bb.put("毒品", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="违反出入境管理" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("违反出入境管理")) {
					bb.put("违反出入境管理", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="妨害社会管理" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("妨害社会管理")) {
					bb.put("妨害社会管理", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
				if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他行政治安警情" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他行政治安警情")) {
					bb.put("其他行政治安警情", findJQFLsecondNumHB2.get(i).getJjsl()+"");
				}
		}
			}else if(fldm.equals("030000")){
				for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="交通事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("交通事故")) {
						bb.put("交通事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="交通违法" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("交通违法")) {
						bb.put("交通违法", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="交通设施" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("交通设施")) {
						bb.put("交通设施", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="交通秩序" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("交通秩序")) {
						bb.put("交通秩序", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他交通警情" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他交通警情")) {
						bb.put("其他交通警情", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
			}
				
			}else if(fldm.equals("040000")){
				for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="火灾扑救" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("火灾扑救")) {
						bb.put("火灾扑救", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="灾害事故抢险救援" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("灾害事故抢险救援")) {
						bb.put("灾害事故抢险救援", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="社会救援" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("社会救援")) {
						bb.put("社会救援", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他消防救援" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他消防救援")) {
						bb.put("其他消防救援", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
			}
			}else if(fldm.equals("050000")){
				for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="人员走失、招领" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("人员走失、招领")) {
						bb.put("人员走失、招领", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="人员遇险遇困" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("人员遇险遇困")) {
						bb.put("人员遇险遇困", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="意外伤亡" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("意外伤亡")) {
						bb.put("意外伤亡", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="开锁" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("开锁")) {
						bb.put("开锁", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="遗失物品" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("遗失物品")) {
						bb.put("遗失物品", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="水、电、气、热险情" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("水、电、气、热险情")) {
						bb.put("水、电、气、热险情", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="危机病人" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("危机病人")) {
						bb.put("危机病人", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="自杀" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("自杀")) {
						bb.put("自杀", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="噪音扰民" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("噪音扰民")) {
						bb.put("噪音扰民", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他群众求助" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他群众求助")) {
						bb.put("其他群众求助", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
			}
			}else if(fldm.equals("060000")){
				for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="卫生医疗" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("卫生医疗")) {
						bb.put("卫生医疗", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="电力抢修" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("电力抢修")) {
						bb.put("电力抢修", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="劳动保障" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("劳动保障")) {
						bb.put("劳动保障", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="林水管理" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("林水管理")) {
						bb.put("林水管理", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="工商管理" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("工商管理")) {
						bb.put("工商管理", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="城管执法" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("城管执法")) {
						bb.put("城管执法", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="通信抢修" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("通信抢修")) {
						bb.put("通信抢修", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="文广管理" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("文广管理")) {
						bb.put("文广管理", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="环保执法" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("环保执法")) {
						bb.put("环保执法", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="质量监督" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("质量监督")) {
						bb.put("质量监督", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="烟草案件" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("烟草案件")) {
						bb.put("烟草案件", findJQFLsecondNumHB2.get(i).getJjsl()+"");
						bb.put("烟草案件", findJQFLsecondNumHB2.get(i).getHb()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="民政求助" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("民政求助")) {
						bb.put("民政求助", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="水气热抢修" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("水气热抢修")) {
						bb.put("水气热抢修", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="食品药品管理" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("食品药品管理")) {
						bb.put("食品药品管理", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="安全生产监督" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("安全生产监督")) {
						bb.put("安全生产监督", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="园文旅游管理" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("园文旅游管理")) {
						bb.put("园文旅游管理", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="市民热线" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("市民热线")) {
						bb.put("市民热线", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="协助联动单位" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("协助联动单位")) {
						bb.put("协助联动单位", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他应急联动" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他应急联动")) {
						bb.put("其他应急联动", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
			}
			}else if(fldm.equals("070000")){
				for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="聚众上访" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("聚众上访")) {
						bb.put("聚众上访", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="聚众械斗" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("聚众械斗")) {
						bb.put("聚众械斗", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="聚众滋事" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("聚众滋事")) {
						bb.put("聚众滋事", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="罢工罢课罢市" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("罢工罢课罢市")) {
						bb.put("罢工罢课罢市", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="工商管理" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("工商管理")) {
						bb.put("工商管理", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="请愿静坐" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("请愿静坐")) {
						bb.put("请愿静坐", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="聚众阻塞交通" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("聚众阻塞交通")) {
						bb.put("聚众阻塞交通", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="聚众围堵冲击" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("聚众围堵冲击")) {
						bb.put("聚众围堵冲击", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="非法集会游行示威" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("非法集会游行示威")) {
						bb.put("非法集会游行示威", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他群体事件" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他群体事件")) {
						bb.put("其他群体事件", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					
			}
			}else if(fldm.equals("080000")){
				for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="交通纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("交通纠纷")) {
						bb.put("交通纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="家庭婚恋纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("家庭婚恋纠纷")) {
						bb.put("家庭婚恋纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="邻里纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("邻里纠纷")) {
						bb.put("邻里纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="消费纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("消费纠纷")) {
						bb.put("消费纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="劳务、劳资纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("劳务、劳资纠纷")) {
						bb.put("劳务、劳资纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="请愿静坐" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("请愿静坐")) {
						bb.put("请愿静坐", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="经济纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("经济纠纷")) {
						bb.put("经济纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="医疗纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("医疗纠纷")) {
						bb.put("医疗纠纷", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="征地拆迁纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("征地拆迁纠纷")) {
						bb.put("征地拆迁纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="租赁纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("租赁纠纷")) {
						bb.put("租赁纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="陆上水域权属纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("陆上水域权属纠纷")) {
						bb.put("陆上水域权属纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="执法纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("执法纠纷")) {
						bb.put("执法纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他纠纷" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他纠纷")) {
						bb.put("其他纠纷", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					
			}
			}else if(fldm.equals("090000")){
				for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="劳动生产事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("劳动生产事故")) {
						bb.put("劳动生产事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="危化物品事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("危化物品事故")) {
						bb.put("危化物品事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="中毒事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("中毒事故")) {
						bb.put("中毒事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="爆炸事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("爆炸事故")) {
						bb.put("爆炸事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="沉船事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("沉船事故")) {
						bb.put("沉船事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="挤压踩踏事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("挤压踩踏事故")) {
						bb.put("挤压踩踏事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="建筑坍塌事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("建筑坍塌事故")) {
						bb.put("建筑坍塌事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="自然灾害事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("自然灾害事故")) {
						bb.put("自然灾害事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="疫情事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("疫情事故")) {
						bb.put("疫情事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他灾害事故" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他灾害事故")) {
						bb.put("其他灾害事故", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					
			}
			}else if(fldm.equals("100000")){
				for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="涉赌线索" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("涉赌线索")) {
						bb.put("涉赌线索", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="涉黄线索" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("涉黄线索")) {
						bb.put("涉黄线索", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="涉毒线索" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("涉毒线索")) {
						bb.put("涉毒线索", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="涉枪涉爆线索" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("涉枪涉爆线索")) {
						bb.put("涉枪涉爆线索", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="涉境外人员违法线索" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("涉境外人员违法线索")) {
						bb.put("涉境外人员违法线索", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="涉恐线索" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("涉恐线索")) {
						bb.put("涉恐线索", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="法轮功等邪教、非法宗教活动" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("法轮功等邪教、非法宗教活动")) {
						bb.put("法轮功等邪教、非法宗教活动", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="违反治安管理的经营活动" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("违反治安管理的经营活动")) {
						bb.put("违反治安管理的经营活动", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="可疑物品" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("可疑物品")) {
						bb.put("可疑物品", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="嫌疑、可疑人员或违法活动" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("嫌疑、可疑人员或违法活动")) {
						bb.put("嫌疑、可疑人员或违法活动", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="无名尸体" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("嫌疑、可疑人员或违法活动")) {
						bb.put("无名尸体", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="传销活动" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("传销活动")) {
						bb.put("传销活动", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="举报反动宣传" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("举报反动宣传")) {
						bb.put("举报反动宣传", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="举报诈骗信息" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("举报诈骗信息")) {
						bb.put("举报诈骗信息", findJQFLsecondNumHB1.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他举报线索" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他举报线索")) {
						bb.put("其他举报线索", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
				}
			}else if(fldm.equals("110000")){
				for(int i=0;i<findJQFLsecondNumHB2.size();i++) {
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="违法违纪" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("违法违纪")) {
						bb.put("违法违纪", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="执法不当" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("执法不当")) {
						bb.put("执法不当", findJQFLsecondNumHB2.get(i).getJjsl()+"");	
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="不作为" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("不作为")) {
						bb.put("不作为", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="工作作风" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("工作作风")) {
						bb.put("工作作风", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="出警缓慢" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("出警缓慢")) {
						bb.put("出警缓慢", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
					if(findJQFLsecondNumHB2.get(i).getFldmmc()=="其他投诉监督" || findJQFLsecondNumHB2.get(i).getFldmmc().equals("其他投诉监督")) {
						bb.put("其他投诉监督", findJQFLsecondNumHB2.get(i).getJjsl()+"");
					}
				}
			}
		fmap.put("QT", bb+"");
		map.put("jqflschb", fmap);//警情分类二级环比
		return map;
	}
	
}


