package com.toughguy.cityDisplay.controller.content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toughguy.cityDisplay.service.content.prototype.ICJDBService;

@RestController
@RequestMapping("/CJDB")
public class CJDBController {
	@Autowired
	private ICJDBService cjdbServiceImpl;
}
