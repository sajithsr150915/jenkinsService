
package com.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.service.ManageJenkinsService;


@RestController
public class ManageJenkinsController {
	
	@Autowired(required=true)
	ManageJenkinsService manageJenkinsService;
	
	
	
	
	@GetMapping("/testlastSucessfulbuild")
    public String  jenkinsDetails() 
    {
		
		
		
		return "";
    }
	
	
	
	
	
}