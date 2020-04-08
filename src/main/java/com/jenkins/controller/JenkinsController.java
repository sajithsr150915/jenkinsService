
package com.jenkins.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.service.JenkinsService;


@RestController
public class JenkinsController {
	
	@Autowired(required=true)
	JenkinsService jenkinsService;
	
	
	@GetMapping("/testStatus")
    public String  testStatus() 
    {
		
		
		return "OK";
    }
	
	@GetMapping("/jenkinsDetails")
    public String  jenkinsDetails() 
    {
		
		
	String value= jenkinsService.jenkinsGetAPI();
		
		return value;
    }
	
	@GetMapping("/jenkinsJobNameandStatus")
    public String  jenkinsJobNameandStatus() 
    {
		
		
	String value= jenkinsService.jenkinsJobNameColor();
		
		return value;
    }

	

	@GetMapping("/latestBuildOfJob/{jobName}")
	public String latestBuildOfJob(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.latestBuildOfJob(jobName);

		return value;
	}
	
	@GetMapping("/detailsOfJob/{jobName}")
	public String detailsOfJob(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.detailsOfJob(jobName);

		return value;
	}
	

	@GetMapping("/lastBuildSpecificDetails/{jobName}")
	public String lastBuildSpecificDetails(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.lastBuildSpecificDetails(jobName);

		return value;
	}
	

	@GetMapping("/buildDetailOfJob/{jobName}/{buildNo}")
	public String buildDetailOfJob(@PathVariable("jobName") String jobName,@PathVariable("buildNo") String buildNo) {

		String value = jenkinsService.buildDetailOfJob(jobName,buildNo);

		return value;
	}
	

	@GetMapping("/jobDescription/{jobName}")
	public String jobDescription(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.jobDescription(jobName);

		return value;
	}
	
	
	@GetMapping("/configXML/{jobName}")
	public String configXML(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.configXML(jobName);

		return value;
	}
	
	
	
	
}