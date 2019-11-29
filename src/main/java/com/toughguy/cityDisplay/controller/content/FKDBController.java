package com.toughguy.cityDisplay.controller.content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toughguy.cityDisplay.service.content.prototype.IFKDBService;

@RestController
@RequestMapping("/FKDB")
public class FKDBController {
	
	@Autowired
	private IFKDBService fkdbServiceImpl;

}
